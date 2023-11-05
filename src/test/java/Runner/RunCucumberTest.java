package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
<<<<<<< HEAD
        tags = "@cucumber and not @ignore",
=======
        tags = "@regression and not @ignore",
>>>>>>> 5333408868c4908aeb5a86b51bb9c0e79c602bfa
        features = {"src/test/resources/Features"},
        glue = {"StepDefinitions"},
        plugin = {
                "html:target/Cucumber-JVM-Reports/cucumber-reports/html-report",
                "junit:target/Cucumber-JVM-Reports/cucumber-reports/cucumber.xml",
                "json:target/json-report/cucumber.json",
                "rerun:target/rerun.txt",
        },
        monochrome = true,
        dryRun = true,
        publish = false
)
public class RunCucumberTest {
}
