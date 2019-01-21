package SeleniumPackage;

import java.util.HashMap;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;;

public class TestNGAnnotations {
	
	WebDriver driver;

	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("BeforeSuite");
  	
	}
	@BeforeGroups
	public void BeforeGroups()
	{
		System.out.println("BeforeGroups");
		
	}
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("BeforeClass");
		
	}
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("BeforeTest");
		
	}

	@BeforeMethod
	public void testBeforeMethod()
	{
		System.out.println("BeforeMethod");
		
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("AfterMethod");
		
	}
	
	
	
	@Test(timeOut=1000)
	public void Test1() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("Test1");
		String str="dependsMethod";
		Assert.assertEquals(str, "dependsMethod");
		
	}
	//(groups= {"test34"}, dependsOnMethods={ "dependsMethodTest1" }, alwaysRun=true)
	@Test
	public void Test2()
	{
	/*System.setProperty("webdriver.chrome.driver", "C:\\jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
*/
		/*System.out.println("Test2");
		String str="Assert";
		Assert.assertEquals(str, "Assert");*/
		
		System.out.println("Test2");
		String str="dependsMethod";
		Assert.assertEquals(str, "dependsMethod");
		
		
	}
	
@Test
public void Test3()
	{
/*		System.out.println("Test3");
		String str="Assert23";
		Assert.assertEquals(str, "Assert23");*/
		System.out.println("Test3");
		String str="dependsMethod";
		Assert.assertEquals(str, "dependsMethod6");
		
		
	}
	
	
	
	
	/*@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[2][3];
		data[0][0]=1;
		data[0][1]=2;
		data[0][2]=3;
		
		data[1][0]=4;
		data[1][1]=5;
		data[1][2]=6;
		//data[0][2]=3;
		//data[0][3]=3;
		return data;
		}
	@Test
	public void test7()
	{
		
		System.out.println("@Test2");
		
	}
	int DataAvailable=3;
	@Test
	public void testCaseConditionalSkipException(){
		System.out.println("Im in Conditional Skip");
		if(DataAvailable>6)
		throw new SkipException("Skipping this exception");
		System.out.println("Executed Successfully");
	}

	@Test(enabled=false)
	public void testCaseEnablingfalse(){
			System.out.println("I'm Not Ready, please don't execute me");
		}
	@Test(enabled=true)
	public void testCaseEnablingTrue(){
			System.out.println("I'm  Ready, please  execute me");
		}


		@AfterTest
	public void test9()
	{
		System.out.println("@afterTest");
		
	}
	@AfterClass
	public void test10()
	{
		System.out.println("@AfterClass");
		
	}
*/	
	
	


}

