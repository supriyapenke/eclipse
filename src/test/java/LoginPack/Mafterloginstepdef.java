package LoginPack;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Basepack.Baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Mafterloginstepdef extends Baseclass {
	
	POMCODE p;
	
	
	@Given("URL is login with valid credentials")
	public void login() {
		Baseclass.openbrowser();  
		p = new POMCODE();  
		driver.get("https://www.saucedemo.com/");
		p.UN.sendKeys("standard_user");
		p.PWD.sendKeys("secret_sauce");
		p.SUB.click();
		Assert.assertEquals("Products", p.protitle.getText());
		System.out.println("after login  page validated");
		
	    
	}
	@Then("Click on add to cart")
	public void add_to_cart() {
		
		p.bpk.click();
		p.jkt.click();
	    
	}
	@When("Value is added into cart")
	public void value_is_added_into_cart() {
		
		System.out.println("Items are assumed to be added to cart here.");
	    
	}
	@When("Click on cart symnol")
	public void click_on_cart_symnol() {
		
		p.val.click();
	    
	}
	
	@Then("Check product page")
	public void checkpage()
	{
		Assert.assertEquals("Your Cart", p.carttitle.getText());
		System.out.println("products are added and shown in products page");
	}
	@When("Continue to checkout")
	public void continue_to_checkout() {
		
		p.chkot.click();
	    
	}
	@Then("Check the title")
	public void check_the_title() {
		
		Assert.assertEquals("Checkout: Your Information", p.chktitle.getText());
		System.out.println("checkout page validated");
	}






}
