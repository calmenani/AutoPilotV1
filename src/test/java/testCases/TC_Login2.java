package testCases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LogOut;
import pageObjects.LoginPage;
import utilities.XLUtils;

public class TC_Login2 extends BaseClass
{

	@Test(dataProvider="LoginData")
	public void loginDDT(String user,String pwd) throws InterruptedException, IOException
	{
		System.out.println("Login called");
		LoginPage lp = new LoginPage(driver);
        lp.setUserName(user);
        logger.info("User name entered");
        lp.setPassword(pwd);
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
	
	
	public boolean isAlertPresent() //user defined method created to check alert is presetn or not
	{
		try
		{
		driver.switchTo().alert();
		return true;
		}
		catch(NoAlertPresentException e)
		{
			return false;
		}
		
	}
	
	@DataProvider(name="LoginData")
	String[][] getdata() throws IOException
	{
		String path=System.getProperty("user.dir")+"/src/test/java/testData/TestData.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "Login");
		int colcount=XLUtils.getCellCount(path,"Login",1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path,"Login", i,j);//1 0
				System.out.println("Login data"+logindata[i-1][j]);
			}
				
		}
	return logindata;
	}
	
}