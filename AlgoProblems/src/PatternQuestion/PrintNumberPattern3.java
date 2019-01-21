package PatternQuestion;

public class PrintNumberPattern3 {

	public static void printPattern(int n)
	{
		int num=1;
		for (int i = 0; i < n; i++) 
		{

			for (int j = 0; j < n-i-1; j++) 
			{
				System.out.print(" ");
			}
			
			for (int k = 1; k <= num; k++) 
			{

				System.out.print(k);
				System.out.print(" ");
				

			
			}
			
			System.out.println();
			num++;
			

		}

	}
public static void main(String[] args) {
	printPattern(5);
	
}	

}
