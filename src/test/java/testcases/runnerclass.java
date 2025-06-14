package testcases;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\prasa\\eclipse-workspace\\SAUCEDEMO_CUCUMBER\\src\\main\\java\\Basepack\\myfeaturefile.feature",
       glue= {"LoginPack"},
       plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
       monochrome = true )
public class runnerclass  {
	
	

	}

