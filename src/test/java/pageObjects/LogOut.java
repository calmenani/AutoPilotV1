package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut {
	WebDriver localDriver;

	public LogOut(WebDriver remoteDriver) {
		localDriver = remoteDriver;
		PageFactory.initElements(remoteDriver, this);
	}

	@FindBy(xpath = "//*[@data-test-id='px-opr-image-ctrl']")
	@CacheLookup
	WebElement btnOprMenu;
	@FindBy(xpath = "//*[@title='Logout']")
	@CacheLookup
	WebElement logOutMenuLink;

	public void clickOperatoeMenu() {
		btnOprMenu.click();
	}

	public void clickLogOutMenuLink() {
		logOutMenuLink.click();
	}

	public void confirmLogOutAlert() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		localDriver.switchTo().alert().accept();// close logout alert
		localDriver.switchTo().defaultContent();
	}
}
