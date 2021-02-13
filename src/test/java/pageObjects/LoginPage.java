package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver localDriver;

    public LoginPage(WebDriver remoteDriver) {
        localDriver = remoteDriver;
        PageFactory.initElements(remoteDriver, this);
    }

    @FindBy(id = "txtUserID")
    @CacheLookup
    WebElement txtUserName;
    @FindBy(id = "txtPassword")
    @CacheLookup
    WebElement txtPassword;
    @FindBy(id = "sub")
    @CacheLookup
    WebElement loginButton;

    public void setUserName(String userName) {
        txtUserName.sendKeys(userName);
    }

    public void setPassword(String password) {
        txtPassword.sendKeys(password);
    }

    public void clickLogin() {
        loginButton.click();
    }
}
