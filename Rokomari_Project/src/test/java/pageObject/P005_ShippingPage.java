package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver.page_Driver;
import io.qameta.allure.Step;
import utilities.Common_methods;

  public class P005_ShippingPage extends Common_methods {
	public P005_ShippingPage() {
		PageFactory.initElements(page_Driver.getCurrentDriver(), this);
	}
@FindBy(xpath = "//i[@class='ion-ios-plus-empty']") 
public WebElement increaseItem ;
@FindBy(xpath = "//i[@class='ion-ios-minus-empty']")
public WebElement decreaseItem;

@FindBy(xpath = "//span[normalize-space()='Place Order']")
public WebElement placeOrderButton;

 public String myCart_PageTitle =" My Cart | Rokomari.com ";
 
 @Step ("click on Plus Minus Button & Place Order Button")
 public void clickButtons () {
	 increaseItem.click();
	 decreaseItem.click();
	 placeOrderButton.click();
	 }
}
