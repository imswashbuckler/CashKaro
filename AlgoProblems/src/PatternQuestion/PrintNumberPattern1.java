package PatternQuestion;

public class PrintNumberPattern1 {
	
/*	1 
	2 3 
	4 5 6 
	7 8 9 10 
	11 12 13 14 15 */
	
public static void PrintPattern1(int n)
{
	int num=1;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<=i;j++)
		{
			System.out.print(num);
			num++;
		}
		System.out.println();
	}
	
	

}

public static void main(String[] args) {
	PrintPattern1(5);
}
}