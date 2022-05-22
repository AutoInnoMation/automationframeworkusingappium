package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.AndroidUtils;
import utils.AppiumDriverFactory;

public class FlightSearchPage {

    AppiumDriver driver = null;
    AppiumDriverFactory appiumDriverFactory = AppiumDriverFactory.getInstanceOfAppiumDriverFactory();
    AndroidUtils androidUtils;
    /** Page Objects **/
    private static final By header_logo = By.id("net.skyscanner.android.main:id/header_logo");
    private static final By flight_icon = By.xpath("//android.widget.ImageView[@content-desc='Flights']");

    public void launchApp(){
        driver = appiumDriverFactory.getDriver();
            androidUtils = new AndroidUtils(driver);
            if(androidUtils.objectExists(header_logo)){
                System.out.println("Application Launched!");
                Assert.assertTrue(true,"Application Launched Successfully!");
            }else{
                Assert.assertTrue(false,"Unable to launch application!");
            }

    }

    public void validateScreen(String screenName){
        By screen_name_obj = By.xpath("//android.widget.FrameLayout[@content-desc='"+screenName+"']/android.view.ViewGroup/android.widget.TextView");
        if(androidUtils.objectExists(screen_name_obj)){
           Assert.assertTrue(true,"I am in "+screenName);
        }else{
            Assert.assertTrue(false,"failed to be in "+screenName);
        }

    }

}
