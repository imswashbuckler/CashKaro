package Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.math.IEEE754rUtils;
import org.apache.tools.ant.taskdefs.Sync.MyCopy;
import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utils.ExcelReader;

public class TestcLass extends ActionClass {
	ExcelReader read = new ExcelReader();
	InputStream inputStream;
	Properties prop;
	String File1;

	@BeforeSuite
	public void setup() throws IOException {
		prop = new Properties();
		String propFileName = "data\\config.properties";
		FileInputStream ip = new FileInputStream(propFileName);
		prop.load(ip);
		File1 = prop.getProperty("TestFile");
		System.out.println(File1);

	}

	@BeforeMethod
	@Parameters({"url" })
	public void setDriver(String Url) throws IOException {

		//passed this variable from jenkins
		String plateform=System.getProperty("plateform");
		
		if (plateform.equalsIgnoreCase("Firefox")) {
	    	System.setProperty("webdriver.firefox.marionette","libs\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			System.out.println("firefox driver selected");
			driver.get(Url);

		}
		if (plateform.equalsIgnoreCase("chrome")) {
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
			ChromeOptions option = new ChromeOptions();
			option.addArguments("disable-infobars");
			option.addArguments("start-maximized");
			option.merge(cap);
			System.setProperty("webdriver.chrome.driver","libs\\chromedriver_2.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println("Chrome driver selected");
			driver.get(Url);

		}
		if (plateform.equalsIgnoreCase("iexplorer")) {
			System.setProperty("webdriver.ie.driver", "libs\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.get(Url);
		}

	}

	@Test(description = "login Test Normal", dataProvider = "NormalLogin")
	public void SignINTestNormally(String firstName, String useremail,
			String userpassWord, String mobilenum) throws InterruptedException

	{
		try {
			click(Joinfree);
			type(firstname, firstName);
			type(email, useremail);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,300)");

			type(passWord, userpassWord);
			type(mobilenumber, mobilenum);
			Thread.sleep(2000);

			type(to_be_check,"13");
			click(join_free_submit);
			String txtd = driver.findElement(myAccount).getText();
			Assert.assertEquals(txtd,"My Account");

		}

		catch (RuntimeException ee) 
		{
			
				Assert.fail("Element No FOund");

			}
		}

	

	@Test(description = "login Test by FB", dataProvider = "fbloginData",timeOut=30000)
	public void SignINTestViaFB(String userid, String pwd)
			throws InterruptedException {
		try {
			click(Joinfree);
			click(FbSingupButton);
			ArrayList<String> win2 = new ArrayList<String>(
					driver.getWindowHandles());
			driver.switchTo().window(win2.get(1));

			/*WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.visibilityOfElementLocated(fbuserid));
*/			type(fbuserid, userid);
			type(fbpwd, pwd);
			click(fbloginButton);
			driver.switchTo().window(win2.get(0));
			String signintext = driver.findElement(myAccount).getText();
			System.out.println(signintext+"2");
						Assert.assertEquals(signintext, "My Account");
						
		} catch (RuntimeException ee) 
		{
			
			Assert.fail("Element No FOund");

		}

	}

	@Test(description = "ForgotPassWord Test Case", dataProvider = "email")
	public void ForgotPassword(String username) throws InterruptedException {
		try {
			click(SignIn);
			click(forgotPasswordLink);
			driver.switchTo().frame(driver.findElement(iframeResetPassword));
			type(enterfromemail, username);
			click(submit_req);
			String forgotpasswordtext = driver.findElement(MessagePassworSent)
					.getText();
			System.out.println(forgotpasswordtext+"3");
			Assert.assertEquals(forgotpasswordtext, "PASSWORD SENT!");
			
		} 
		catch (RuntimeException ee) 
		{
			
			Assert.fail("Element No FOund");

		}
		}

	@AfterMethod
	public void closedriver() {
		driver.quit();
	}

	@DataProvider(name = "NormalLogin")
	public Object[][] dataProviderLogin() throws IOException {

		if (File1 != null) {
			read.testDataFile(File1);
			Object[][] data = new Object[][] { {
					read.readFromColumn("Base", 1, 0),
					read.readFromColumn("Base", 2, 0),
					read.readFromColumn("Base", 3, 0),
					read.readFromColumn("Base", 4, 0) } };
			read.closeFile();

			return data;
		} else {
			System.out.println("File not found");
			return null;
		}
	}

	@DataProvider(name = "fbloginData")
	public Object[][] dataProvideremail() throws IOException {

		read.testDataFile(File1);
		Object[][] data = new Object[][] { { read.readFromColumn("Base", 1, 1),
			read.readFromColumn("Base", 2, 1) } };

		read.closeFile();
		return data;
	}

	@DataProvider(name = "email")
	public Object[][] email() throws IOException {

		read.testDataFile(File1);
		Object[][] data = new Object[][] { { read.readFromColumn("Base", 1, 2) } };

		read.closeFile();
		return data;
	}
}