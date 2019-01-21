package OverrideExmaple;

public interface Override6 {

	/*
	 * Answer: below code will compile successfully and prints Child as output.
	 * So is different return type allowed in method overriding? Well Number is
	 * a parent class of Integer Wrapper class, and that is why above code
	 * compiled successfully. They are called covariant return types. You can
	 * check Wrapper classes Hierarchy in below image.
	 */
	public static void main(String[] args) {
		Parent p = new Child();
		p.testMethod();
	}
}

class Parent {
	public Number testMethod() {
		System.out.println("Parent");
		return 0;
	}
}

class Child extends Parent {
	public Integer testMethod() {
		System.out.println("Child");
		return 0;
	}
}
