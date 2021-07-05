package RestAssuredSpringExample.stepDefinationHelper;

import RestAssuredSpringExample.Pet;
import RestAssuredSpringExample.RequestResponse;
import RestAssuredSpringExample.category;
import RestAssuredSpringExample.tags;
import Utils.CommonUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class stepDefinationHelperPetUpdate extends CommonHelper {
    Pet pet;
    @Autowired
    RequestResponse requestResponse;


    public Pet getPet() {
        return pet;
    }

    public void createPetDetailsforUpdate(Map<String, String> asMap) {
        this.pet = new Pet();
        category category = new category(CommonUtils.generateRandomId(), asMap.get("category"));
        tags tag = new tags(category.getId(), asMap.get("updatedname"));
        tags[] tags = new tags[]{tag};
        pet.setPhotoUrls(new String[]{});
        pet.setTags(tags);
        pet.setCategory(category);
        pet.setId(category.getId());
        pet.setName(asMap.get("updatedname"));
        pet.setStatus(asMap.get("status"));
        System.out.println(pet.getId());
    }

    public boolean preparePutRequest() {
        try {
            RequestSpecification request = RestAssured.given()
                    .header("Content-Type", "application/json").baseUri("https://petstore.swagger.io/v2");
            requestResponse.setRequestSpecification(request);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public boolean sendPutRequest() throws JsonProcessingException {
        try {
            String payload = new ObjectMapper().writeValueAsString(this.pet);
            requestResponse.getRequestSpecification().body(payload);

            Response response = requestResponse.getRequestSpecification().basePath("/pet").put();
            this.requestResponse.setResponse(response);
            return response.getStatusCode() == HttpStatus.SC_OK;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }


    public boolean verifyPetUpdatedSuccessfully() {
        try {
            ResponseBody response = this.requestResponse.getResponse().getBody();
            String res = response.asString();
            JsonPath js = new JsonPath(res);
            if(js.get("name").equals(pet.getName())){
                System.out.println(res);
                return true;
            } else {
                return false;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
