package concepts;

public class NoCLassDefFoundError {
	
	int a=9;
	static int b=5;
	
	public static void test()
	{
		
		NoCLassDefFoundError v = new  NoCLassDefFoundError();
		b=7;
		v.a=6;
		
	}
	
	public static void test1()
	{
		
		
	}
	public static void main(String[] args) {
		
		_AA a = new _AA(4, 6);
		a.display();
		
		String s1=new String("hello");  
		String s2="hello";  
		String s3=s1.intern();//returns string from pool, now it will be same as s2 
		String s5=s2.intern();
		String s4=s1.intern();
		
		

		System.out.println(s5==s3);
		System.out.println(s5.equals(s3));
		for(;;)
		{
			System.out.println("v");
		}
		/*System.out.println(s4==s1);
		System.out.println(s1.equals(s4));
		System.out.println(s1==s2);//false because reference is different  
		System.out.println(s2==s3);//true because reference is same  

*/		
		
		
		
	}

}
