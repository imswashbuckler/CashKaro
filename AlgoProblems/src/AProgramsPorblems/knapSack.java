package AProgramsPorblems;

public class knapSack {
	public int[][] dp;

	int max(int a, int b)
	{
		
		return (a > b) ? a : b;

	}

	int K(int w,int[] wt,int[] val)
	{
		int n=val.length;
		dp=new int[n+1][w+1];
		int i=0;
		int j = 0;
		for( i=0;i<=n;i++)
		{
			for(j=0;j<=w;j++)
			{
			if(i==0 || j==0 )
			{
				dp[i][j]=0;
				}
			else if(wt[i-1]<=j)
			{
				dp[i][j]=max(val[i-1]+dp[i-1][j-wt[i-1]],dp[i-1][j] );
				
				}
			else
			{
				dp[i][j]=dp[i-1][j];
				
			}
			}
			
		}
		
	return dp[n][w];
	}


public static void main(String[] args) {
	
	knapSack obj =new knapSack();
	int[] val={5,4,5,7};
	int[] wt= {1,2,3,4};
	int W=8;
	int m=obj.K(W,wt,val);
	System.out.println(m);
	
}
}
