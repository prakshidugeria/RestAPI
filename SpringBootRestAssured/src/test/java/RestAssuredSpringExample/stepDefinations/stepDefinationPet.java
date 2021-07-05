package RestAssuredSpringExample.stepDefinations;

import RestAssuredSpringExample.stepDefinationHelper.stepDefinationHelperPet;
import app.application;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration


public class stepDefinationPet extends application {
    @Autowired
    stepDefinationHelperPet helperPet = new stepDefinationHelperPet();

    @Given("^Create Pet entry that should be added to store with following attributes$")
    public void create_Pet_entry_that_should_be_added_to_store_with_following_attributes(DataTable dataTable) throws Throwable {
        helperPet.createPet(dataTable.asMap(String.class,String.class));
    }

    @Given("^Prepare POST request for creating new Pet$")
    public void prepare_POST_request_for_creating_new_Pet() throws Throwable {
      Assert.assertTrue(helperPet.preparePostRequest());
    }

    @When("^POST request is sent to create Pet endpoint$")
    public void post_request_is_sent_to_create_Pet_endpoint() throws Throwable {
        Assert.assertTrue(helperPet.sendPostRequest());
    }

    @Then("^Pet should be successfully created$")
    public void pet_should_be_successfully_created() throws Throwable {
        Assert.assertTrue(helperPet.verifyPetCreatedSuccessfully());
    }
}
