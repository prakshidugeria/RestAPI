package RestAssuredSpringExample.stepDefinations;

import RestAssuredSpringExample.stepDefinationHelper.stepDefinationHelperGet;
import app.application;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
public class stepDefinationGetPet extends application {

    @Autowired
    stepDefinationHelperGet stepdefget;

    @Given("^Prepare GET request for getting pet info$")
    public void prepare_get_request_for_getting_pet_info() throws Throwable {
       stepdefget.prepareGetRequest();
    }

    @When("^GET request is sent to get the info$")
    public void get_request_is_sent_to_get_the_info() throws Throwable {
        stepdefget.sendGetRequest();
    }
}
