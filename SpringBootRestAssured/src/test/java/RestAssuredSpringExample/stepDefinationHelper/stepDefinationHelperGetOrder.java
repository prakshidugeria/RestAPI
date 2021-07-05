package RestAssuredSpringExample.stepDefinationHelper;

import RestAssuredSpringExample.RequestResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class stepDefinationHelperGetOrder extends CommonHelper {
    @Autowired
    RequestResponse requestResponse;

    @Autowired
    stepDefinationHelperOrder stepdeforder;

    static int orderId;


    public boolean prepareOrderGetRequest() {
        try {
            RequestSpecification request = RestAssured.given()
                    .baseUri("https://petstore.swagger.io/v2").header("Content-Type","application/json");

            requestResponse.setRequestSpecification(request);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public boolean sendOrderGetRequest() throws JsonProcessingException {
        try {
            orderId = stepdeforder.getOrder().getId();
            Response response = requestResponse.getRequestSpecification().when().get("/store/order/"+orderId+"");
            this.requestResponse.setResponse(response);
            System.out.println(response.getBody().asString());
            return response.getStatusCode() == HttpStatus.SC_OK;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }

}
