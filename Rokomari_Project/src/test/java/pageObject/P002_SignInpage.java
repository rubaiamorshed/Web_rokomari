package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver.page_Driver;
import io.qameta.allure.Step;
import utilities.Common_methods;

public class P002_SignInpage extends Common_methods{
	public P002_SignInpage() {
		PageFactory.initElements(page_Driver.getCurrentDriver(), this);
	}

	
@FindBy(xpath= "//a[contains(text(),'Sign in')]")
public WebElement signInButton;

@FindBy(xpath = "//p[contains(text(),'Sign up')]")
public WebElement signUp;

@FindBy(className = "btn btn-social-google")
public WebElement googleButton;

public String signinPageTitle = "Login To Rokomari | Rokomari.com";

@Step ("hover & Click SignIn & SignUP Button ")
public void hoverClickSignIn_SignUp(){
	hover(signInButton);
	signInButton.click();
	signUp.click();
}
	
@Step ("hover and click on Google button")
public void hoverClickGoogleButton() {
	hover(googleButton);
	googleButton.click();
}



}
