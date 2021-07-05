package RestAssuredSpringExample.stepDefinations;

import RestAssuredSpringExample.stepDefinationHelper.stepDefinationHelperGet;
import RestAssuredSpringExample.stepDefinationHelper.stepDefinationHelperPetUpdate;
import app.application;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
public class stepDefinationPutPet extends application {

    @Autowired
    stepDefinationHelperPetUpdate stepdefupdatepet;

    @Given("^pet entry is created with updated details$")
    public void pet_entry_is_created_with_updated_details(DataTable dataTable) throws Throwable {
        stepdefupdatepet.createPetDetailsforUpdate(dataTable.asMap(String.class,String.class));
    }

    @Given("^Prepare PUT request for creating new Pet$")
    public void prepare_PUT_request_for_creating_new_Pet() throws Throwable {
        stepdefupdatepet.preparePutRequest();

    }

    @When("^PUT request is sent to create Pet endpoint$")
    public void put_request_is_sent_to_create_Pet_endpoint() throws Throwable {
        stepdefupdatepet.sendPutRequest();
    }

    @Then("^Details should be update successfully$")
    public void details_should_be_update_successfully() throws Throwable {
        stepdefupdatepet.verifyPetUpdatedSuccessfully();
    }
}