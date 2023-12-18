package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = "StepDefs",
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber-html-report"},
        tags = "@Regression"
)
public class SearchForProductRunner {

}
