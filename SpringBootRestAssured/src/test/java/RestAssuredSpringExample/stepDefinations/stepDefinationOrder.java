package RestAssuredSpringExample.stepDefinations;

import RestAssuredSpringExample.stepDefinationHelper.stepDefinationHelperOrder;
import RestAssuredSpringExample.stepDefinationHelper.stepDefinationHelperPet;
import app.application;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;

@EnableAutoConfiguration
public class stepDefinationOrder extends application {

    @Autowired
    stepDefinationHelperOrder stepdeforder;


    @Given("^Order details for ordering pet$")
    public void order_details_for_ordering_pet(DataTable dataTable) throws Throwable {
      stepdeforder.CreateOrder(dataTable.asMap(String.class,String.class));
    }

    @Given("^Prepare POST request for placing order for pet$")
    public void prepare_POST_request_for_placing_order_for_pet() throws Throwable {
       stepdeforder.createOrderRequest();
    }

    @When("^POST request is sent to place an order$")
    public void post_request_is_sent_to_place_an_order() throws Throwable {
        stepdeforder.createPostOrderRequest();
    }
}
