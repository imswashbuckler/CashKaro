package OverrideExmaple;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

class ABC

{
	ABC(){System.out.println("i m ABC const");};
    void methodABC()
    {
        System.out.println(111);
    }
     
    void methodABC(int i)
    {
        System.out.println(222);
    }
}
 
class XYZ extends ABC
{
    @Override
    void methodABC(int i)
    {
        System.out.println(333);
    }
     
    @Override
    void methodABC()
    {
        System.out.println(444);
    }
}
 
public class Override12
{
    public static void main(String[] args)
    {
        ABC abc = new XYZ();
         
        abc.methodABC(10);
         
        abc.methodABC();
        WebDriver driver = null;
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        Actions act = new Actions(driver);
        
    }    
}