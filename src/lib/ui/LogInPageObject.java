/*package lib.ui;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class LogInPageObject extends MainPageObject{

    private static final String

    LOGIN_INIT_ELEMENT = "//*[contains(@resource-id,'app.ufity.debug:id/sign_in_txt')]",
    LOGIN_USERNAME_INPUT = "//*[contains(@resource-id, 'app.ufity.debug:id/edit_username')]",
    LOGIN_PASSWORD_INPUT = "//*[contains(@resource-id, 'app.ufity.debug:id/edit_password')]",
    LOGIN_SIGN_IN_BUTTON = "//*[contains(@resource-id,'app.ufity.debug:id/sign_in_btn')]",
    LOGIN_ACCOUNT_NAME = "//*[contains(@resource-id, 'com.google.android.gms:id/account_name')]",


    public LogInPageObject(AppiumDriver driver)
    {
        super(driver);
    }

    public void initLogIn()
    {
        this.waitForElementAndClick(By.xpath(LOGIN_INIT_ELEMENT), "Cannot find 'Sign in now' button", 5);
    }

    public void typeLogInLine(String search_line)
    {
        this.waitForElementAndSendKeys(By.xpath(LOGIN_USERNAME_INPUT), search_line, "Cannot find & input 'Username'", 5);
        this.waitForElementAndSendKeys(By.xpath(LOGIN_PASSWORD_INPUT), search_line, "Cannot find & input 'Password'", 5);

    }

    public void clickToSignInButton()
    {
        this.waitForElementAndClick(By.xpath(LOGIN_SIGN_IN_BUTTON), "Cannot find & click 'Sign in'  button", 5);
    }

}*/

