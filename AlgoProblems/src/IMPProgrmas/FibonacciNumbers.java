package IMPProgrmas;

import java.util.Arrays;

public class FibonacciNumbers {
	static int b=1;
	public static void normalfibo(int febCount) {

		int[] feb = new int[febCount];
		feb[0] = 0;
		feb[1] = 1;
		for (int i = 2; i < febCount; i++) {
			feb[i] = feb[i - 1] + feb[i - 2];
		}
		 
		 System.out.println(Arrays.toString(feb));
		
	}
	public static long fibonacci1(int i) {
		if (i == 0)
			return 0;
		if (i <= 2)
			return 1;

		long fibTerm = fibonacci1(i - 1) + fibonacci1(i - 2);
		
		return fibTerm;
	}


	public static int fibo(int number) {
		if (number == 0)  {
			return 0;
		}
		else if (number == 1)  {
			return 1;
		}

		else {
			
			return fibo(number - 1) + fibo(number - 2);
		}

	}

	public static void main(String[] args) {
		FibonacciNumbers fib = new FibonacciNumbers();
	//	normalfibo(10);
		for(int i =0;i<10;i++)
		{
			long k=	fibonacci1(i);
			System.out.println(k+",");
			
		}

			
	}
}