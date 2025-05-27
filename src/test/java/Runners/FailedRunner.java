package Runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "@target/failed.txt",
        glue = {"StepDefinitions"},
//        plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
        plugin={"pretty","html:TestReports\\TestReports.html"}
//                ,
//                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"

//        }

)

//@Listeners({ExtentITestListenerClassAdapter.class})
public class FailedRunner extends AbstractTestNGCucumberTests {


}
