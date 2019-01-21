package SeleniumPackage;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class InvocationCount {

	private WebDriver driver;
	 
    @BeforeClass
    public void beforeClass() {
    }
 
    @AfterClass
    public void afterClass() {
    }
 
    @Test
    public void testGoogleSearch() {
 
    //	System.setProperty("webdriver.chrome.driver", "C:\\jars\\Chormedriver\\chromedriver.exe");
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ram.Sahu\\Downloads\\chromedriver.exe");
		
    	driver = new ChromeDriver();
		driver.manage().window().maximize();


    	Date date = null;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        driver.get("http://www.google.com");

 
        String search_text = "Google Search";
        WebElement search_button = driver.findElement(By.name("btnK"));
        String text = search_button.getAttribute("value");
 
        date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy h:mm:ss a");
        String timstamp = sdf.format(date);
        System.out.println(timstamp + ": Search button text is " + driver.getTitle());
 
        Assert.assertEquals(text, search_text, "Text not found!");
        driver.quit();
    }
}