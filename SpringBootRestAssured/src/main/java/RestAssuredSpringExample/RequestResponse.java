package RestAssuredSpringExample;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.springframework.stereotype.Component;

@Component
public class RequestResponse {

    private RequestSpecification requestSpecification;
    private Response response;

    public RequestSpecification getRequestSpecification() {
        return requestSpecification;
    }

    public void setRequestSpecification(RequestSpecification requestSpecification) {
        this.requestSpecification = requestSpecification;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }


}
