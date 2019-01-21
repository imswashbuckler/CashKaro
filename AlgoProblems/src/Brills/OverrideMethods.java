package Brills;

public class OverrideMethods   {
	

	public void show()
	{
		System.out.println("AB");
	}
	public static void main(String[] args) {
		CD c=new BC();
		c.show();
		c.show1();
	}
	
	
}

class AB extends BC
{
	

	AB()
	{
		System.out.println("AB constructor");
	}
public static void show()
	{
		System.out.println("AB");
	}
	
}

class BC extends CD
{

	BC()
	{
		System.out.println("BC constructor");
	}
	
	public static void show()
	{
		System.out.println("BC");
	}
	
	public void show1()
	{
		System.out.println("show1BC");
	}
	
}

class CD
{
	CD()
	{
		System.out.println("CD constructor");
	}
	public static void show()
	{
		System.out.println("CD");
	}
	public void show1()
	{
		System.out.println("show1CD");
	}
	
}