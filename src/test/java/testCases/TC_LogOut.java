package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LogOut;
import pageObjects.LoginPage;

public class TC_LogOut extends BaseClass {
	@Test
	public void logOutTest() {
		LogOut lo = new LogOut(driver);
		lo.clickOperatoeMenu();
		logger.info("Clicked operator menu");
		lo.clickLogOutMenuLink();
		logger.info("Clicked logout menu");
		lo.confirmLogOutAlert();
		logger.info("Accepted logout confirm");
		Assert.assertEquals(driver.getTitle(), "Login Page");
		logger.info("Logout successful");
	}
}
