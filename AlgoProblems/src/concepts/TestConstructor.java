package concepts;

import java.util.HashMap;
import java.util.Map;

public class TestConstructor {
	
	
public TestConstructor()
	
	{
		
		System.out.println("Test without param: ");
	}
	
	public TestConstructor(int k)
	
	{
		
		System.out.println("Test: "+ k);
	}
	
	
	public static void main(String[] args) 
	{
		TestConstructor tc = new TestConstructor(5);
		
	}
}