package driver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;


public class base_Driver {
	WebDriver driver=null;
	
	@BeforeSuite 
	public void setUp(){
		String browser = System.getProperty("browser", "chrome");
		if (browser.contains("chrome")) {
			WebDriverManager.chromedriver().setup();
		}
		else if (browser.contains("firefox")){
			WebDriverManager.chromedriver().setup();
		}
		else 
		{
			WebDriverManager.operadriver().setup();		
		
	}
	driver.get(" https://www.rokomari.com/book");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	page_Driver.getInstance().setDriver(driver);

}
	@AfterSuite
	public void tearDown() {
		page_Driver.getCurrentDriver().quit();

	}
	
}
