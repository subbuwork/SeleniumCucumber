package testrunners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:amazon.feature"},
        glue = {"classpath:org.cucumber"},
        tags = {"@regression,@smoke"},
        plugin = {"html:target/cucumber-html","rerun:target/rerun.txt"}
)
public class AmazonTestRunner {
}
