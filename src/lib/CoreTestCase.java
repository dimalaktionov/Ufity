package lib;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import junit.framework.TestCase;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class CoreTestCase extends TestCase {

    protected AppiumDriver driver;
    private static String AppiumURL = "http://127.0.0.1:4723/wd/hub";



    @Override
    protected void setUp() throws Exception
    {
        super.setUp();

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName","192.168.56.101:5555");
        capabilities.setCapability("platformVersion","5.0");
        capabilities.setCapability("automationName","Appium");
        capabilities.setCapability("appPackage","app.ufity.debug");
        capabilities.setCapability("appActivity","app.ufity.ui.activity.AuthActivity");
        capabilities.setCapability("app","/Users/macmini/Desktop/Ufity/apks/ufity-debug-v1.2.5.apk");

        driver = new AndroidDriver(new URL(AppiumURL), capabilities);
    }

    @Override
    protected void tearDown() throws Exception
    {
        driver.quit();

        super.tearDown();
    }
}
