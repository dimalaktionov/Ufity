import io.appium.java_client.TouchAction;
import lib.CoreTestCase;
import lib.ui.MainPageObject;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import java.net.URL;
import java.util.List;

public class FirstTest extends CoreTestCase {

    private lib.ui.MainPageObject MainPageObject;

    protected void setUp() throws Exception
    {
        super.setUp();

        MainPageObject = new MainPageObject(driver);
    }

    @Test
    public void test_Sign_in_purchase_select_added_card()
    {
        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id,'app.ufity.debug:id/sign_in_txt')]"),
                "Cannot find 'Sign in now' button",
                5
        );

        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_username')]"),
                "user011118",
                "Cannot find & input 'Username'",
                5
        );

        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_password')]"),
                "Lakti0n0v2209",
                "Cannot find & input 'Password'",
                5
        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id,'app.ufity.debug:id/sign_in_btn')]"),
                "Cannot find & click 'Sign in'  button",
                15
        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'com.google.android.gms:id/account_name')]"),
                "Cannot find 'Account_name'",
                10

        );

        MainPageObject.waitForElementInCollectionAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/vBottomNavigation')]//*[@class='android.widget.ImageButton']"),
                1,
                "Cannot find Cart element of collection",
                5

        );

        /*MainPageObject.swipeUpToFindElement(
                By.xpath("//*[contains(@text, 'Ski Helmet')]"),
                "Cannot find Ski Helmet1",
                1
        );*/

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@text, 'Armband SHAPEHEART')]"),
                "Cannot click to Armband SHAPEHEART",
                10

        );

        MainPageObject.swipeUpToFindElement(
                By.xpath("//*[contains(@text, 'Buy Now for 75.00 $')]"),
                "Cannot find Ski Helmet1",
                3
        );

        /*MainPageObject.swipeElementToRight(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/seekBar')]"),
                "Cannot click to Seek bar"

        );

        /*MainPageObject.swipeElementToLeft(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/seekBar')]"),
                "Cannot click to Seek bar1"

        );*/

        /*MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@text, 'Buy Now for 75.00 $')]"),
                "Cannot click to Strawberry",
                10

        );

        MainPageObject.swipeUpToFindElement(
                By.xpath("//*[contains(@resource-id,'app.ufity.debug:id/tvPaymentMethodChoose')]"),
                "Cannot find Add new card ",
                20
        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id,'app.ufity.debug:id/tvPaymentMethodChoose')]"),
                "Cannot click Add new card",
                10

        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@text,'Add new card…')]"),
                "Cannot click Add new card",
                10

        );

        //Add card number
        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@text, '1234 1234 1234 1234')]"),
                "4242 4242 4242 4242 0120 111",
                "Cannot find card number field",
                15
        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id,'app.ufity.debug:id/action_save')]"),
                "Cannot click Action_Save button",
                15

        );

        driver.navigate().back();

        /*MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@content-desc, 'Navigate up')]//*[@class='android.widget.ImageButton']"),
                "Cannot click Back button",
                15

        );*/

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@text, 'Buy Now')]"),
                "Cannot click to 'Buy Now' button",
                10
        );

    }

    @Test
    public void test_Sign_in_purchase_with_adding_card()
    {
        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id,'app.ufity.debug:id/sign_in_txt')]"),
                "Cannot find 'Sign in now' button",
                5
        );

        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_username')]"),
                "user011118",
                "Cannot find & input 'Username'",
                5
        );

        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_password')]"),
                "Lakti0n0v2209",
                "Cannot find & input 'Password'",
                5
        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id,'app.ufity.debug:id/sign_in_btn')]"),
                "Cannot find & click 'Sign in'  button",
                15
        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'com.google.android.gms:id/account_name')]"),
                "Cannot find 'Account_name'",
                10

        );

        MainPageObject.waitForElementInCollectionAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/vBottomNavigation')]//*[@class='android.widget.ImageButton']"),
                1,
                "Cannot find Cart element of collection",
                5

        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@text, 'Armband SHAPEHEART')]"),
                "Cannot click to Armband SHAPEHEART",
                10

        );

        MainPageObject.swipeUpToFindElement(
                By.xpath("//*[contains(@text, 'Buy Now for 75.00 $')]"),
                "Cannot find Buy Now for 75.00 $",
                3
        );

        /*MainPageObject.swipeElementToRight(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/seekBar')]"),
                "Cannot click to Seek bar"

        );

        /*MainPageObject.swipeElementToLeft(
                By.xpath("//*[contains(@resource-id, 'app.ufity:id/seekBar')]"),
                "Cannot click to Seek bar1"

        );*/

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@text, 'Buy Now for 75.00 $')]"),
                "Cannot click Buy Now for 75.00 $",
                10

        );

        MainPageObject.swipeUpToFindElement(
                By.xpath("//*[contains(@resource-id,'app.ufity.debug:id/tvPaymentMethodChoose')]"),
                "Cannot find Add new card ",
                20
        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id,'app.ufity.debug:id/tvPaymentMethodChoose')]"),
                "Cannot click Add new card",
                10

        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@text,'Add new card…')]"),
                "Cannot click Add new card",
                10

        );

        //Add card number
        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@text, '1234 1234 1234 1234')]"),
                "4242 4242 4242 4242 0120 111",
                "Cannot find card number field",
                15
        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id,'app.ufity.debug:id/action_save')]"),
                "Cannot click Action_Save button",
                15

        );

        driver.navigate().back();

        /*MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@content-desc, 'Navigate up')]//*[@class='android.widget.ImageButton']"),
                "Cannot click Back button",
                15

        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@text, 'Buy Now')]"),
                "Cannot click to 'Buy Now' button",
                10
        );*/

    }


    @Test
    public void test_Sign_in_scrolling() {
        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id,'app.ufity.debug:id/sign_in_txt')]"),
                "Cannot find 'Sign in now' button",
                5
        );

        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_username')]"),
                "user011118",
                "Cannot find & input 'Username'",
                5
        );

        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_password')]"),
                "Lakti0n0v2209",
                "Cannot find & input 'Password'",
                5
        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id,'app.ufity.debug:id/sign_in_btn')]"),
                "Cannot find & click 'Sign in'  button",
                15
        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'com.google.android.gms:id/account_name')]"),
                "Cannot find 'Account_name'",
                10

        );

        MainPageObject.waitForElementInCollectionAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/vBottomNavigation')]//*[@class='android.widget.ImageButton']"),
                1,
                "Cannot find Cart element of collection",
                5

        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@text, 'Powerbeats3 Wireless')]"),
                "Cannot click to Powerbeats3 Wireless",
                10

        );

        MainPageObject.swipeUpToFindElement(
                By.xpath("//*[contains(@text, 'Buy Now for 170.00 $')]"),
                "Cannot find Buy Now for 170.00 $",
                3
        );

        driver.navigate().back();

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@text, 'KUUBEE Resistance Bands')]"),
                "Cannot click to KUUBEE Resistance Bands",
                10

        );

        MainPageObject.swipeUpToFindElement(
                By.xpath("//*[contains(@text, 'Buy Now for 120.00 $')]"),
                "Cannot find Buy Now for 120.00 $",
                3
        );

        driver.navigate().back();

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@text, 'Armband SHAPEHEART')]"),
                "Cannot click to Armband SHAPEHEART",
                10

        );

        MainPageObject.swipeUpToFindElement(
                By.xpath("//*[contains(@text, 'Buy Now for 75.00 $')]"),
                "Cannot find Buy Now for 75.00 $",
                3
        );

        driver.navigate().back();

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@text, 'Massage')]"),
                "Cannot click to Massage",
                10

        );

        MainPageObject.swipeUpToFindElement(
                By.xpath("//*[contains(@text, 'Buy Now for 140.00 $')]"),
                "Cannot find Buy Now for 140.00 $",
                3
        );

        driver.navigate().back();

        MainPageObject.swipeUpToFindElement(
                By.xpath("//*[contains(@text, 'Longboard Apollo drop through soul flex 2')]"),
                "Cannot find Glasses",
                0
        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@text, 'Longboard Apollo drop through soul flex 2')]"),
                "Cannot click to Glasses",
                10

        );

        driver.navigate().back();

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@text, 'K2 Sodo - Inline Skate')]"),
                "Cannot click to K2 Sodo - Inline Skate",
                10

        );

        driver.navigate().back();

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@text, 'Ski 4FRNT Switchblade 2015')]"),
                "Cannot click to Ski 4FRNT Switchblade 2015",
                10

        );

        driver.navigate().back();

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@text, 'Flow fixations Micron Youth')]"),
                "Cannot click to Flow fixations Micron Youth",
                10

        );

        driver.navigate().back();
    }

    @Test
    public void test_Sign_in_success_Leaderboard_search() {
        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id,'app.ufity.debug:id/sign_in_txt')]"),
                "Cannot find Sign in now button",
                5
        );

        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_username')]"),
                "user011118",
                "Cannot find username field",
                5
        );

        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_password')]"),
                "Lakti0n0v2209",
                "Cannot find password field",
                5
        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id,'app.ufity.debug:id/sign_in_btn')]"),
                "Cannot find Sign in  button",
                10
        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'com.google.android.gms:id/account_name')]"),
                "Cannot find 'Account_name'",
                10

        );

        MainPageObject.waitForElementInCollectionAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/vBottomNavigation')]//*[@class='android.widget.ImageButton']"),
                2,
                "Cannot find Cart element of collection",
                15

        );

        MainPageObject.waitForElementPresent(
                By.xpath("//*[@text='user011118']"),
                "Cannot find user011118",
                5
        );

        MainPageObject.swipeUpToFindElement(
                By.xpath("//*[contains(@text, 'croiker')]"),
                "Cannot find croiker",
                3
        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/back_to_user_btn')]"),
                "Cannot find Back to user button",
                10

        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"),
                "Cannot find Back to user button",
                10

        );

        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@text, 'Search')]"),
                "alenaa",
                "Cannot find username alenaa",
                5
        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/clear_btn')]"),
                "Cannot find Back to user button",
                10

        );

    }

    @Test
    public void test_Sign_Up()
    {
        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id,'app.ufity.debug:id/login_sign_up_btn')]"),
                "Cannot find and click Signup button",
                5
        );

        //Empty confirm email field
        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_email_confirm')]"),
                "Cannot find & click edit_email_confirm",
                1
        );

        MainPageObject.waitForElementPresent(
                By.xpath("//*[@text='Username should be at least 3 symbols long']"),
                "Cannot find username text_input_error",
                5
        );

        //Empty password field
        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_password')]"),
                "Cannot find Username field",
                1
        );

        //Empty invite code field
        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_invite')]"),
                "Cannot find Username field",
                1
        );

        MainPageObject.waitForElementPresent(
                By.xpath("//*[@text='Password should be at least 6 symbols long']"),
                "Cannot delete saved article",
                5
        );

        //Add username with more than 15 letters (18 Letters)
        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_username')]"),
                "TestUser1TestUser1",
                "Cannot find search input",
                2
        );

        MainPageObject.waitForElementAndClear(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_username')]"),
                "Cannot find search",
                2
        );

        //Add username with less 3 letters (1 Letter)
        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_username')]"),
                "T",
                "Cannot find search input",
                2
        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_email')]"),
                "Cannot find SIGN UP button",
                1
        );

        MainPageObject.waitForElementAndClear(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_username')]"),
                "Cannot find search",
                2
        );

        //Add username with numbers (6 numbers)
        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_username')]"),
                "123456",
                "Cannot find search input",
                2
        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_email')]"),
                "Cannot find SIGN UP button",
                1
        );

        MainPageObject.waitForElementAndClear(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_username')]"),
                "Cannot find search",
                5
        );

        //Add username with space
        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_username')]"),
                "Test User",
                "Cannot find search input",
                2
        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_email')]"),
                "Cannot find SIGN UP button",
                1
        );

        MainPageObject.waitForElementAndClear(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_username')]"),
                "Cannot find search",
                2
        );

        //Add username with underscore & hyphens
        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_username')]"),
                "Test-User_",
                "Cannot find search input",
                2
        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_email')]"),
                "Cannot find SIGN UP button",
                1
        );

        MainPageObject.waitForElementAndClear(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_username')]"),
                "Cannot find search",
                2
        );

        //Add username with underscore & hyphens
        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_username')]"),
                "Test-User_",
                "Cannot find search input",
                2
        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_email_confirm')]"),
                "Cannot find SIGN UP button",
                1
        );

        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_email')]"),
                "TestUser1",
                "Cannot find search input",
                2

        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_email_confirm')]"),
                "Cannot find SIGN UP button",
                1
        );

        MainPageObject.waitForElementAndClear(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_email')]"),
                "Cannot find search",
                2
        );

        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_email')]"),
                "dima.laktionov5@gmail.com",
                "Cannot find search input",
                2

        );

        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_email_confirm')]"),
                "TestUser2@gmail.com",
                "Cannot find search input",
                2

        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_password')]"),
                "Cannot find SIGN UP button",
                1
        );

        MainPageObject.waitForElementAndClear(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_email_confirm')]"),
                "Cannot find search",
                2
        );

        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_email_confirm')]"),
                "dima.laktionov5@gmail.com",
                "Cannot find search input",
                2

        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_password')]"),
                "Cannot find SIGN UP button",
                1
        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_invite')]"),
                "Cannot find SIGN UP button",
                1
        );

        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_password')]"),
                "1",
                "Cannot find search input",
                2

        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_invite')]"),
                "Cannot find SIGN UP button",
                1
        );

        MainPageObject.waitForElementAndClear(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_password')]"),
                "Cannot find search",
                2
        );

        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_password')]"),
                "Test-User_",
                "Cannot find search input",
                2

        );

        MainPageObject.waitForElementAndClear(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_password')]"),
                "Cannot find search",
                2
        );

        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_password')]"),
                "123456",
                "Cannot find search input",
                2

        );

        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_invite')]"),
                "Test-User_",
                "Cannot find search input",
                2

        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/cbTerms')]"),
                "Cannot find SIGN UP button",
                1
        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@class, 'android.widget.ImageButton')]"),
                "Cannot find SIGN UP button",
                1
        );

    }

    @Test
    public void test_restore_password()
    {
        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@text, 'Sign in')]"),
                "Cannot find 'Sign in'",
                5
        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@text, 'Click here')]"),
                "Cannot find 'Sign in'",
                5
        );

        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_email')]"),
                "dima.laktionov5@gmail.com",
                "Cannot find search input",
                2

        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/change_btn')]"),
                "Cannot find 'Sign in'",
                5
        );



    }

    @Test
    public void test_log_in_leaderboard()
    {
        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@text, 'Sign in now')]"),
                "Cannot find 'Sign in'",
                5
        );

        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_username')]"),
                "user011118",
                "Cannot find search input",
                2

        );

        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_password')]"),
                "Lakti0n0v2209",
                "Cannot find search input",
                2

        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/sign_in_btn')]"),
                "Cannot find 'Sign in'",
                10

        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'com.google.android.gms:id/account_name')]"),
                "Cannot find 'Sign in'",
                10

        );

        MainPageObject.waitForElementInCollectionAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/vBottomNavigation')]//*[@class='android.widget.ImageButton']"),
                2,
                "Cannot find Cart element of collection",
                15

        );

    }

    @Test
    public void test_log_in_transaction_history()
    {
        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@text, 'Sign in now')]"),
                "Cannot find 'Sign in'",
                5
        );

        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_username')]"),
                "user011118",
                "Cannot find search input",
                2

        );

        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_password')]"),
                "Lakti0n0v2209",
                "Cannot find search input",
                2

        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/sign_in_btn')]"),
                "Cannot find 'Sign in'",
                10

        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'com.google.android.gms:id/account_name')]"),
                "Cannot find 'Sign in'",
                10

        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/history_btn')]"),
                "Cannot find 'Sign in'",
                10

        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@class, 'android.widget.ImageButton')]"),
                "Cannot find 'Sign in'",
                10

        );

    }

    @Test
    public void test_log_in_change_shipping_address_correct_scenario()
    {
        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@text, 'Sign in')]"),
                "Cannot find 'Sign in'",
                5

        );

        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_username')]"),
                "user011118",
                "Cannot find Edit username field",
                10
        );

        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_password')]"),
                "Lakti0n0v2209",
                "Cannot find Edit password field",
                5
        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/sign_in_btn')]"),
                "Cannot find 'Sign in'",
                5
        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'com.google.android.gms:id/account_name')]"),
                "Cannot find 'Account name'",
                10
        );

        MainPageObject.waitForElementInCollectionAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/vBottomNavigation')]//*[@class='android.widget.ImageButton']"),
                3,
                "Cannot find Cart element of collection",
                15

        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/settings_profile_btn')]"),
                "Cannot find 'Settings_profile' button",
                5
        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/change_address_btn')]"),
                "Cannot find 'Change_address' button",
                5
        );

        MainPageObject.waitForElementAndClear(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_first_name')]"),
                "Cannot find Edit First_name button",
                5
        );

        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_first_name')]"),
                "Test First-Name",
                "Cannot find Edit_first_name",
                5
        );

        MainPageObject.waitForElementAndClear(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_last_name')]"),
                "Cannot find edit_last_name",
                5
        );

        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_last_name')]"),
                "Test Last-Name",
                "Cannot find edit_last_name",
                5

        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_country')]"),
                "Cannot find edit_country",
                5
        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@text, 'Angola')]"),
                "Cannot find text 'Angola'",
                5
        );

        MainPageObject.waitForElementAndClear(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_city')]"),
                "Cannot find edit_city",
                5
        );

        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_city')]"),
                "Luanda",
                "Cannot put Luanda",
                5
        );

        MainPageObject.waitForElementAndClear(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_zip')]"),
                "Cannot find and clear edit_zip",
                5
        );

        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_zip')]"),
                "04060",
                "Cannot find and put edit_zip",
                5
        );

        MainPageObject.waitForElementAndClear(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_street')]"),
                "Cannot find and clear edit_street",
                5
        );

        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_street')]"),
                "Test Street 12A",
                "Cannot find and put edit_street",
                5
        );

        MainPageObject.swipeUpToFindElement(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_number')]"),
                "Cannot find and swipe edit_number",
                20
        );

        MainPageObject.waitForElementAndClear(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_number')]"),
                "Cannot find and clear edit_number",
                2
        );

        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_number')]"),
                "123b",
                "Cannot find and put edit_number",
                5

        );

        MainPageObject.swipeUpToFindElement(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_flat')]"),
                "Cannot find edit_flat",
                20
        );

        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_flat')]"),
                "1b",
                "Cannot find and put edit_flat",
                5

        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/change_btn')]"),
                "Cannot find and click'change_btn'",
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
    public void test_log_in_change_password()
    {
        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@text, 'Sign in now')]"),
                "Cannot find 'Sign in' button",
                5

        );

        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_username')]"),
                "user011118",
                "Cannot find User name field",
                2
        );

        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_password')]"),
                "Lakti0n0v2209",
                "Cannot find password field",
                2
        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/sign_in_btn')]"),
                "Cannot find 'Sign in' button",
                5
        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'com.google.android.gms:id/account_name')]"),
                "Cannot find 'Account_name'",
                10
        );

        MainPageObject.waitForElementInCollectionAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/vBottomNavigation')]//*[@class='android.widget.ImageButton']"),
                3,
                "Cannot find Profile of collection",
                15

        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/settings_profile_btn')]"),
                "Cannot find 'Settings' button",
                5
        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@text, 'Change password')]"),
                "Cannot find 'Change password' button",
                5
        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_old')]"),
                "Cannot find 'Edit old password' field",
                5
        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_new')]"),
                "Cannot find 'Edit new password' field",
                5
        );

        MainPageObject.waitForElementPresent(
                By.xpath("//*[@text='Password should be at least 6 symbols long']"),
                "Cannot find red validation text",
                5
        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_confirm')]"),
                "Cannot find 'Edit confirm password' field",
                5
        );

        MainPageObject.waitForElementPresent(
                By.xpath("//*[@text='Password should be at least 6 symbols long']"),
                "Cannot find red validation text",
                5
        );

        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_old')]"),
                "1234567",
                "Cannot find Edit old password field",
                2
        );

        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_new')]"),
                "123456",
                "Cannot find Edit new password field",
                2
        );

        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_confirm')]"),
                "123456",
                "Cannot find Edit confirm field",
                2
        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/change_btn')]"),
                "Cannot find 'Change' button",
                5
        );

        /*waitForElementPresent(
                By.xpath("//*[@text='The old pass in incorrect']"),
                "Cannot find red toast/The old pass in incorrect",
                5
        );*/

        MainPageObject.waitForElementAndClear(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_old')]"),
                "Cannot find Edit old password field",
                2
        );

        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_old')]"),
                "123456",
                "Cannot find Edit old field",
                2
        );

        MainPageObject.waitForElementAndClear(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_new')]"),
                "Cannot find Edit new field",
                2
        );

        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_new')]"),
                "123456",
                "Cannot find search input",
                2
        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/change_btn')]"),
                "Cannot find 'Sign in'",
                10
        );

        /*waitForElementPresent(
                By.xpath("//*[@text='Passwords do not match']"),
                "Cannot find Passwords do not match error",
                10
        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_new')]"),
                "Cannot find 'New password' field",
                10
        );

        waitForElementAndClear(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_confirm')]"),
                "Cannot find search input",
                2
        );

        waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_confirm')]"),
                "123456",
                "Cannot find search input",
                2
        );

        waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/change_btn')]"),
                "Cannot find 'Sign in'",
                3
        );*/

    }

    @Test
    public void test_share_link_by_email()
    {
        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@text, 'Sign in')]"),
                "Cannot find 'Sign in'",
                5

        );

        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_username')]"),
                "user011118",
                "Cannot find search input",
                5

        );

        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_password')]"),
                "Lakti0n0v2209",
                "Cannot find search input",
                10

        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/sign_in_btn')]"),
                "Cannot find & click 'Sign in'",
                10

        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'com.google.android.gms:id/account_name')]"),
                "Cannot find 'Account_name'",
                10

        );

        MainPageObject.waitForElementInCollectionAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/vBottomNavigation')]//*[@class='android.widget.ImageButton']"),
                3,
                "Cannot find Profile of collection",
                15

        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/get_fitys_btn')]"),
                "Cannot find 'Share referral link' button",
                5

        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@text, 'Gmail')]"),
                "Cannot find 'Share referral link' button",
                5

        );

        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'com.google.android.gm:id/to')]"),
                "dima.laktionov5@gmail.com",
                "Cannot find search input",
                5

        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'com.google.android.gm:id/send')]"),
                "Cannot find 'Share referral link' button",
                5

        );

    }

    @Test
    public void test_share_link_by_facebook()
    {
        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@text, 'Sign in')]"),
                "Cannot find 'Sign in'",
                5

        );

        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_username')]"),
                "user011118",
                "Cannot find search input",
                5

        );

        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_password')]"),
                "Lakti0n0v2209",
                "Cannot find search input",
                5

        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/sign_in_btn')]"),
                "Cannot find 'Sign in'",
                5

        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'com.google.android.gms:id/account_name')]"),
                "Cannot find 'Account_name'",
                10

        );

        MainPageObject.waitForElementInCollectionAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/vBottomNavigation')]//*[@class='android.widget.ImageButton']"),
                3,
                "Cannot find Profile of collection",
                15

        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/get_fitys_btn')]"),
                "Cannot find 'Share referral link' button",
                5

        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@text, 'Facebook')]"),
                "Cannot find 'Share referral link' button",
                5

        );
    }

    @Test
    public void test_log_in_edit_profile()
    {
        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@text, 'Sign in')]"),
                "Cannot find 'Sign in'",
                5

        );

        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_username')]"),
                "user011118",
                "Cannot find search input",
                2

        );

        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_password')]"),
                "Lakti0n0v2209",
                "Cannot find search input",
                2

        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/sign_in_btn')]"),
                "Cannot find 'Sign in'",
                5

        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'com.google.android.gms:id/account_name')]"),
                "Cannot find 'Account_name'",
                10

        );

        MainPageObject.waitForElementInCollectionAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/vBottomNavigation')]//*[@class='android.widget.ImageButton']"),
                3,
                "Cannot find Profile of collection",
                15

        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/settings_profile_btn')]"),
                "Cannot find 'Sign in'",
                5

        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@text, 'Edit profile')]"),
                "Cannot find 'Sign in'",
                5

        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//android.widget.ImageButton[@content-desc='Navigate up']"),
                "Cannot close article, cannot find X link",
                5

        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@text, 'Edit profile')]"),
                "Cannot find 'Sign in'",
                5

        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/save_btn')]"),
                "Cannot find 'Sign in'",
                5

        );

        MainPageObject.waitForElementPresent(
                By.xpath("//*[@text='You cannot change email to the current one']"),
                "Cannot delete saved article",
                5
        );

        MainPageObject.waitForElementAndClear(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_email')]"),
                "Cannot find 'Sign in'",
                5

        );

        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_email')]"),
                "Test",
                "Cannot find search input",
                2

        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/save_btn')]"),
                "Cannot find 'Sign in'",
                5

        );

        MainPageObject.waitForElementPresent(
                By.xpath("//*[@text='Use correct email format']"),
                "Cannot delete saved article",
                5
        );

        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_email')]"),
                "@gmail.com",
                "Cannot find search input",
                2

        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/save_btn')]"),
                "Cannot find 'Sign in'",
                5

        );

        MainPageObject.waitForElementPresent(
                By.xpath("//*[@text='This email is already used']"),
                "Cannot delete saved article",
                5
        );

        MainPageObject.waitForElementAndClear(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_email')]"),
                "Cannot find 'Sign in'",
                5

        );

        MainPageObject.waitForElementAndSendKeys(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_email')]"),
                "Test3@gmail.com",
                "Cannot find search input",
                2

        );

        MainPageObject.waitForElementAndClick(
                By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/save_btn')]"),
                "Cannot find 'Sign in'",
                5

        );


    }




    @Test
    public void test_log_in()
        {
            MainPageObject.waitForElementAndClick(
                    By.xpath("//*[contains(@text, 'Sign in')]"),
                    "Cannot find and Click 'Sign in'",
                    5

            );

            MainPageObject.waitForElementAndSendKeys(
                    By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_username')]"),
                    "Test-User_",
                    "Cannot find Edit username field",
                    2

            );

            MainPageObject.waitForElementAndSendKeys(
                    By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_password')]"),
                    "123456",
                    "Cannot find Edit password field",
                    10

            );

            MainPageObject.waitForElementAndClick(
                    By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/sign_in_btn')]"),
                    "Cannot find 'Sign in' button",
                    10

            );

            /*waitForElementAndClick(
                    By.xpath("//*[contains(@text, 'OK')]"),
                    "Cannot find 'Sign in'",
                    5

            );*/

            MainPageObject.waitForElementAndClick(
                    By.xpath("//*[contains(@resource-id, 'com.google.android.gms:id/account_name')]"),
                    "Cannot find 'Account_name'",
                    10

            );

            MainPageObject.waitForElementInCollectionAndClick(
                    By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/vBottomNavigation')]//*[@class='android.widget.ImageButton']"),
                    3,
                    "Cannot find Profile of collection",
                    15

            );

            MainPageObject.waitForElementAndClick(
                    By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/settings_profile_btn')]"),
                    "Cannot find 'Sign in'",
                    5

            );

            MainPageObject.waitForElementAndClick(
                    By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_pofile_btn')]"),
                    "Cannot find 'Sign in'",
                    5

            );

            MainPageObject.waitForElementAndClear(
                    By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_email')]"),
                    "Cannot find 'Sign in'",
                    5

            );

            MainPageObject.waitForElementAndClick(
                    By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/save_btn')]"),
                    "Cannot find 'Sign in'",
                    5

            );

            MainPageObject.waitForElementAndSendKeys(
                    By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_email')]"),
                    "user21089@bigmir.net",
                    "Cannot find search input",
                    2

            );

            MainPageObject.waitForElementAndClick(
                    By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/save_btn')]"),
                    "Cannot find 'Sign in'",
                    5

            );

            MainPageObject.waitForElementAndClick(
                    By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_pofile_btn')]"),
                    "Cannot find 'Sign in'",
                    5

            );

            MainPageObject.waitForElementAndClear(
                    By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_email')]"),
                    "Cannot find search input",
                    2

            );

            MainPageObject.waitForElementAndSendKeys(
                    By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_email')]"),
                    "user210810@bigmir.net",
                    "Cannot find search input",
                    2

            );

            MainPageObject.waitForElementAndClick(
                    By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/save_btn')]"),
                    "Cannot find 'Sign in'",
                    5

            );

            MainPageObject.waitForElementAndClick(
                    By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_pofile_btn')]"),
                    "Cannot find 'Sign in'",
                    5

            );

            MainPageObject.waitForElementAndClick(
                    By.xpath("//*[contains(@class, 'android.widget.ImageButton')]"),
                    "Cannot find 'Sign in'",
                    5

            );

            MainPageObject.waitForElementAndClick(
                    By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/change_password_btn')]"),
                    "Cannot find 'Sign in'",
                    5

            );

            MainPageObject.waitForElementAndClick(
                    By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_old')]"),
                    "Cannot find 'Sign in'",
                    5

            );

            MainPageObject.waitForElementAndClick(
                    By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_new')]"),
                    "Cannot find 'Sign in'",
                    5

            );

            MainPageObject.waitForElementAndClick(
                    By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_confirm')]"),
                    "Cannot find 'Sign in'",
                    5

            );

            MainPageObject.waitForElementAndClick(
                    By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_old')]"),
                    "Cannot find 'Sign in'",
                    5

            );

            MainPageObject.waitForElementAndSendKeys(
                    By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_old')]"),
                    "123456",
                    "Cannot find search input",
                    2

            );

            MainPageObject.waitForElementAndSendKeys(
                    By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_new')]"),
                    "123456",
                    "Cannot find search input",
                    2

            );

            MainPageObject.waitForElementAndSendKeys(
                    By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_confirm')]"),
                    "123456",
                    "Cannot find search input",
                    10

            );

            MainPageObject.waitForElementAndClick(
                    By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/change_btn')]"),
                    "Cannot find 'Sign in'",
                    5

            );

            /*waitForElementAndClear(
                    By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_old')]"),
                    "Cannot find search input",
                    10

            );

            waitForElementAndSendKeys(
                    By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_old')]"),
                    "1234567",
                    "Cannot find search input",
                    10

            );

            waitForElementAndClear(
                    By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_new')]"),
                    "Cannot find search input",
                    10

            );

            waitForElementAndSendKeys(
                    By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_new')]"),
                    "12345",
                    "Cannot find search input",
                    10

            );

            waitForElementAndClick(
                    By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/change_btn')]"),
                    "Cannot find 'Sign in'",
                    5

            );

            waitForElementAndClick(
                    By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/change_btn')]"),
                    "Cannot find 'Sign in'",
                    5

            );

            waitForElementAndClear(
                    By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_new')]"),
                    "Cannot find search input",
                    10

            );

            waitForElementAndSendKeys(
                    By.xpath("//*[contains(@resource-id, 'app.ufity.debug:id/edit_new')]"),
                    "123456",
                    "Cannot find search input",
                    10

            );*/
        }




















}
