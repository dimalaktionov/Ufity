package lib.ui;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MainPageObject {

    protected AppiumDriver driver;

    public MainPageObject(AppiumDriver driver)
    {
        this.driver = driver;
    }

    public WebElement waitForElementPresent(By by, String error_message, long timeoutInSeconds)
    {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.withMessage(error_message +"\n");
        return wait.until(
                ExpectedConditions.presenceOfElementLocated(by)
        );

    }
    public WebElement waitForElementPresent(By by, String error_message)
    {
        return waitForElementPresent(by, error_message, 5);
    }
    public WebElement waitForElementAndClick(By by, String error_message, long timeoutInSeconds)
    {
        WebElement element = waitForElementPresent(by, error_message, timeoutInSeconds);
        element.click();
        return element;

    }

    public WebElement waitForElementInCollectionAndClick(By by, int i, String error_message, long timeoutInSeconds)
    {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.withMessage(error_message +"\n");
        List<WebElement> element = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
        System.out.println(element.size()+" elements found");
        element.get(i).click();
        return element.get(i);
    }

    public WebElement waitForElementAndSendKeys(By by, String value, String error_message, long timeoutInSeconds)
    {
        WebElement element = waitForElementPresent(by, error_message, timeoutInSeconds);
        element.sendKeys(value);
        return element;

    }

    public boolean waitForElementNotPresent(By by, String error_message, long timeoutInSeconds)
    {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.withMessage(error_message +"\n");
        return wait.until(
                ExpectedConditions.invisibilityOfElementLocated(by)
        );

    }

    public WebElement waitForElementAndClear(By by, String error_message, long timeoutInSeconds)
    {
        WebElement element = waitForElementPresent(by, error_message, timeoutInSeconds);
        element.clear();
        return element;

    }
    public void swipeUp(int timeOfSwipe)
    {
        TouchAction action = new TouchAction(driver);
        Dimension size = driver.manage().window().getSize();
        int x = size.width / 2;
        int start_y = (int) (size.height * 0.8);
        int end_y = (int) (size.height * 0.2);


        action.press(x, start_y).waitAction(timeOfSwipe).moveTo(x, end_y).release().perform();
    }


    public void swipeUpQuick()
    {
        swipeUp(200);
    }
    public void swipeUpToFindElement(By by, String error_message, int max_swipes)
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

    public void swipeElementToRight(By by, String error_message)
    {
        WebElement element = waitForElementPresent(
                by,
                error_message,
                10);

        int start = element.getLocation().getX();
        int end = element.getSize().getWidth();
        int y = element.getLocation().getY();

        TouchAction action = new TouchAction(driver);
        action
                .press(start, y)
                .moveTo(end, y)
                .release()
                .perform();

    }

    public void swipeElementToLeft(By by, String error_message)
    {
        WebElement element = waitForElementPresent(
                by,
                error_message,
                10);

        int start = element.getLocation().getX();
        int end = element.getSize().getWidth();
        int y = element.getLocation().getY();

        TouchAction action = new TouchAction(driver);
        action
                .press(start, y)
                .moveTo(end, y)
                .release()
                .perform();

    }
}
