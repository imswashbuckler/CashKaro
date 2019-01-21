package AProgramsPorblems;

import java.text.DateFormat.Field;

public class FebonacciRecursion {
	static int k = 1;

	public static int Factorial(int n) {

		if (n == 1) {
			return k;
		}
		return k = n * Factorial(n - 1);

	}

	public static int fibonacci(int n) {
	
			if (n == 0) {
				return 0;
			} else if (n <=2) {
				return 1;
			} else {

				int feb = fibonacci(n-1) + fibonacci(n - 2);
				//System.out.println(k);
				return feb;
			}
			

		}

	

	public static void main(String[] args) {

		//int f = Factorial(4);
		//int f1 = fibonacci(4);
		// System.out.println(f1);
		
		
		for(int i=0;i<2;i++)
		{
			int k=fibonacci(i);
			System.out.println(k);
			
		}

	}

}
