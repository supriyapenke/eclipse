package LoginPack;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Basepack.Baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Loginclassstepdef extends Baseclass {
	
	POMCODE p;
  
	@Given("User has provided application URL")
	public void application_url() {
		 Baseclass.openbrowser();
		 p=new POMCODE();
		driver.get("https://www.saucedemo.com/");
	    
	}

	@Then("check the homepage title")
	public void homepage_title() {
		
		Assert.assertEquals("Swag Labs", driver.getTitle());
		System.out.println("home page validated");
	    
	}
   
	@When("Home page title validated and enter {string}")
	public void username(String username) {
		
		p.UN.sendKeys(username);
	  
	}
   
	@When("^Enter \"([^\"]*)\"$")
	public void enter_password(String password) {
		
		p.PWD.sendKeys(password);
	  
	}
 
	@When("After username and password hit enter")
	public void submit() {
		
		p.SUB.click();
	    
	}
 
	@Then("Check the login title")
	public void check_title() {
		
		Assert.assertEquals("Swag Labs", driver.getTitle());
		System.out.println("after login  page validated");
		
	}




}
