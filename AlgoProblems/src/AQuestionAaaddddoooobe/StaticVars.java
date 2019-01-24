package AQuestionAaaddddoooobe;

public class StaticVars {

	public static void main(String[] args) {
		System.out.println(Super.foo);
	}

}

class Super {
	public static String foo = "Foo";
}

class Sub extends Super {
	static 
	{
		foo = "bar";

	}
	public static void main(String[] args) {
		System.out.println(Sub.foo);
	}
}