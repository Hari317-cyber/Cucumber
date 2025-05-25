package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources",
        tags="@Login1 or @Login2 or @Search2 or @Search1",
        glue = {"StepDefinitions"},
        plugin={"pretty","html:TestReports\\TestReports.html"}
        //
)
public class RunnerAll extends AbstractTestNGCucumberTests {
}