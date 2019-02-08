package Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class ActionClass extends Locator {

WebDriver driver;

	public void type(By locator, String data) throws InterruptedException
	{
	
			Actions actions = new Actions(driver);
			 actions.moveToElement(driver.findElement(locator));
		        actions.click();
		        actions.sendKeys(data);
		        actions.build().perform();
		        Thread.sleep(500);

		
		
	}




	public void click(By locator) // To click on a locatoraf
	{
		driver.findElement(locator).click();
		
	}


		}

	



