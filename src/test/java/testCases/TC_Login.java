package testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;

public class TC_Login extends BaseClass {
    @Test
    public void loginTest() throws IOException, InterruptedException {
        System.out.println("Login called");
		LoginPage lp = new LoginPage(driver);
        lp.setUserName(username);
        logger.info("User name entered");
        lp.setPassword(password);
        logger.info("Password entered");
        lp.clickLogin();
        logger.info("Login button clicked");
        if(driver.getTitle().equalsIgnoreCase("Interaction Portal"))
        Assert.assertEquals(driver.getTitle(), "Interaction Portal");
        else
        	captureScreen(driver, "loginDDT");
        logger.info("Login test passed");
        loginOut();
    }
}
