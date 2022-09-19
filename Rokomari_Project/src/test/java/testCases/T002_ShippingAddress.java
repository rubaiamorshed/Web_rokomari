package testCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import driver.base_Driver;
import io.qameta.allure.Description;
import pageObject.P006_ShippingAddressPage;
import testDataset.Data_Set;
import utilities.Take_Screenshots;

public class T002_ShippingAddress extends base_Driver {
 @Test(description = "fillup Shipping Address", dataProvider = "ShippingAddressData",
		 dataProviderClass = Data_Set.class)
 @Description("Test description: This test will go to rokomari.com and "+"perform the shipping process ")
	public void fillup_ShippingAddress(String name , String phoneno,
			String alternativephoneno,String address) throws InterruptedException {
		
	P006_ShippingAddressPage shippingAddressPage = new P006_ShippingAddressPage();
	SoftAssert softAssert = new SoftAssert();

	//Shipping AddressPage
	shippingAddressPage.waitForPageLoad();
	softAssert.assertEquals(shippingAddressPage.getTitle(), shippingAddressPage.ShippingAddressPageTitle);
	shippingAddressPage.name_phonenoInfo(name, phoneno, alternativephoneno);
	shippingAddressPage.countrycityarea_DropdownButtton();
	shippingAddressPage.addressField(address);
	shippingAddressPage.payment_method();
	// Taking a screenshot for reporting purpose
	Take_Screenshots.takeScreenShot("After filling Shipping Address");
	
	// Assertion
			softAssert.assertAll();
	
	
	}
}