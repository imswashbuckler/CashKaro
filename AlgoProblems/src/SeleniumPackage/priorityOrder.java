package SeleniumPackage;

import org.testng.annotations.Test;

public class priorityOrder {
	
	@Test(priority=-3)
	public void test3()
	{
		System.out.println("test3");
		
	}


	@Test(priority=-4)
	public void test2()
	{
		System.out.println("test2");
	}
	

	@Test(priority=-3)
	public void test1()
	{
		System.out.println("test1");	
	}

	@Test
	public void test4()
	{
		System.out.println("test4");
	}
	@Test(priority=0)
	public void test5()
	{
		System.out.println("test5");
	}
}
