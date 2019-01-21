package comperator;

public class B extends A {
	
	
	public static void main(String[] args) {
		
		A l=new A();
		l.test(new Integer(4), 1);
		
		Integer a=5;
		Integer b=5;
		System.out.println(a.equals(b));

		System.out.println(a==b);
		int c=5;
		int d=5;
		System.out.println(a.equals(b));
		
		String s="c"+4;
		System.out.println(s);
		

		
	}

}
