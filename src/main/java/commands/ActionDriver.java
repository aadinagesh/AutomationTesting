package commands;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;

import config.StartBrowser;


public class ActionDriver {
WebDriver driver;

public ActionDriver() {
	driver = StartBrowser.driver;
}

public void navigateToApplication(String url) {
	try {
		driver.get(url);
		StartBrowser.childTest.pass("successfully navigated to :" +url);
	} catch (Exception e) {
		// TODO: handle exception
		StartBrowser.childTest.fail("unable to navigated to :" +url);
	}	
}

public void click(By locator, String eleName) throws Exception {
	
	try {
		driver.findElement(locator).click();
		StartBrowser.childTest.pass("successfully clicked on :" +eleName);
	} catch (Exception e) {
		// TODO: handle exception
		StartBrowser.childTest.fail("unable to click on :" +eleName, 
				MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
		StartBrowser.childTest.info(e);
		throw e;
	}
	
}

public void type(By locator, String text, String eleName) throws Exception {
	
	try {
		driver.findElement(locator).sendKeys(text);	
		StartBrowser.childTest.pass("successfully typed in :" +eleName+ "with data: " +text);
	} catch (Exception e) {
		// TODO: handle exception
		StartBrowser.childTest.fail("unable to type in :" +eleName+ "with data: " +text, 
				MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
		StartBrowser.childTest.info(e);
		throw e;
	}
}

public String screenShot() {
	return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
	
}
}
