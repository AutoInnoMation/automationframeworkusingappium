package utils;

/**
 * Owned By : Arnab Majumder
 * This class contains all utility files for android
 */

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

import java.io.File;
import java.io.IOException;

public class AndroidUtils {

private AppiumDriver driver;
	

	/**
	 * Constructor to initialize the {@link WebDriverUtil} object
	 * 
	 * @param driver The {@link AppiumDriver} object
	 */
	public AndroidUtils(AppiumDriver driver) {
		this.driver = driver;
	}

	/**
	 * Function to pause the execution for the specified time period
	 * 
	 * @param milliSeconds The wait time in milliseconds
	 */
	public void waitFor(long milliSeconds) {
		try {
			Thread.sleep(milliSeconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	

	
	public Boolean objectExists(By by) {
		try {
			if (driver.findElements(by).size() == 0) {
				return false;
			} else {
				return true;
			}
		}catch (Exception ex){
			ex.printStackTrace();
			return false;
		}
	}

	public boolean enterValueInTextBox(String text, By by) {
		boolean flag = false;
		try {
			if (driver.findElement(by).isDisplayed()) {
				driver.findElement(by).click();
				driver.findElement(by).clear();
				driver.findElement(by).sendKeys(text);
				//driver.hideKeyboard();
				flag = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	
	/**
	 * Function to get the text of an element. Ex : get title or header
	 * 
	 * param by  The {@link WebDriver} locator used to identify the
	 *                         element
	 * throwing Exception if element is not visible
	 */
	public String getElementText(By by) {
		if (driver.findElement(by).isDisplayed()) {
			return driver.findElement(by).getText();
		} else {
			throw new ElementNotVisibleException("Element Not Found");
		}
	}
	
}
