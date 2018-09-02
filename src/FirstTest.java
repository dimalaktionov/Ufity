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
import java.util.List;

public class FirstTest {
    private AppiumDriver driver;

    @Before
    public void setUp() throws Exception
    {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName","192.168.56.101:5555");
        capabilities.setCapability("platformVersion","5.0");
        capabilities.setCapability("automationName","Appium");
        capabilities.setCapability("appPackage","app.ufity.debug");
        capabilities.setCapability("appActivity","app.ufity.ui.activity.AuthActivity");
        capabilities.setCapability("app","/Users/macmini/Desktop/Ufity/apks/ufity-debug-purchase-2.apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }
    @After
    public void tearDown()
    {
        driver.quit();
    }

    @Test
    public void Sign_in_success()
    {
        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id,'app.ufity.debug:id/sign_in_txt')]"),
                "Cannot find Sign in now button",
                5
        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_username')]"),
                "Test-User_",
                "Cannot find username field",
                5
        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_password')]"),
                "123456",
                "Cannot find password field",
                5
        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id,'app.ufity.debug:id/sign_in_btn')]"),
                "Cannot find Sign in  button",
                10
        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'com.google.android.gms:id/account_name')]"),
                "Cannot find 'Account_name'",
                10

        );

        waitForElementInCollectionAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/vBottomNavigation')]//*[@class='android.widget.ImageButton']"),
                1,
                "Cannot find Cart element of collection",
                10

        );

        swipeUpToFindElement(
                By.xpath("//*[contains(@text, 'Strawberry')]"),
                "Cannot find Strawberry ",
                5
        );

        waitForElementAndClick(
                By.xpath("//*[contains(@text, 'Strawberry')]"),
                "Cannot click to Strawberry",
                10

        );

        swipeUpToFindElement(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/buy_btn')]"),
                "Cannot find Buy now button ",
                5
        );

    }

    @Test
    public void Sign_in_success_Leaderboard() {
        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id,'app.ufity.debug:id/sign_in_txt')]"),
                "Cannot find Sign in now button",
                5
        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_username')]"),
                "Test-User_",
                "Cannot find username field",
                5
        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_password')]"),
                "123456",
                "Cannot find password field",
                5
        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id,'app.ufity.debug:id/sign_in_btn')]"),
                "Cannot find Sign in  button",
                10
        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'com.google.android.gms:id/account_name')]"),
                "Cannot find 'Account_name'",
                10

        );

        waitForElementAndClick(
                By.xpath("//*[contains(@class, 'android.widget.ImageButton')][3]"),
                "Cannot find 'Account_name'",
                10

        );

        waitForElementPresent(
                By.xpath("//*[@text='Test-User_']"),
                "Cannot find Test-User_",
                5
        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/back_to_top_btn')]"),
                "Cannot find Back to top button",
                10

        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/back_to_user_btn')]"),
                "Cannot find Back to user button",
                10

        );

    }

    @Test
    public void Sign_Up()
    {
        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id,'app.ufity.debug:id/login_sign_up_btn')]"),
                "Cannot find Sign in now button",
                5
        );

        //Empty confirm email field
        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_email_confirm')]"),
                "Cannot find Username field",
                1
        );

        waitForElementPresent(
                By.xpath("//*[@text='Field cannot be empty']"),
                "Cannot delete saved article",
                5
        );

        //Empty password field
        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_password')]"),
                "Cannot find Username field",
                1
        );

        //Empty invite code field
        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_invite')]"),
                "Cannot find Username field",
                1
        );

        waitForElementPresent(
                By.xpath("//*[@text='Password should be at least 6 symbols long']"),
                "Cannot delete saved article",
                5
        );

        //Add username with more than 15 letters (18 Letters)
        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_username')]"),
                "TestUser1TestUser1",
                "Cannot find search input",
                2
        );

        waitForElementAndClear(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_username')]"),
                "Cannot find search",
                2
        );

        //Add username with less 3 letters (1 Letter)
        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_username')]"),
                "T",
                "Cannot find search input",
                2
        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_email')]"),
                "Cannot find SIGN UP button",
                1
        );

        waitForElementAndClear(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_username')]"),
                "Cannot find search",
                2
        );

        //Add username with numbers (6 numbers)
        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_username')]"),
                "123456",
                "Cannot find search input",
                2
        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_email')]"),
                "Cannot find SIGN UP button",
                1
        );

        waitForElementAndClear(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_username')]"),
                "Cannot find search",
                5
        );

        //Add username with space
        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_username')]"),
                "Test User",
                "Cannot find search input",
                2
        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_email')]"),
                "Cannot find SIGN UP button",
                1
        );

        waitForElementAndClear(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_username')]"),
                "Cannot find search",
                2
        );

        //Add username with underscore & hyphens
        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_username')]"),
                "Test-User_",
                "Cannot find search input",
                2
        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_email')]"),
                "Cannot find SIGN UP button",
                1
        );

        waitForElementAndClear(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_username')]"),
                "Cannot find search",
                2
        );

        //Add username with underscore & hyphens
        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_username')]"),
                "Test-User_",
                "Cannot find search input",
                2
        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_email_confirm')]"),
                "Cannot find SIGN UP button",
                1
        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_email')]"),
                "TestUser1",
                "Cannot find search input",
                2

        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_email_confirm')]"),
                "Cannot find SIGN UP button",
                1
        );

        waitForElementAndClear(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_email')]"),
                "Cannot find search",
                2
        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_email')]"),
                "dima.laktionov5@gmail.com",
                "Cannot find search input",
                2

        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_email_confirm')]"),
                "TestUser2@gmail.com",
                "Cannot find search input",
                2

        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_password')]"),
                "Cannot find SIGN UP button",
                1
        );

        waitForElementAndClear(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_email_confirm')]"),
                "Cannot find search",
                2
        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_email_confirm')]"),
                "dima.laktionov5@gmail.com",
                "Cannot find search input",
                2

        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_password')]"),
                "Cannot find SIGN UP button",
                1
        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_invite')]"),
                "Cannot find SIGN UP button",
                1
        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_password')]"),
                "1",
                "Cannot find search input",
                2

        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_invite')]"),
                "Cannot find SIGN UP button",
                1
        );

        waitForElementAndClear(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_password')]"),
                "Cannot find search",
                2
        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_password')]"),
                "Test-User_",
                "Cannot find search input",
                2

        );

        waitForElementAndClear(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_password')]"),
                "Cannot find search",
                2
        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_password')]"),
                "123456",
                "Cannot find search input",
                2

        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_invite')]"),
                "Test-User_",
                "Cannot find search input",
                2

        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/cbTerms')]"),
                "Cannot find SIGN UP button",
                1
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
                By.xpath("//*[contains(@text, 'Sign in now')]"),
                "Cannot find 'Sign in'",
                5
        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_username')]"),
                "Test-User_",
                "Cannot find search input",
                2

        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_password')]"),
                "1234567",
                "Cannot find search input",
                2

        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/sign_in_btn')]"),
                "Cannot find 'Sign in'",
                10

        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'com.google.android.gms:id/account_name')]"),
                "Cannot find 'Sign in'",
                10

        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/nav_leader')]"),
                "Cannot find 'Sign in'",
                10

        );

    }

    @Test
    public void log_in_transaction_history()
    {
        waitForElementAndClick(
                By.xpath("//*[contains(@text, 'Sign in now')]"),
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

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/sign_in_btn')]"),
                "Cannot find 'Sign in'",
                10

        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'com.google.android.gms:id/account_name')]"),
                "Cannot find 'Sign in'",
                10

        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/history_btn')]"),
                "Cannot find 'Sign in'",
                10

        );

        waitForElementAndClick(
                By.xpath("//*[contains(@class, 'android.widget.ImageButton')]"),
                "Cannot find 'Sign in'",
                10

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
                By.xpath("//*[contains(@resource-id, 'com.google.android.gms:id/account_name')]"),
                "Cannot find 'Sign in'",
                10
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

        waitForElementAndClear(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_first_name')]"),
                "Cannot find search input",
                2
        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_first_name')]"),
                "Test First-Name",
                "Cannot find search input",
                2
        );

        waitForElementAndClear(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_last_name')]"),
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

        waitForElementAndClear(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_city')]"),
                "Cannot find search input",
                2
        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_city')]"),
                "Luanda",
                "Cannot find search input",
                5
        );

        waitForElementAndClear(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_zip')]"),
                "Cannot find search input",
                2
        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_zip')]"),
                "04060",
                "Cannot find search input",
                5
        );

        waitForElementAndClear(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_street')]"),
                "Cannot find search input",
                2
        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_street')]"),
                "Test Street 12A",
                "Cannot find search input",
                5
        );

        swipeUpToFindElement(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_number')]"),
                "Cannot find the end of the article",
                20
        );

        waitForElementAndClear(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_number')]"),
                "Cannot find search input",
                2
        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_number')]"),
                "123b",
                "Cannot find search input",
                5

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
    public void log_in_change_password()
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
                By.xpath("//*[contains(@resource-id, 'com.google.android.gms:id/account_name')]"),
                "Cannot find 'Sign in'",
                10
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
                By.xpath("//*[contains(@text, 'Change password')]"),
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

        waitForElementPresent(
                By.xpath("//*[@text='Password should be at least 6 symbols long']"),
                "Cannot delete saved article",
                5
        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_confirm')]"),
                "Cannot find 'Sign in'",
                5
        );

        waitForElementPresent(
                By.xpath("//*[@text='Password should be at least 6 symbols long']"),
                "Cannot delete saved article",
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
                3
        );

        waitForElementPresent(
                By.xpath("//*[@text='The old pass in incorrect']"),
                "Cannot delete saved article",
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
                "1234567",
                "Cannot find search input",
                2
        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/change_btn')]"),
                "Cannot find 'Sign in'",
                3
        );

        waitForElementPresent(
                By.xpath("//*[@text='Passwords do not match']"),
                "Cannot delete saved article",
                5
        );

        waitForElementAndClear(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_confirm')]"),
                "Cannot find search input",
                2
        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_confirm')]"),
                "1234567",
                "Cannot find search input",
                2
        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/change_btn')]"),
                "Cannot find 'Sign in'",
                3
        );

    }

    @Test
    public void share_link_by_email()
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
                5

        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_password')]"),
                "1234567",
                "Cannot find search input",
                5

        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/sign_in_btn')]"),
                "Cannot find 'Sign in'",
                5

        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'com.google.android.gms:id/account_name')]"),
                "Cannot find 'Sign in'",
                5

        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/nav_profile')]"),
                "Cannot find 'Profile tab'",
                5

        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/get_fitys_btn')]"),
                "Cannot find 'Share referral link' button",
                5

        );

        waitForElementAndClick(
                By.xpath("//*[contains(@text, 'Gmail')]"),
                "Cannot find 'Share referral link' button",
                5

        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'com.google.android.gm:id/to')]"),
                "dima.laktionov5@gmail.com",
                "Cannot find search input",
                5

        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'com.google.android.gm:id/send')]"),
                "Cannot find 'Share referral link' button",
                5

        );

    }

    @Test
    public void share_link_by_facebook()
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
                5

        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_password')]"),
                "1234567",
                "Cannot find search input",
                5

        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/sign_in_btn')]"),
                "Cannot find 'Sign in'",
                5

        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'com.google.android.gms:id/account_name')]"),
                "Cannot find 'Sign in'",
                5

        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/nav_profile')]"),
                "Cannot find 'Profile tab'",
                5

        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/get_fitys_btn')]"),
                "Cannot find 'Share referral link' button",
                5

        );

        waitForElementAndClick(
                By.xpath("//*[contains(@text, 'Facebook')]"),
                "Cannot find 'Share referral link' button",
                5

        );
    }

    @Test
    public void log_in_edit_profile()
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
                By.xpath("//*[contains(@resource-id, 'com.google.android.gms:id/account_name')]"),
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
                By.xpath("//*[contains(@text, 'Edit profile')]"),
                "Cannot find 'Sign in'",
                5

        );

        waitForElementAndClick(
                By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']"),
                "Cannot close article, cannot find X link",
                5

        );

        waitForElementAndClick(
                By.xpath("//*[contains(@text, 'Edit profile')]"),
                "Cannot find 'Sign in'",
                5

        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/save_btn')]"),
                "Cannot find 'Sign in'",
                5

        );

        waitForElementPresent(
                By.xpath("//*[@text='You cannot change email to the current one']"),
                "Cannot delete saved article",
                5
        );

        waitForElementAndClear(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_email')]"),
                "Cannot find 'Sign in'",
                5

        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_email')]"),
                "Test",
                "Cannot find search input",
                2

        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/save_btn')]"),
                "Cannot find 'Sign in'",
                5

        );

        waitForElementPresent(
                By.xpath("//*[@text='Use correct email format']"),
                "Cannot delete saved article",
                5
        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_email')]"),
                "@gmail.com",
                "Cannot find search input",
                2

        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/save_btn')]"),
                "Cannot find 'Sign in'",
                5

        );

        waitForElementPresent(
                By.xpath("//*[@text='This email is already used']"),
                "Cannot delete saved article",
                5
        );

        waitForElementAndClear(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_email')]"),
                "Cannot find 'Sign in'",
                5

        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/edit_email')]"),
                "Test3@gmail.com",
                "Cannot find search input",
                2

        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/save_btn')]"),
                "Cannot find 'Sign in'",
                5

        );


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

    private WebElement waitForElementInCollectionAndClick(By by, int i, String error_message, long timeoutInSeconds)
    {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.withMessage(error_message +"\n");
        List<WebElement> element = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        System.out.println(element.size()+" elements found");
        element.get(i).click();
        return element.get(i);
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
