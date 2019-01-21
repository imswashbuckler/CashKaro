package Geekodr;
import org.openqa.selenium.JavascriptExecutor;		
import org.openqa.selenium.Keys;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Geekoclass {
	static WebDriver fd;
	
	public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Ram.Sahu\\Downloads\\geckodriver.exe");
		 fd = new FirefoxDriver();
		 fd.manage().window().maximize();
			  fd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		       fd.get("http://toolsqa.com/automation-practice-form/");
       fd.manage().window().maximize();
       
      List<WebElement> ls = fd.findElements(By.id("DHAJHDK"));      
WebDriverWait wait1 =new WebDriverWait(fd,30);
      
WebElement element =(WebElement) wait1.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
//FluentWait<WebDriver> wait1 = new WebDriverWait(driver, 30).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
       /*WebElement rb = fd.findElement(By.id("sex-1"));
       rb.click();
       WebElement.sendKeys(Keys.RETURN);

       
       Thread.sleep(5000);
       WebElement rdb = fd.findElement(By.id("exp-3"));
       rdb.click();
       */
       WebElement rb = fd.findElement(By.id("sex-1"));
       rb.click();
       JavascriptExecutor js = (JavascriptExecutor)fd;
   	String script = "return document.getElementById('telefoon_28836_hidden').innerHTML";
   	String telno = (String) ((JavascriptExecutor) fd).executeScript(script);

  
   	WebElement invisibleelement= fd.findElement(By.id("s"));  
    JavascriptExecutor executor = (JavascriptExecutor)fd;  
    executor.executeScript("arguments[0].click();", "arguments[1].click();", invisibleelement,rb);

   	
       Thread.sleep(5000);
       WebElement rdb = fd.findElement(By.id("exp-3"));
       rdb.click();


       
       Thread.sleep(10000);

		
	}

}
