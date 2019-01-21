
public class SpiaralTravese {
	
	int[][] p1 = { { 2, 3, 4, 5, 6 },
			{ 3, 4, 8, 6, 9 }, 
			{ 3, 4, 5, 8, 4 },
			{ 1, 4, 3, 2, 8 }, 
			{ 9, 7, 5, 2, 1 } };

public static void traveseSpiral(int[][] arr,int r,int c )
{
	int r1=0;
	int c1=0;

	/*int[][] p3 = { { 2, 3, 4, 5, 6 },
			{ 3, 4, 8, 6, 9 }, 
			{ 3, 4, 5, 8, 4 },
			{ 1, 4, 3, 2, 8 }, 
			{ 9, 7, 5, 2, 1 } };// c-1,
*/
	while(r1<r && c1<c)
	{
		for(int i=c1;i<=c;i++)
		{
		
			System.out.print(arr[r1][i]+",");
		
		}
		r1++;
		
		for(int i=r1;i<=r;i++)
		{
			System.out.print(arr[i][c]+",");
			
		}
		c--;
			
		if(r1<r)
		{
			for(int i=c;i>=c1;i--)
			{
				System.out.print(arr[r][i]+",");
				
			}
			
			
		}
		r--;
		if(c1<c)
		{
			for(int i=r;i>r1;i--)
			{
				System.out.print(arr[i][c1]+",");
				
			}		
		}
		c1++;
		
	
		
	}
	

}
	
public static void spiralTrva(int[][] arr,int row,int col)
{
	int r=0;
	int c=0;
	while(row>=r && col>=c)
	{
		
		for(int i=c;i<=col;i++)
		{
			System.out.print(arr[r][i]);
	
			
			
		}
		r++;
		
		for(int j=r;j<=row;j++)
		{
			System.out.print(arr[j][col]);
			
			
		}
		col--;
		
		if(r<=row)
		{
		
			for(int i=col;i>=c;i--)
			{
				System.out.print(arr[row][i]);
			}
			row--;
		}
		
		if(c<=col)
		{
		
			for(int j=row;j>=r;j--)
			{
				System.out.print(arr[j][c]);
			}
			c++;
		}
		
		
	}
	
	
	
}
	
	public static void main(String[] args) {
		int[][] p = { { 2, 3, 4, 5, 6 },
					  { 3, 4, 8, 6, 9 }, 
				      { 3, 4, 5, 8, 4 },
				      { 1, 4, 3, 2, 8 }, 
				      { 9, 7, 5, 2, 1 } };
		
	//	traveseSpiral(p,p.length-1,p[0].length-1);
		
		spiralTrva(p,p.length-1,p[0].length-1);
		
	}

}
