public class findEelementin2DArray {
	
	
	public void find2DArray1(int[][] arr, int n, int m, int k) 
	{
		boolean b=false;
		int r=0;
		int c=n-1;
		while(r<n && m>c)
		{
			if(arr[r][c]==k)
			{
				System.out.println("row and column are"+r+" "+c);
				break;
				
			}
			else if(arr[r][c]<k)
			{
				r++;
				
			}
			else
			{
				c--;
			}
		
		}
		
		
	}
	


	public void find2DArray(int[][] arr, int n, int m, int k) {
		int r = 0;
		int c = n - 1;

		while (n > r && m > c) {
			int s = arr[r][c];

			if (k == arr[r][c]) {
				System.out.println("I" + r + "J" + c);
				System.out.println("existes");
				break;
			} else if (k < arr[r][c]) {

				c--;

			} else if (k > arr[r][c]) {
				r++;

			}

		}

	}

	public static void main(String[] args) {

		int[][] arr = { 
				{ 1, 7, 12, 18, 25 },
				{ 2, 8, 13, 19, 27 },
				{ 3, 9, 14, 20, 29 }, 
				{ 4, 10, 15, 21, 39 },
				{ 5, 11, 17, 22, 44 } };

		findEelementin2DArray obj = new findEelementin2DArray();
		obj.find2DArray(arr, 5, 5, 44);

	}

}
