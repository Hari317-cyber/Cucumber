package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources",
        tags="@Login1 or @Login2",
        glue = {"StepDefinitions"},
        plugin={"pretty","html:TestReports\\TestReports.html"}
)
public class Runner1 extends AbstractTestNGCucumberTests {
}
