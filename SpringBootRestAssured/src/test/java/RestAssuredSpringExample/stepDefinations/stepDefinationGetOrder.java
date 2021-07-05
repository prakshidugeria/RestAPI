package RestAssuredSpringExample.stepDefinations;

import RestAssuredSpringExample.stepDefinationHelper.stepDefinationHelperGetOrder;
import app.application;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
public class stepDefinationGetOrder extends application {

    @Autowired
    stepDefinationHelperGetOrder stepdefgetorder;

    @Given("^Get Order details for order placed$")
    public void get_order_details_for_order_placed() throws Throwable {
        stepdefgetorder.prepareOrderGetRequest();
    }

    @And("^POST GET request for getting order info$")
    public void post_get_request_for_getting_order_info() throws Throwable {
        stepdefgetorder.sendOrderGetRequest();
    }
}
