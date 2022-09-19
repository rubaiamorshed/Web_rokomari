package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver.page_Driver;
import io.qameta.allure.Step;
import utilities.Common_methods;

public class P001_Homepage extends Common_methods {
	public P001_Homepage() {
		
		PageFactory.initElements(page_Driver.getCurrentDriver(), this);
		
		
	}
	@FindBy(css= ".logged-out-user-menu-btn.btn.btn-secondary ")
    public WebElement signInButton;
	
	@FindBy(xpath = "//a[@id='js--authors']")
	public WebElement lekhok;

	@FindBy(xpath = "//a[contains(text(),'হুমায়ূন আহমেদ')]")
	public WebElement humayunahmed;
	
	public String homePageTitle = "Buy Book Online - Best Online Book Shop in Bangladesh | Rokomari.com";	

@Step("Hover and Click on Sign In Button")
public void hoverAndClickSignInButton() {
	hover(signInButton);
	signInButton.click();
}
@Step ("hover on lekhok option & click humayun ahmed")
public void lekhokButton() {
	hover(lekhok);
	humayunahmed.click();
}
}



