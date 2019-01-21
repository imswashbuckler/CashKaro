package ADeafult;
public class findEelementin2DArray {
	
	
	public boolean find2DArray(int[][] arr, int n, int m, int k) 
	{
		int r=0;
		int c=0;
		boolean b=false;
		while(m>=r & n>=c)
		{
			if(k==arr[r][n])
			{		
				System.out.println(r+1+" "+(n+1));
				
				b=true;

				break;
				
			}
			else if(k<arr[r][n])
			{
				n--;
				
			}
			else {
				
				r++;
				
			}
			
		}
		return b;
		
		
		
		
	}
	


	public static void main(String[] args) {

		int[][] arr = { 
				{ 1, 7, 12, 18, 25 },
				{ 2, 8, 13, 19, 27 },
				{ 3, 9, 14, 20, 29 }, 
				{ 4, 10, 15, 21, 39 },
				{ 5, 11, 17, 22, 44 } };

		findEelementin2DArray obj = new findEelementin2DArray();
		boolean bo=obj.find2DArray(arr, 4, 4, 10);
		System.out.println(bo);

	}

}
