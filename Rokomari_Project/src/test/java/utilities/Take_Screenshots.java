package utilities;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import driver.page_Driver;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;

public class Take_Screenshots {
	// Taking a screenshot for full view port
			public void screenshot(String name) throws IOException {
				String strtime = setdate();
				File scFile = ((TakesScreenshot) page_Driver.getCurrentDriver()).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(scFile, new File("./image/" + strtime + "_" + name + ".png"));
			}

			

			// Taking a screenshot for full view port and attest to allure report
			@Step("Taking a screenshot for {0}")
			public static void takeScreenShot(String name) {
				Allure.addAttachment(name, new ByteArrayInputStream(
						((TakesScreenshot) page_Driver.getCurrentDriver()).getScreenshotAs(OutputType.BYTES)));
			}

			// Convert current data time to string
			public String setdate() {
				Date date = Calendar.getInstance().getTime();
				SimpleDateFormat formatter = new SimpleDateFormat("yyyymmdd_HHmmss");
				String strdate = formatter.format(date);
				return strdate;
			}

}
