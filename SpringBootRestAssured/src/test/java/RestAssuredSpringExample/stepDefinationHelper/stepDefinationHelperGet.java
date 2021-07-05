package RestAssuredSpringExample.stepDefinationHelper;

import RestAssuredSpringExample.Pet;
import RestAssuredSpringExample.RequestResponse;
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

@Component
public class stepDefinationHelperGet extends CommonHelper {
    @Autowired
    RequestResponse requestResponse;

    @Autowired
    stepDefinationHelperPet stepdefpet;

    static int petId;


    public boolean prepareGetRequest() {
        try {
            RequestSpecification request = RestAssured.given()
                    .baseUri("https://petstore.swagger.io/v2").header("Content-Type","application/json");

            requestResponse.setRequestSpecification(request);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public boolean sendGetRequest() throws JsonProcessingException {
        try {
            petId = stepdefpet.getPet().getId();
            Response response = requestResponse.getRequestSpecification().when().get("/pet/"+petId+"");
            this.requestResponse.setResponse(response);
            System.out.println(response.getBody().asString());
            return response.getStatusCode() == HttpStatus.SC_OK;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

}
