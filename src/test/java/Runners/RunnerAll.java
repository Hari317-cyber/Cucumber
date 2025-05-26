package Runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Listeners;

@CucumberOptions(
        features = "src/test/resources/features",
        tags="@Login1 or @Login2 or @Search2 or @Search1",
        glue = {"StepDefinitions"},
        plugin={"pretty","html:TestReports\\TestReports.html"}
)

//@Listeners({ExtentITestListenerClassAdapter.class})
public class RunnerAll extends AbstractTestNGCucumberTests {

}