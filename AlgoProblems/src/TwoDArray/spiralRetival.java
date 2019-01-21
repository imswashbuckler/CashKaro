package TwoDArray;

public class spiralRetival {
	
	public void spiralpath(int[][] arr)
	{
		
		int r=0, c=0;
		int row=arr.length-1;
		int col=arr[0].length-1;
		while(r<row)
		{
		for(int i=r;i<=col;i++)
		{
		System.out.print(arr[r][i]+" ");	
			
		}
		r++;
		for(int i=r;i<=row;i++)
		{
		System.out.print(arr[i][col]+" ");	
			
		}
		col--;
		
		if(r<=row)
		{
			for(int i=col;i>=c;i--)
			{
			System.out.print(arr[row][i]+" ");	
				
			}
		
			
		}
		row--;
		
		if(c<=col)
		{
			for(int i=row;i>=r;i--)
			{
			System.out.print(arr[i][c]+" ");	
				
			}
		
			
		}
		c++;
		
		
		}
	}
	
	public static void main(String[] args) {
		int[][] arr={{11,14,26,58},
					 {13,19,10,12},
					 {15,11,14,19},
					 {17,13,15,20},
					 {13,21,49,21}};
	
	spiralRetival obj = new spiralRetival();
	obj.spiralpath(arr);
	}

}
