package Runners;


import io.cucumber.java.After;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        tags="@Search2 or @Search1",
        glue = {"StepDefinitions"},
//        plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        plugin={"pretty","html:TestReports\\TestReports.html","rerun:target/failed.txt"}
//                ,
//                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"

//        }

)

//@Listeners({ExtentITestListenerClassAdapter.class})
public class Runner extends AbstractTestNGCucumberTests {


}
