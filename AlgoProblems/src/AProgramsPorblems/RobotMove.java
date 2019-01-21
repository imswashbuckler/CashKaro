package AProgramsPorblems;

public class RobotMove {

	/*
	 * static int findpath(int a[][], int n, int i, int j) { //count = count +
	 * 1; //System.out.println(count); a = new int[n][n]; int l = 0, r = 0; if
	 * (i == n - 1 && j == n - 1) // reached destination return 1; if (j + 1 < n
	 * && a[i][j + 1] != -1) // is Right Possible l = findpath(a, n, i, j + 1);
	 * if (i + 1 < n && a[i + 1][j] != -1) // is Down Possible r = findpath(a,
	 * n, i + 1, j); return l + r; }
	 */
	static int numberOfPaths(int m, int n) {
		// If either given row number is first or given column number is first
		if (m == 1 || n == 1)
			return 1;

		// If diagonal movements are allowed then the last addition
		// is required.
		else {
			return numberOfPaths(m - 1, n) + numberOfPaths(m, n - 1);
		}
	}

	// DP
	public static int uniquePaths(int m, int n) {
		if (m == 0 || n == 0)
			return 0;
		if (m == 1 || n == 1)
			return 1;
		int[][] dp = new int[m][n];
		// left column
		for (int i = 0; i < m; i++) {
			dp[i][0] = 1;
		}
		// top row
		for (int j = 0; j < n; j++) {
			dp[0][j] = 1;
		}
		// fill up the dp table
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
			}
		}
		return dp[m - 1][n - 1];
	}

	public static void main(String[] args) {
		int size = 3;
		// int[][] b = new int[size][size];
		// int m = findpath(b, size, 0, 0);

		// int m = numberOfPaths(size,size);
		// System.out.println(m);

		int m1 = uniquePaths(size, size);

		System.out.println(m1);

	}
}
