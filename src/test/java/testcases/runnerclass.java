package testcases;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/main/java/Basepack/myfeaturefile.feature",
    glue = {"LoginPack"},
    plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
    monochrome = true
    //tags = "@Beforechecks"
)
public class runnerclass extends AbstractTestNGCucumberTests {
	
}
