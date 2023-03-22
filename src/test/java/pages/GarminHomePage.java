package pages;

import helpers.BaseHelper;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class GarminHomePage extends BaseHelper
{

    WebDriver driver;
    public GarminHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "username")
    WebElement signInButton;
   @FindBy(id = "password")
   WebElement passwordInputField;
   @FindBy(id = "gauth-widget")
   WebElement loginPopUpContainer;
   @FindBy(id = "gauth-widget-frame-gauth-widget")
   WebElement loginFrame;

    //Step 1:Navigate to "https://connect.garmin.com/signin"
    private void inputUserName (String user) {
        wdWait.until(ExpectedConditions.visibilityOf(loginPopUpContainer));
        wdWait.until(ExpectedConditions.visibilityOf(loginFrame));

        driver.switchTo().frame(loginFrame);

        WebElement usenameInputField = null;
        wdWait.until(ExpectedConditions.elementToBeClickable(usenameInputField));
        Object UsernameInputField;
        UsernameInputField = null;
        Clickable(UsernameInputField);
        Alert usernameInputField = null;
        usernameInputField.sendKeys(user);

    }

    private void Clickable(Object usernameInputField) {

    }

    private void inputPassword(String password)
    {
       wdWait.until(ExpectedConditions.elementToBeClickable(passwordInputField));
       passwordInputField.sendKeys(password);

    }
    public void inputCredentials(String user,String password)
    {
        inputUserName(user);
        inputPassword(password);
    }


    public void openSignInPage(String url) {
    }
}
