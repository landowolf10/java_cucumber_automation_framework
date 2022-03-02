package steps_definition;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/project/Features/facebook_login.feature",
        glue = {"steps_definition"},
        plugin = {
                "pretty", "html:reports/html/report.html",
                "json:reports/json/reports.json"
        }
)

public class TestRunner
{
}
