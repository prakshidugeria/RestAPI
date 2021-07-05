package RestAssuredSpringExample.stepDefinationHelper;

import RestAssuredSpringExample.Order;
import RestAssuredSpringExample.RequestResponse;
import Utils.CommonUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Map;

@Component
public class stepDefinationHelperOrder {

    Order order;

    public Order getOrder()
    {
        return order;
    }

    @Autowired
    RequestResponse requestResponse;

    @Autowired
    stepDefinationHelperPet stepDefinationHelperPet;

    public void CreateOrder(Map<String, String> asMap)
    {
        this.order = new Order();
        order.setId(CommonUtils.generateRandomId());
        order.setPetId(stepDefinationHelperPet.getPet().getId());
        order.setQuantity(Integer.parseInt(asMap.get("quantity")));
        order.setStatus(asMap.get("status"));
        order.setComplete(true);
        order.setShipDate(ZonedDateTime.now(ZoneOffset.UTC).toInstant().toString());
    }

    public void createOrderRequest()
    {
        try {
            RequestSpecification request = RestAssured.given().header("Content-Type","application/json")
                    .baseUri("https://petstore.swagger.io/v2");
            this.requestResponse.setRequestSpecification(request);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createPostOrderRequest() throws JsonProcessingException {
        String payload = new ObjectMapper().writeValueAsString(this.order);
         this.requestResponse.getRequestSpecification().body(payload);
        Response response = this.requestResponse.getRequestSpecification().basePath("/store/order").post();
        this.requestResponse.setResponse(response);
    }
}
