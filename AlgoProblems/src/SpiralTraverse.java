public class SpiralTraverse {

	public static void SpiralTraverse(int[][] arr, int row, int col) {
		int r = 0;
		int c = 0;
		while (r < row && c < col) {

			for (int i = c; i < col; i++) {
				System.out.print(arr[r][i]);
			}
			r++;
			for (int j = r; j < row; j++) {
				System.out.print(arr[j][col - 1]);

			}
			col--;

			if (r < row) {
				for (int j = col - 1; j >= c; j--) {
					System.out.print(arr[row - 1][j]);
				}

			}
			row--;
			if (c < col) {
				for (int j = row - 1; j >= r; j--) {
					System.out.print(arr[j][c]);
				}

			}

			c++;

		}

	}

	public static void main(String[] args) {

		int[][] arr = { { 1, 7, 12, 18, 25 }, 
				        { 2, 8, 13, 19, 27 },
				        { 3, 9, 14, 20, 29 }, 
				         {4, 10, 15, 21, 39 }
				 };

		SpiralTraverse(arr, 4, 5);

	}
}