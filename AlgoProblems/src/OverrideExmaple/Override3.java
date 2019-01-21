package OverrideExmaple;

public class Override3 {
public static void main(String[] args) {
	        Shape2 s = new Circle2();
	        System.out.println(s.name);
	    }
	}
	 
	class Shape2{
	    String name = "Shape";
	}
	 
	class Circle2 extends Shape2{
	    String name = "Circle";
	}