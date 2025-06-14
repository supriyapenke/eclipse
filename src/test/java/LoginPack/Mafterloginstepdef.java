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
		
		
	    
	}
	@When("Click on cart symnol")
	public void click_on_cart_symnol() {
		
		p.val.click();
	    
	}
	@When("Continue to checkout")
	public void continue_to_checkout() {
		
		Assert.assertEquals("Products", p.protitle.getText());
		p.chkot.click();
	    
	}
	@Then("Check the title")
	public void check_the_title() {
		
		Assert.assertEquals("Products", p.protitle.getText());
	}






}
