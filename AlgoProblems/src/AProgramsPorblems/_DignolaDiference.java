package AProgramsPorblems;

public class _DignolaDiference {
	static int[][] array = new int[][] { 
								  { 1, 1, 1, 1, 2 },
								  { 1, 1, 1, 8, 0 },
						          { 1, 0, 6, 1, 1 }, 
						       	  { 1, 1, 1, 0, 1 }, 
						       	  { 1, 1, 0, 1, 1 } };
	
	
	public static void main(String[] args) {
		
		int sum=0;
		int sum1=0;
		for(int i=0;i<array.length;i++)
		{
			for(int j=i;j<=i;j++)
			{
				sum=sum+array[i][j];
		}
				
	}
		
		//System.out.println(sum);
		int col=array[0].length-1;
		

		for(int i=0;i<array.length;i++)
		{
			for(int j=col;j>col-1;j--)
			{
				
				sum1=sum1+array[i][j];
			
			
			
		}
			col=col-1;
		}
		int d=sum1-sum;
		System.out.println(sum);
		System.out.println(sum1);
		System.out.println(d);
		

}
}