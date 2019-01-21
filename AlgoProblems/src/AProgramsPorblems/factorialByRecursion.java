package AProgramsPorblems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class factorialByRecursion {

	static int result=1;
	public static int fibo(int k)
	
	{
		
		
		if(k==1)
			return 1;
		else
		return k*fibo(k-1);		
	
	}
	public static void main(String[] args) {
		WebDriver driver = null;
		//WebElement el= driver.findElement(By.id("djajk")).getSize().;
		System.out.println(factorialByRecursion.fibo(3));
	
	}

}
