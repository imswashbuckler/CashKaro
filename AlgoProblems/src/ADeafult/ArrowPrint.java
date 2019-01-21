package ADeafult;

public class ArrowPrint {
	/*
	 * input 7
	 * 
	 * 
	 * ************************************
	 */

	public static void PrintArray(int n)

	{

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print(" ");

			}

			for (int j = 0; j <= i; j++) {
				System.out.print("*");

			}

			System.out.println();

		}

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n-i-2; j++) {
				System.out.print(" ");

			}

			for (int j = 1; j <n-i ; j++) {
				System.out.print("*");

			}

			System.out.println();

		}

	}

	public static void main(String[] args) {
		PrintArray(11);

	}
}
