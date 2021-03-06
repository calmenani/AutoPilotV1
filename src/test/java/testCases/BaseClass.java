package testCases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import utilities.ReadConfig;

public class BaseClass {
    ReadConfig readConfig = new ReadConfig();
    public static WebDriver driver;
    public static Logger logger;
    public String appURL = readConfig.getApplicationURL();
    public String username = readConfig.getUsername();
    public String password = readConfig.getPassword();

    @Parameters("browser")
    @BeforeClass
    public void setup(String browserName) {
        logger = Logger.getLogger("CRM");
        PropertyConfigurator.configure("log4j.properties");
        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", readConfig.getChromeDriverPath());
            driver = new ChromeDriver();
        } else if (browserName.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver", readConfig.getFirefoxDriverPath());
            driver = new FirefoxDriver();
        } else if (browserName.equals("ie")) {
            System.setProperty("webdriver.ie.driver", readConfig.getIEDriverPath());
            driver = new InternetExplorerDriver();
        }
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(readConfig.getApplicationURL());
    }
    public void loginOut() throws InterruptedException
		{
    	System.out.println("Logout called");
		TC_LogOut logOut=new TC_LogOut();
		logOut.logOutTest();
		
		}
   @AfterSuite
    public void tearDown() {
        driver.quit();
        logger.info("All browser sessions are closed");
    }
    public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken at "+System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
	}
	
	public String randomestring()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return(generatedstring);
	}
	
	public static String randomeNum() {
		String generatedString2 = RandomStringUtils.randomNumeric(4);
		return (generatedString2);
	}
}
