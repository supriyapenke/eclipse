package Basepack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;

public class Baseclass {
	
	public static WebDriver driver;
  
  @BeforeClass
  public static void openbrowser() {
	  
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\prasa\\eclipse-workspace\\SAUCEDEMO_CUCUMBER\\mybrowser\\chromedriver.exe");
	    ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications"); 
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        options.setExperimentalOption("prefs", prefs);
	    driver =new ChromeDriver(options);		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        
		
	  
	  
  }

  

}
