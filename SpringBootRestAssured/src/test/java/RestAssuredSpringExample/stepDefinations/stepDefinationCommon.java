package RestAssuredSpringExample.stepDefinations;

import RestAssuredSpringExample.stepDefinationHelper.CommonHelper;
import app.application;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
public class stepDefinationCommon extends application {

    @Autowired
    CommonHelper commonHelper;

    @Then("^\"([^\"]*)\" should be returned$")
    public void shouldBeReturned(String expectedResCode) throws Throwable {
        Assert.assertTrue(commonHelper.validateResponseCode(expectedResCode));
    }
}