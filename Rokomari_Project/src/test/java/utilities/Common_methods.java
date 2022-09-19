package utilities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.page_Driver;

public class Common_methods {
	
	public String currentPageUrl() {
		return page_Driver.getCurrentDriver().getCurrentUrl();
	}
	
	//Getting current page title
	
		public String getTitle() {
			return page_Driver.getCurrentDriver().getTitle();
		}
	
	public void hover(WebElement element) {
		Actions actions = new Actions(page_Driver.getCurrentDriver());
		actions.clickAndHold(element).build().perform();
	}
	// Scroll to a specific element (eBook)
	public void scrollToElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) page_Driver.getCurrentDriver();
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	//write in an inpuit field
	public void sendText(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}
	
	// get the list of all the options from drop down button
	public void listoptions(List<WebElement> elements, String visibleText) {
		for (WebElement element : elements) {
			if (element.getText().equals(visibleText)) {
				element.click();
				break;
			}
		}
	}
	//select text form dropdown button
	public void selectByVisibleText(WebElement element, String Text) {
		Select select = new Select (element);
		select.selectByVisibleText(Text);
		
	}
	// Wait for loading page Completly
	WebDriverWait wait;
	public void waitForPageLoad() {
		wait = new WebDriverWait(page_Driver.getCurrentDriver(), Duration.ofSeconds(30));
		wait.until((ExpectedCondition<Boolean>) wd -> ((JavascriptExecutor) wd)
				.executeScript("return document.readyState;").equals("complete"));
	}
	
	
}
