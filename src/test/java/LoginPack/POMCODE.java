package LoginPack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Basepack.Baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class POMCODE extends Baseclass {

    public POMCODE() 
    {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='user-name']") public WebElement UN;
    @FindBy(xpath = "//input[@id='password']") public WebElement PWD;
    @FindBy(xpath = "//input[@id='login-button']") public WebElement SUB;
    @FindBy(xpath ="//button[@id='add-to-cart-sauce-labs-backpack']") public WebElement bpk;
    @FindBy(xpath ="//button[@id='add-to-cart-sauce-labs-fleece-jacket']") public WebElement jkt;
    @FindBy(xpath = "//span[text()='2']") public WebElement val;
    @FindBy(xpath = "//button[@id='checkout']") public WebElement chkot;
    @FindBy(xpath = "//span[text()='Products']") public WebElement protitle;
    @FindBy(xpath = "//span[text()='Your Cart']") public WebElement carttitle;
    @FindBy(xpath = "//span[text()='Checkout: Your Information']") public WebElement chktitle;
}