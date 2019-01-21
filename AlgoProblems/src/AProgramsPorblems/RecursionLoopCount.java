package AProgramsPorblems;

public class RecursionLoopCount {
	static int count =0;

	public void m1(int a)
	{		
		while(a>0)
		{
			count++;
			System.out.println("A:"+a+"C:"+count);
			a--;
			m1(a);
		}		
	}

	public static void main(String[] args) {

		RecursionLoopCount obj = new RecursionLoopCount();
		obj.m1(4);
		System.out.println(count);
		
	}
}
