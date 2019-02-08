package concepts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.ProtocolException;

import sun.reflect.annotation.ExceptionProxy;

public class MemberVaraible {

	public static void main(String[] args) throws IOException {
		Shape s = new Circle();
		System.out.println(s.name);
		s.test();
	}
}

class Shape {
	String name = "Shape";
	public void test() throws IOException
	{
		System.out.println("ShapeFUnc");
	}
	
}

class Circle extends Shape  {
	String name = "Circle";
	public void test() 
	{
		System.out.println("CirclFunc");
	}
}
