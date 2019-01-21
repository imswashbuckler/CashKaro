package OverrideExmaple;

public class Override7 {
/*
	Well, compiler will consider both of above methods
	as different methods and it is not method overriding.
	Above program will give priority to Parent class testMethod() 
	and prints Parent as output. */


	
	 public static void main(String[] args){
	        Parent1 p = new Child1();
	        p.testMethod(0);
	    }
	}
	 
	class Parent1{
	    public void testMethod(Number n)
	    {
	        System.out.println("Parent1");
	    }
	}
	 
	class Child1 extends Parent1{
	    public void testMethod(Integer n) 
	    {
	        System.out.println("Child1");
	    }
	} 