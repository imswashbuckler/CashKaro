package SortingandMerging;

import java.io.File;
import java.nio.CharBuffer;

public class CopyOfA_A {
	
	
	public static void test(Object o)
	{
		System.out.println("objectc");
	}
	public static void test(String s)
	{
		System.out.println("String");
	}
	public static void test(Long l)
	{
		System.out.println("Long");
	}
	public static void test(long l)
	{
		System.out.println("PLong");
	}
	public static void main(String[] args) {
		Object obj = new String("");
		test(1);
		test(1L);
		test(new Long(1));
		test(new Integer(1));
		test(obj);
		
		
	}
}