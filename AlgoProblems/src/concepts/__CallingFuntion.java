package concepts;

class Testclass {
	int data = 101;
	Testclass()
	{
		
		System.out.println("Testclass");
	}

	public void print() {
		System.out.println("print from TestClass: ");
		System.out.print(data);

	}

	public void fun() {
		print();
	}
}

class S extends Testclass {
	int data = 202;

	S()
	{
		System.out.println("S class");
		
	}
	public void print() {
		System.out.print("print from S: ");
		System.out.println(data);
	}

}

public class __CallingFuntion {
	public static void main(String[] args) {

		Testclass obj = new S();
		obj.print();
		obj.fun();
		System.out.println(obj.data);
		S obj1 = new S();
		
		System.out.println(obj1.data);
		
		Integer i1=500;
		Integer i2=500;
		System.out.println("Integer:");
		System.out.println(i1.equals(i2));
		System.out.println(i1==i2);

		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
		System.out.println("String:");
		String k1="Test";
		String k2="Test";
		System.out.println(k1.equals(k2));
		System.out.println(k1==k2);
		int m1=5400;
		int m2=5400;

		System.out.println("int:");
		System.out.println(m1==m2);
		
		

	}
}
