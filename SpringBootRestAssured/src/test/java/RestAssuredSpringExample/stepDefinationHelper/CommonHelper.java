package RestAssuredSpringExample.stepDefinationHelper;

import RestAssuredSpringExample.RequestResponse;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommonHelper {

    @Autowired
    RequestResponse requestResponse;

    public boolean validateResponseCode(String expectedResponseCode) {
        return this.requestResponse.getResponse().getStatusCode() ==
                Integer.parseInt(expectedResponseCode);
    }

}
