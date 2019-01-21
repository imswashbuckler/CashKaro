package PatternQuestion;

public class PrintZeroOnePattern {
	public static void printPattern(int n) {
		int p, q;
		n = 5;
		for (int i = 1; i <= n; i++) 
		{
			if (i % 2 == 0)
			{
				p = 1;
				q = 0;
			} 
			else 
			{
				p = 0;
				q = 1;
			}
			for (int j = 1; j <= i; j++)
				if (j % 2 == 0)
					System.out.print(p);
				else {
					System.out.print(q);
				}
			System.out.println();

		}
	}

	public static void main(String[] args) {
		printPattern(5);

	}
}