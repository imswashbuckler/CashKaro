package PolyMor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {
	
	static WebDriver fd;
	public static void main(String[] args) throws InterruptedException {
		
		/*
		 System.setProperty("webdriver.chrome.driver",
					"D:\\GITHUB\\MindTickle\\libs\\chromedriver.exe");*/
		 fd = new FirefoxDriver();
		 fd.manage().window().maximize();
			  fd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		       fd.get("http://toolsqa.com/automation-practice-form/");
        fd.manage().window().maximize();
        
        /*WebElement rb = fd.findElement(By.id("sex-1"));
        rb.click();
        
        Thread.sleep(5000);
        WebElement rdb = fd.findElement(By.id("exp-3"));
        rdb.click();
        */
        WebElement rb = fd.findElement(By.id("sex-1"));
        rb.click();
   
        Thread.sleep(5000);
        WebElement rdb = fd.findElement(By.id("exp-3"));
        rdb.click();


        
        Thread.sleep(10000);

		
	}

}
