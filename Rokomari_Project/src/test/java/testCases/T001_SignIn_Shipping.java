package testCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import driver.base_Driver;
import io.qameta.allure.Description;
import pageObject.P001_Homepage;
import pageObject.P002_SignInpage;
import pageObject.P003_FilterCategoriesPage;
import pageObject.P004_AddToCartPage;
import pageObject.P005_ShippingPage;

import utilities.Take_Screenshots;

public class T001_SignIn_Shipping extends base_Driver {
	@Test( description = "perform Sign up, add to cart, purchase")
	@Description("Test description: This will go to rokomari.com and "+
	" filter categories by selecting two different categories"+"then add a product to the cart ")
	public void SignIn_shipping () {
		
		P001_Homepage homepage = new P001_Homepage();
		P002_SignInpage signInpage = new P002_SignInpage();
		P003_FilterCategoriesPage filterCategoriesPage = new P003_FilterCategoriesPage();
		P004_AddToCartPage addToCartPage = new P004_AddToCartPage();
		P005_ShippingPage  shippingPage = new P005_ShippingPage();
		SoftAssert softAssert = new SoftAssert();
	// going to Sign In Page
		homepage.hoverAndClickSignInButton();
		//wating for Sign In page load completly
		signInpage.waitForPageLoad();
		softAssert.assertEquals(signInpage.getTitle(), signInpage.signinPageTitle);
		
		// hover and click on Buttons for complete SignUp Process
				signInpage.hoverClickSignIn_SignUp();
				signInpage.hoverClickGoogleButton();
				// Taking a screenshot for reporting purpose
				Take_Screenshots.takeScreenShot("After Sign Up");
				// hover on lekhok button and click on humayun ahmed from menu bar
				homepage.lekhokButton();
				softAssert.assertEquals(homepage.getTitle(), homepage.homePageTitle);
				
	//waiting for filter categories page
filterCategoriesPage.waitForPageLoad();
softAssert.assertEquals(filterCategoriesPage.getTitle(), filterCategoriesPage.BooklistPageTitle);
filterCategoriesPage.custom_control();
filterCategoriesPage.Select_categories();
filterCategoriesPage.Rokomari_Downloadapp();
filterCategoriesPage.Next_Page();
//addtocart page
addToCartPage.waitForPageLoad();
addToCartPage.Scroll_hoverBook();
addToCartPage.Click_AddCartButton();
addToCartPage.Click_CartIcon();
//Shipping page
shippingPage.waitForPageLoad();
shippingPage.clickButtons ();				
//Assertion
		softAssert.assertAll();
}
}