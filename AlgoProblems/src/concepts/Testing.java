package concepts;

public class Testing extends Super {
	String foo="kar";

	public static void main(String[] args) {
		   System.out.println(Super.foo);
	        System.out.println(Sub.foo);
	        System.out.println(Super.foo);
	}
}

class Super {

	public static String foo = "foo";

}

 class Sub extends Super  {
	
	static {
		foo = "bar";
	}

	public static void main(String[] args) {
		System.out.println(Super.foo);
	}
}
