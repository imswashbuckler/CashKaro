package comperator;

import org.apache.poi.ss.formula.ptg.ExpPtg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestListener;


public class ReversString  {
	
	public static String RevString(String str)
	{
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
		}
		return rev;
	}
	
	public static void palidrome(String str)
	{
		int l=str.length();
		int i=0;
		int j=str.length()-1;
		while(i<=l/2 && j>=l/2)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
			System.out.println("not palindrome");
			break;
			}
			i++;
			j--;
			
			
		}
	}

public static void main(String[] args) {
	
	System.out.println(RevString("Ram"));
palidrome("abaa");
WebDriver driver = null;
WebDriverWait wait = new WebDriverWait(driver,30);
wait.until(ExpectedConditions.
		elementToBeClickable(driver.findElement(By.id("id1"))));
	
}
}
