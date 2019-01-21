package DynamicProgrammin;

public class NoOfPathsInMatrix {

	static int numberOfPaths(int m, int n) {
		// If either given row number is first or
		// given column number is first
		if (m == 1 || n == 1)
			return 1;

		// If diagonal movements are allowed then
		// the last addition is required.
		return numberOfPaths(m - 1, n) + +numberOfPaths(m, n - 1);
		// + numberOfPaths(m-1,n-1);
	}

	static void  numberOfPathsbyDynamic(int m, int n)
	    {
	   int[][] k = new int[m][n];
	  
		 for(int i=0;i<k.length;i++)
		 {		 
			 for(int j=0;j<k[0].length;j++)
			 {
		 
		 if (i == 0 || j == 0)
	            
	        {
	        	k[i][j]=1;
	        	
	        }
	        else
	        {
	        	
	        	k[i][j]=k[i-1][j]+k[i][j-1];
	        	
	        }
	       
			 }
		 }
		 System.out.println(k[m-1][n-1]);
		 }

	public static void main(String args[]) {
		// System.out.println(numberOfPaths(4, 4));
		numberOfPathsbyDynamic(4, 4);
	}
}