package Runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Listeners;


@CucumberOptions(
        features = "src/test/resources/features",
        tags="@Login1 or @Login2",
        glue = {"StepDefinitions"},
        plugin={"pretty","html:TestReports\\TestReports.html"}
)

//@Listeners({ExtentITestListenerClassAdapter.class})
public class Runner1 extends AbstractTestNGCucumberTests {
}
