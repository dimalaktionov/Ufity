import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.net.URL;

public class FirstTest {
    private AppiumDriver driver;

    @Before
    public void setUp() throws Exception
    {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName","AndroidtestDevice");
        capabilities.setCapability("platformVersion","6.0");
        capabilities.setCapability("automationName","Appium");
        capabilities.setCapability("appPackage","app.ufity");
        capabilities.setCapability("appActivity",".ui.activity.AuthActivity");
        capabilities.setCapability("app","/Users/macmini/Desktop/Ufity/apks/ufity-release-v1.1-build-3 (1).apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }
    @After
    public void tearDown()
    {
        driver.quit();
    }



    @Test
    public void firstTest()
    {
        waitForElementAndClick(
                By.xpath("//*[contains(@text, 'Sign up')]"),
                "Cannot find SIGN UP button",
                1
        );
        //Empty username field
        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_email')]"),
                "Cannot find SIGN UP button",
                1
        );

        //Add username with more than 15 letters (18 Letters)
        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_username')]"),
                "TestUser1TestUser1",
                "Cannot find search input",
                2
        );

        waitForElementAndClear(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_username')]"),
                "Cannot find search",
                2
        );

        //Add username with less 3 letters (1 Letter)
        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_username')]"),
                "T",
                "Cannot find search input",
                2
        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_email')]"),
                "Cannot find SIGN UP button",
                1
        );

        waitForElementAndClear(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_username')]"),
                "Cannot find search",
                2
        );

        //Add username with numbers (6 numbers)
        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_username')]"),
                "123456",
                "Cannot find search input",
                2
        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_email')]"),
                "Cannot find SIGN UP button",
                1
        );

        waitForElementAndClear(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_username')]"),
                "Cannot find search",
                2
        );

        //Add username with space
        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_username')]"),
                "Test User",
                "Cannot find search input",
                2
        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_email')]"),
                "Cannot find SIGN UP button",
                1
        );

        waitForElementAndClear(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_username')]"),
                "Cannot find search",
                2
        );

        //Add username with underscore & hyphens
        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_username')]"),
                "Test-User_",
                "Cannot find search input",
                2
        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_email')]"),
                "Cannot find SIGN UP button",
                1
        );

        waitForElementAndClear(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_username')]"),
                "Cannot find search",
                2
        );

        //Add username with underscore & hyphens
        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_username')]"),
                "Test-User_",
                "Cannot find search input",
                2
        );


        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_email')]"),
                "TestUser1",
                "Cannot find search input",
                2

        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_email_confirm')]"),
                "Cannot find SIGN UP button",
                1
        );

        waitForElementAndClear(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_email')]"),
                "Cannot find search",
                2
        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_email')]"),
                "dima.laktionov5@gmail.com",
                "Cannot find search input",
                2

        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_email_confirm')]"),
                "TestUser2@gmail.com",
                "Cannot find search input",
                2

        );

        waitForElementAndClear(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_email_confirm')]"),
                "Cannot find search",
                2
        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_email_confirm')]"),
                "dima.laktionov5@gmail.com",
                "Cannot find search input",
                2

        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_password')]"),
                "Cannot find SIGN UP button",
                1
        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_invite')]"),
                "Cannot find SIGN UP button",
                1
        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_password')]"),
                "1",
                "Cannot find search input",
                2

        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_invite')]"),
                "Cannot find SIGN UP button",
                1
        );

        waitForElementAndClear(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_password')]"),
                "Cannot find search",
                2
        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_password')]"),
                "Test-User_",
                "Cannot find search input",
                2

        );

        waitForElementAndClear(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_password')]"),
                "Cannot find search",
                2
        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_password')]"),
                "123456",
                "Cannot find search input",
                2

        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_invite')]"),
                "Test-User_",
                "Cannot find search input",
                2

        );

        waitForElementAndClick(
                By.xpath("//*[contains(@class, 'android.widget.ImageButton')]"),
                "Cannot find SIGN UP button",
                1
        );

    }

    @Test
    public void restore_password()
    {
        waitForElementAndClick(
                By.xpath("//*[contains(@text, 'Sign in')]"),
                "Cannot find 'Sign in'",
                5
        );

        waitForElementAndClick(
                By.xpath("//*[contains(@text, 'Click here')]"),
                "Cannot find 'Sign in'",
                5
        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_email')]"),
                "dima.laktionov5@gmail.com",
                "Cannot find search input",
                2

        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/change_btn')]"),
                "Cannot find 'Sign in'",
                5
        );



    }
    @Test
    public void log_in_leaderboard()
    {
        waitForElementAndClick(
                By.xpath("//*[contains(@text, 'Sign in')]"),
                "Cannot find 'Sign in'",
                5
        );

        waitForElementAndClick(
                By.xpath("//*[contains(@text, 'Sign in')]"),
                "Cannot find 'Sign in'",
                5

        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_username')]"),
                "Test-User_",
                "Cannot find search input",
                2

        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_password')]"),
                "1234567",
                "Cannot find search input",
                2

        );

    }

    @Test
    public void log_in_change_shipping_address_correct_scenario()
    {
        waitForElementAndClick(
                By.xpath("//*[contains(@text, 'Sign in')]"),
                "Cannot find 'Sign in'",
                5

        );
        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_username')]"),
                "user21081",
                "Cannot find search input",
                2

        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_password')]"),
                "1234567",
                "Cannot find search input",
                2

        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/sign_in_btn')]"),
                "Cannot find 'Sign in'",
                5

        );

        waitForElementAndClick(
                By.xpath("//*[contains(@text, 'OK')]"),
                "Cannot find 'Sign in'",
                5

        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/nav_profile')]"),
                "Cannot find 'Sign in'",
                5

        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/settings_profile_btn')]"),
                "Cannot find 'Sign in'",
                5

        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/change_address_btn')]"),
                "Cannot find 'Sign in'",
                5

        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_first_name')]"),
                "Test First-Name",
                "Cannot find search input",
                2

        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_last_name')]"),
                "Test Last-Name",
                "Cannot find search input",
                2

        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_country')]"),
                "Cannot find search input",
                2

        );

        waitForElementAndClick(
                By.xpath("//*[contains(@text, 'Angola')]"),
                "Cannot find 'Sign in'",
                5

        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_city')]"),
                "Luanda",
                "Cannot find search input",
                2

        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_zip')]"),
                "04060",
                "Cannot find search input",
                2

        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_street')]"),
                "Test Street 12A",
                "Cannot find search input",
                2

        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_number')]"),
                "123b",
                "Cannot find search input",
                2

        );

        swipeUpToFindElement(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_flat')]"),
                "Cannot find the end of the article",
                20
        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_flat')]"),
                "1b",
                "Cannot find search input",
                2

        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/change_btn')]"),
                "Cannot find 'Sign in'",
                8

        );

