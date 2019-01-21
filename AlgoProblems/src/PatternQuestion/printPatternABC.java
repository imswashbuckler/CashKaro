package PatternQuestion;

public class printPatternABC {

	public static void PrintPatternABC(int n) {
		char c='A';
		for (int i = 1; i <= n; i++) {
			int k = 0;
			while (k < i) 
			{
				System.out.print(c);
				k++;
				//c++; check result comment below first
			}
			c++;
			System.out.println();
		}

	}


	public static void main(String[] args) {
		PrintPatternABC(5);
	}

}
