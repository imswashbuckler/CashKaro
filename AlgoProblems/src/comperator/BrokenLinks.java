package comperator;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Flash.FlashObjectWebDriver;

class BrokenLinks {
	WebDriver driver ;
//	Logger log = Logger.getLogger(BrokenLinks.class);

@BeforeSuite	
public void OpenBrowser()
{

	System.setProperty("webdriver.chrome.driver", "D:\\Emirates\\Emirates1\\driver\\chromedriver_34.exe");
	driver = new HtmlUnitDriver();
driver.get("https://www.facebook.com/");
	//  driver.get("http://demo.guru99.com/flash-testing.html");
	//log.debug("done");
	
	
/*	DesiredCapabilities capability = DesiredCapabilities.chrome();   
	
	
	capability.setCapability (CapabilityType.ACCEPT_SSL_CERTS, true);
			
	WebDriver driver = new ChromeDriver (capability);
		WebElement element=driver.findElement(By.id("Test"));
		element.isDisplayed();
*/	
		/*WebElement element1=driver.findElement(By.id("Test"));
		WebElement element2=driver.findElement(By.id("Test"));
		WebElement element3=driver.findElement(By.id("Test"));
	
			WebDriverWait wait = new WebDriverWait(driver, 50);
			wait.until(ExpectedConditions.elementToBeClickable(element));
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
	        js.executeScript("arguments[1].click();", element,element1,element2);
*/
			
}



public void dateTimePicker()
{

	WebElement txtUsername = driver.findElement(By.id("email"));
    

	Actions builder = new Actions(driver);
	builder.moveToElement(txtUsername).click()
			.keyDown(txtUsername,Keys.SHIFT)
			.sendKeys(txtUsername,"Hello")
			.keyUp(txtUsername,Keys.SHIFT)
			.doubleClick(txtUsername)
			.contextClick()
			.build().perform();
	

   
}



public void testSiblingAndParentInXpath(){

	//
	  List <WebElement> dateBox = driver.
			 /* findElements(By.xpath("//h2[contains(text(),'A few of our most popular courses')]/parent::"
			  		+ "div//div[//a[text()='SELENIUM']]/following-sibling::div[@class='rt-grid-2 rt-omega']"));
*/
			  findElements(By.xpath("//h2[contains(text(),'A few of our most popular courses')]/following-sibling::div//h4/a"));
    //Print all the which are sibling of the the element named as 'SELENIUM' in 'Popular course'
    for (WebElement webElement : dateBox) {
        System.out.println(webElement.getText());
    }     

    driver.close();
}



public void flash() throws InterruptedException, IOException
{
	
	
	FlashObjectWebDriver flashApp = new FlashObjectWebDriver(driver, "myFlashMovie");		
  	// Pass the URL of video		
	driver.get("http://demo.guru99.com/test/flash-testing.html");	
	 File file = new File("Cookies.data");							
  	  
         // Delete old file if exists
			file.delete();		
         file.createNewFile();			
         FileWriter fileWrite = new FileWriter(file);							
         BufferedWriter Bwrite = new BufferedWriter(fileWrite);

	 for(Cookie ck : driver.manage().getCookies())							
     {	
		 System.out.println((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));
         Bwrite.write((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));																									
         Bwrite.newLine();             
     }			
     Bwrite.close();	
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	Thread.sleep(5000);		
  	flashApp.callFlashObject("Play");			
  	Thread.sleep(5000);		
	flashApp.callFlashObject("StopPlay");			
	Thread.sleep(5000);
	//flashApp.callFlashObject("SetVariable","/:message","Flash testing using selenium Webdriver");
   // System.out.println(flashApp.callFlashObject("GetVariable","/:message"));						

}

@Test
public void brokenLinks() throws ClientProtocolException, IOException
{
List<WebElement> links = driver.findElements(By.tagName("a"));
System.out.println("Toatl"+links.size());

int count=0;
int brokencount=0;
int no=0;
for(WebElement ele:links)
{

String str=ele.getAttribute("href");
System.out.println(no+":   "+str);
HttpGet getr=new HttpGet(str);
no=no+1;
DefaultHttpClient client = new DefaultHttpClient();
HttpResponse response=client.execute(getr);
if(response.getStatusLine().getStatusCode()!=200)
{

	brokencount=brokencount+1;

	//System.out.println(str);
}
else
{
	count=count+1;
	
	
	}


}

System.out.println("Not Broken:   "+count);
System.out.println("Broken:   "+brokencount);

}
	

}
