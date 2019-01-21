package OverrideExmaple;
	class A1
	{
	     
	}
	 
	class B1 extends A1
	{
	     
	}
	 
	class C1 extends B1
	{
	     
	}
	 
	public class Override9 
	{
	    static void overloadedMethod(A1 a)
	    {
	        System.out.println("ONE");
	    }
	     
	    static void overloadedMethod(B1 b)
	    {
	        System.out.println("TWO");
	    }
	     
	    static void overloadedMethod(Object obj)
	    {
	        System.out.println("THREE");
	    }
	     
	    public static void main(String[] args)
	    {
	        C1 c = new C1();
	         
	        overloadedMethod(c);
	    }
	}