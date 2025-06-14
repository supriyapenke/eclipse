package Basepack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Baseclass {
	
	public static WebDriver driver;
  
  @BeforeClass
  public static void openbrowser() {
	  
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\prasa\\eclipse-workspace\\SAUCEDEMO_CUCUMBER\\mybrowser\\chromedriver.exe");
		driver =new ChromeDriver();		
		driver.manage().window().maximize();
		
	  
	  
  }

  @AfterClass
  public static void closingbrowser() {
	  
	  driver.quit();
	  
  }

}
