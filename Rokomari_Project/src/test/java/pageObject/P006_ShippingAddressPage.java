package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver.page_Driver;
import io.qameta.allure.Step;
import utilities.Common_methods;

public class P006_ShippingAddressPage extends Common_methods {
	public P006_ShippingAddressPage() {
		PageFactory.initElements(page_Driver.getCurrentDriver(), this);
	}
@FindBy(css = "div[class='delivery__location d-flex align-item-center mb-3'] label[for='home']")
 public WebElement home ;

@FindBy(css = "div[class='delivery__location d-flex align-item-center mb-3'] label[for='office']")
public WebElement office;

@FindBy(xpath = "//div[@class='shipping-form-container']//input[@id='name']")
public WebElement namefield ;

@FindBy(xpath = "//fieldset[@class='group']//input[@id='phone']")
public WebElement phonenofield ;

@FindBy(xpath = "//fieldset[@class='group']//input[@id='phone2']")
public WebElement alternativephonenofield;

@FindBy(xpath= "//select[@id='js--country']")
public WebElement countryButton ;

@FindBy(xpath = "//select[@id='js--city']")
public WebElement cityButton;

@FindBy(xpath = "//select[@id='js--area']")
public WebElement areaButton;
// this path is for scrolling in area dropdown Button
@FindBy(xpath = "//option[contains(text(),'জিগাতলা')]")
public WebElement jigatola;

@FindBy(xpath = "//fieldset[@class='mb-0']//textarea[@id='address']")
public WebElement addressfield ;

@FindBy(xpath = "//span[normalize-space()='Confirm Order']")
public WebElement confirmOrder;

@FindBy(xpath = "//label[@for='cod']")
public WebElement cashondelivery ;

@FindBy(xpath = "//label[@for='nagad']")
public WebElement nagad;

@FindBy(xpath = "//label[@for='ssl']")
public WebElement cards;

@FindBy(xpath = "//label[@for='bkash']")
public WebElement bkash;

@FindBy(xpath = "//label[@for='rocket']")
public WebElement rocket;


public String ShippingAddressPageTitle = " Shipping Address | Rokomari.com ";

@Step(" click on name,phone no and alternative phn no buttons and input information")
public void name_phonenoInfo (String name , String phoneno  ,String alternativephoneno) 
  {
	namefield.click();
	sendText (namefield, name);
	phonenofield.click();
	sendText (phonenofield, phoneno);
	alternativephonenofield.click();
	sendText (alternativephonenofield, alternativephoneno);
   }

@Step ("Select from Country ,City and Area drop down buttons")
public void countrycityarea_DropdownButtton() {
	countryButton.click();
	selectByVisibleText(countryButton, "Bangladesh");
	cityButton.click();
	selectByVisibleText(cityButton, "ঢাকা" );
	areaButton.click();
	scrollToElement(jigatola);
	selectByVisibleText(areaButton, "খিলগাঁও");
}
@Step("Click on address Field and type address information")
public void addressField(String address) {
	addressfield.click();
	sendText (addressfield, address);
}


@Step("Scroll to Confirm Order Button & click payment methods buttons")
	public void payment_method () {
   scrollToElement(confirmOrder);
   cashondelivery.click();
	nagad.click();
	cards.click();
	bkash.click();
	rocket.click();
}
	
}
