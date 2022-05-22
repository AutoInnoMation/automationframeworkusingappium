package utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AppiumDriverFactory {
	
	private static AppiumDriverFactory instanceOfAppiumDriverFactory = null;
	private AppiumDriver<AndroidElement> driver;
	
	
	private static String appPackage = ConfigFileReader.getConfigPropertyVal("appPackage");
	private static String appActivity = ConfigFileReader.getConfigPropertyVal("appActivity");
	private static String deviceName = ConfigFileReader.getConfigPropertyVal("deviceName");
	
	
	// Declaring constructor as private to restrict object creation outside of class
	private AppiumDriverFactory() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "android");
		capabilities.setCapability("device", deviceName);
		capabilities.setCapability("appPackage", appPackage);
		capabilities.setCapability("appActivity", appActivity);
		capabilities.setCapability("automationName", "UIAutomator2");
		capabilities.setCapability("noReset", "true");
		capabilities.setCapability("unicodeKeyboard", true);
		//AppiumDriver driver;
		
		try {
			driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub/"), capabilities);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(6000, TimeUnit.MILLISECONDS);
		
	}

	public static AppiumDriverFactory getInstanceOfAppiumDriverFactory() {
		if (instanceOfAppiumDriverFactory == null)
			instanceOfAppiumDriverFactory = new AppiumDriverFactory();

		return instanceOfAppiumDriverFactory;
	}

	// To get driver
	public AppiumDriver<AndroidElement> getDriver() {
		
		return driver;
	}
}
