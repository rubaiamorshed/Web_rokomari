package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driver.page_Driver;
import io.qameta.allure.Step;
import utilities.Common_methods;

public class P003_FilterCategoriesPage extends Common_methods{
	public  P003_FilterCategoriesPage() {
		PageFactory.initElements(page_Driver.getCurrentDriver(), this);
	}
	
	@FindBy(xpath = "//label[@for='ebook']")
	public WebElement eBook;
	
	@FindBy(xpath = "//ul[@id='categoryIds']//li[1]//div[1]//label[1]")
	public WebElement category_1;
	@FindBy(xpath = "//label[@for='categoryIds_1321']")
	public WebElement category_3;
	
	@FindBy(xpath = "//body/footer[1]/div[1]/div[1]/div[3]/div[2]")
	public WebElement app_icon;
	
	@FindBy(xpath = "//a[normalize-space()='Next']")
	public WebElement next_page;
	
	
	public String BooklistPageTitle = "Humayun Ahmed Books - হুমায়ূন আহমেদ এর বই | Rokomari.com";
	
	@Step("Scroll to eBook")
	public void custom_control() {
		scrollToElement(eBook);
	}
		@Step ("Click Checkbox_1 and Chceckbox_3")
		public void Select_categories() {
			category_1.click();
			category_3.click();
		}
		
		@Step("Scroll to Rokomari Downloadapp")
		public void Rokomari_Downloadapp() {
			scrollToElement(app_icon);
		}
		@Step("go to Next Page")
		public void Next_Page() {
			next_page.click();
		}
}
