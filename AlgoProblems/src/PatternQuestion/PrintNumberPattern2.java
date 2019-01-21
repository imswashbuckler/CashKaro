package PatternQuestion;

public class PrintNumberPattern2 {
	
/*	1
   121
  12321
 1234321
123454321
*/
	
	public static void printPattern(int n)
	{
		int l=1;
		int k=1;
		while(l<=n)
		{
			
		
		for(int m=k;m<n;m++)
		{
			System.out.print(" ");
		}
		
			
		for(int i=1;i<=l;i++)
		{
			System.out.print(i);
			
		}
		for(int j=l-1;j>=1;j--)
		{
			System.out.print(j);
			
		}
		System.out.println();
		k++;
		l++;
		
	}
		

}

public static void main(String[] args) {
	printPattern(9);
}

}