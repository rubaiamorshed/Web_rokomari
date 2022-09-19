package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver.page_Driver;
import io.qameta.allure.Step;
import utilities.Common_methods;

public class P004_AddToCartPage extends Common_methods{
	public P004_AddToCartPage() {
		PageFactory.initElements(page_Driver.getCurrentDriver(), this);
	}
@FindBy(xpath = "//div[@title='মিসির আলির চশমা হুমায়ূন আহমেদ']//div[2]")
public WebElement book;

@FindBy(css = "button[product-id='8893']")
public WebElement addCartButton ;

@FindBy(xpath = "//a[@id='js-cart-menu']//*[name()='svg']")
public WebElement cartIcon ;


@Step("Scroll to Book hover on it ")
public void Scroll_hoverBook(){
	scrollToElement(book);
	hover(book);
}
@Step ("Click on Add to Cart Button")
	public void Click_AddCartButton() {
	addCartButton.click();
}
@Step ("Click on  Cart Icon")
public void Click_CartIcon() {
	cartIcon.click();
}
}
