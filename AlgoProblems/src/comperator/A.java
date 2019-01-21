package comperator;

public class A {
	
	A()
	{
		int i=1/0;
		
	}
	
	public void test(Integer a,int b){System.out.println("C");}
	public void test(int a,int b){System.out.println("A");}
	public void test(float a,int b){System.out.println("B");}


}
