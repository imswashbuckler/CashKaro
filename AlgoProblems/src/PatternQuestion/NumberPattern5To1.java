package PatternQuestion;

public class NumberPattern5To1 {
	
	public static void NumberPatter5To1(int n)
	{

		for (int i = 1; i <= n; i++) 
		{ 		int l=n;
			for (int k = 0; k <i; k++) 
			{
					System.out.print(l);
					l--;
		
			}
			System.out.println();

	}}


	public static void main(String[] args) {
		NumberPatter5To1(15);
	}

}
