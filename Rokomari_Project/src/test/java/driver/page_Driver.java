package driver;

import org.openqa.selenium.WebDriver;



public class page_Driver {
	private static final ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();
	private static page_Driver instance = null;
	
private page_Driver() {
		
	}
	public static page_Driver getInstance() {
		if (instance == null) {
			instance = new page_Driver();
		}
		return instance;
	}
		

	public WebDriver getDriver() {
		return webDriver.get();
	}
	public void setDriver(WebDriver driver) {
		webDriver.set(driver);
	}
	public static WebDriver getCurrentDriver() {
		return getInstance().getDriver();
	}
}
