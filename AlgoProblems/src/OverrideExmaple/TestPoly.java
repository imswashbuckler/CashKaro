package OverrideExmaple;

public class TestPoly {
	static { System.out.println("static Block TesPoly");
	
	}

	public static void main(String[] args) {

		A a = new A();
	// A a1 = new B();//Exception
		
		
		B b1= new B();	
	//	B b2= new A();

		

	}

}

class B {
	

	static { System.out.println("static Block B");
		
	}
	
	
	B() {
		 System.out.println("consB");
	}
B(int h) {
		 System.out.println("consB");
	}

	{
		System.out.println("Normal block B");
	}
	public void testA() {
		System.out.println("B:::A");

	}

	public static void testB() {
		System.out.println("B:::B");

	}

}
class A extends B {



	static { System.out.println("static Block A");
		
	}
	
	{
		System.out.println("Normal block A");
	}
	
	public void testA() {
		System.out.println("A::A");

	}

	public static void testB() {
		System.out.println("A:B");

	}

}
