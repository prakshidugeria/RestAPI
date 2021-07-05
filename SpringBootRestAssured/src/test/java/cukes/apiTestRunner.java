package cukes;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumber;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(ExtendedCucumber.class)
@ExtendedCucumberOptions(
        jsonReport = "target/cucumber-reports/CucumberTestReport.json",
        detailedReport = true,
        detailedAggregatedReport = true,
        overviewReport = true,
        coverageReport = true,
        jsonUsageReport = "target/cucumber-reports/cucumber-usage.json",
        outputFolder = "target/cucumber-reports/extended-report")
@CucumberOptions(features = "src/test/resources/features/UpdatePet/putpet.feature",
        glue = {"RestAssuredSpringExample.stepDefinations","RestAssuredSpringExample.stepDefinationHelper"}
        , monochrome = true
        , tags = {"~@Ignore"}
        , plugin = {
        "html:target/cucumber-reports/cucumber-html-report",
        "pretty:target/cucumber-reports/cucumber-pretty",
        "json:target/cucumber-reports/CucumberTestReport.json",
        "rerun:target/cucumber-reports/rerun.txt"}
)
public class apiTestRunner {
}