//        waitForElementAndClick(
//                By.xpath("//*[contains(@resource-id, 'app.ufity:id/change_address_btn')]"),
//                "Cannot find 'Sign in'",
//                8

//        );

//        waitForElementAndClick(
//                By.xpath("//*[contains(@resource-id, 'app.ufity:id/change_btn')]"),
//                "Cannot find 'Sign in'",
//                8
//        );




    }



    @Test
    public void log_in()
        {
            waitForElementAndClick(
                    By.xpath("//*[contains(@text, 'Sign in')]"),
                    "Cannot find 'Sign in'",
                    5

            );

            waitForElementAndSendKeys(
                    By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_username')]"),
                    "user21081",
                    "Cannot find search input",
                    2

            );

            waitForElementAndSendKeys(
                    By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_password')]"),
                    "123456",
                    "Cannot find search input",
                    2

            );

            waitForElementAndClick(
                    By.xpath("//*[contains(@resource-id, 'app.ufity:id/sign_in_btn')]"),
                    "Cannot find 'Sign in'",
                    5

            );

            waitForElementAndClick(
                    By.xpath("//*[contains(@text, 'OK')]"),
                    "Cannot find 'Sign in'",
                    5

            );

            waitForElementAndClick(
                    By.xpath("//*[contains(@resource-id, 'app.ufity:id/nav_profile')]"),
                    "Cannot find 'Sign in'",
                    5

            );

            waitForElementAndClick(
                    By.xpath("//*[contains(@resource-id, 'app.ufity:id/settings_profile_btn')]"),
                    "Cannot find 'Sign in'",
                    5

            );

            waitForElementAndClick(
                    By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_pofile_btn')]"),
                    "Cannot find 'Sign in'",
                    5

            );

            waitForElementAndClear(
                    By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_email')]"),
                    "Cannot find 'Sign in'",
                    5

            );

            waitForElementAndClick(
                    By.xpath("//*[contains(@resource-id, 'app.ufity:id/save_btn')]"),
                    "Cannot find 'Sign in'",
                    5

            );

            waitForElementAndSendKeys(
                    By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_email')]"),
                    "user21089@bigmir.net",
                    "Cannot find search input",
                    2

            );

            waitForElementAndClick(
                    By.xpath("//*[contains(@resource-id, 'app.ufity:id/save_btn')]"),
                    "Cannot find 'Sign in'",
                    5

            );

            waitForElementAndClick(
                    By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_pofile_btn')]"),
                    "Cannot find 'Sign in'",
                    5

            );

            waitForElementAndClear(
                    By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_email')]"),
                    "Cannot find search input",
                    2

            );

            waitForElementAndSendKeys(
                    By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_email')]"),
                    "user210810@bigmir.net",
                    "Cannot find search input",
                    2

            );

            waitForElementAndClick(
                    By.xpath("//*[contains(@resource-id, 'app.ufity:id/save_btn')]"),
                    "Cannot find 'Sign in'",
                    5

            );

            waitForElementAndClick(
                    By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_pofile_btn')]"),
                    "Cannot find 'Sign in'",
                    5

            );

            waitForElementAndClick(
                    By.xpath("//*[contains(@class, 'android.widget.ImageButton')]"),
                    "Cannot find 'Sign in'",
                    5

            );

            waitForElementAndClick(
                    By.xpath("//*[contains(@resource-id, 'app.ufity:id/change_password_btn')]"),
                    "Cannot find 'Sign in'",
                    5

            );

            waitForElementAndClick(
                    By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_old')]"),
                    "Cannot find 'Sign in'",
                    5

            );

            waitForElementAndClick(
                    By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_new')]"),
                    "Cannot find 'Sign in'",
                    5

            );

            waitForElementAndClick(
                    By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_confirm')]"),
                    "Cannot find 'Sign in'",
                    5

            );

            waitForElementAndClick(
                    By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_old')]"),
                    "Cannot find 'Sign in'",
                    5

            );

            waitForElementAndSendKeys(
                    By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_old')]"),
                    "123456",
                    "Cannot find search input",
                    2

            );

            waitForElementAndSendKeys(
                    By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_new')]"),
                    "123456",
                    "Cannot find search input",
                    2

            );

            waitForElementAndSendKeys(
                    By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_confirm')]"),
                    "123456",
                    "Cannot find search input",
                    2

            );

            waitForElementAndClick(
                    By.xpath("//*[contains(@resource-id, 'app.ufity:id/change_btn')]"),
                    "Cannot find 'Sign in'",
                    5

            );

            waitForElementAndClear(
                    By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_old')]"),
                    "Cannot find search input",
                    2

            );

            waitForElementAndSendKeys(
                    By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_old')]"),
                    "1234567",
                    "Cannot find search input",
                    2

            );

            waitForElementAndClear(
                    By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_new')]"),
                    "Cannot find search input",
                    2

            );

            waitForElementAndSendKeys(
                    By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_new')]"),
                    "12345",
                    "Cannot find search input",
                    2

            );

            waitForElementAndClick(
                    By.xpath("//*[contains(@resource-id, 'app.ufity:id/change_btn')]"),
                    "Cannot find 'Sign in'",
                    5

            );

            waitForElementAndClick(
                    By.xpath("//*[contains(@resource-id, 'app.ufity:id/change_btn')]"),
                    "Cannot find 'Sign in'",
                    5

            );

            waitForElementAndClear(
                    By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_new')]"),
                    "Cannot find search input",
                    2

            );

            waitForElementAndSendKeys(
                    By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_new')]"),
                    "123456",
                    "Cannot find search input",
                    2

            );
        }
















    private WebElement waitForElementPresent(By by, String error_message, long timeoutInSeconds)
    {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.withMessage(error_message +"\n");
        return wait.until(
                ExpectedConditions.presenceOfElementLocated(by)
        );

    }
    private WebElement waitForElementPresent(By by, String error_message)
    {
        return waitForElementPresent(by, error_message, 5);
    }
    private WebElement waitForElementAndClick(By by, String error_message, long timeoutInSeconds)
    {
        WebElement element = waitForElementPresent(by, error_message, timeoutInSeconds);
        element.click();
        return element;

    }
    private WebElement waitForElementAndSendKeys(By by, String value, String error_message, long timeoutInSeconds)
    {
        WebElement element = waitForElementPresent(by, error_message, timeoutInSeconds);
        element.sendKeys(value);
        return element;

    }

    private boolean waitForElementNotPresent(By by, String error_message, long timeoutInSeconds)
    {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.withMessage(error_message +"\n");
        return wait.until(
                ExpectedConditions.invisibilityOfElementLocated(by)
        );

    }

    private WebElement waitForElementAndClear(By by, String error_message, long timeoutInSeconds)
    {
        WebElement element = waitForElementPresent(by, error_message, timeoutInSeconds);
        element.clear();
        return element;

    }
    protected void swipeUp(int timeOfSwipe)
    {
        TouchAction action = new TouchAction(driver);
        Dimension size = driver.manage().window().getSize();
        int x = size.width / 2;
        int start_y = (int) (size.height * 0.8);
        int end_y = (int) (size.height * 0.2);


        action.press(x, start_y).waitAction(timeOfSwipe).moveTo(x, end_y).release().perform();
    }

    protected void swipeUpQuick()
    {
        swipeUp(200);
    }
    protected void swipeUpToFindElement(By by, String error_message, int max_swipes)
    {
        int already_swiped = 0;
        while (driver.findElements(by).size() ==0){

            if (already_swiped > max_swipes){
                waitForElementPresent(by, "Cannot find element by swiping up. \n" + error_message, 0);
                return;
            }
            swipeUpQuick();
            ++already_swiped;

        }
    }

}
