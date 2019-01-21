package concepts;

//import TestInterface

public class OverrideExam extends testb{
	
static int i=4;
	int j=5;
	int p=50;
	public void test(int a,int b)
	{
		
		System.out.println("testb class");
	}
	
	public void test(int a)
	{
		
		System.out.println("new class");
	}
	public static void main(String[] args) {
	
		testb tb = new OverrideExam();
		/*tb.test(5);
		tb.test1(4);
		OverrideExam a1 = new OverrideExam();
		*/OverrideExam a = new OverrideExam();
		
		System.out.println(tb.p);
		
		/*a1.j=1;
		System.out.println(a.j);
		System.out.println(a1.j);
		
		a1.i=0;
		System.out.println(a.i);
		System.out.println(a1.i);
		//System.out.println(j);
*/	}
	

	

}

class testb 
{
	int p=100;
	public void test(int a)
	{
		System.out.println("ovverrid class");
		
	}
	public void test1(int a)
	{
		System.out.println("test1");
		
	}

	}
