package TwoDArray;

public class MaxOneInRow {

	static int maxrow = 0;
	static int oldcount1 = 0;
	static int newcount1 = 0;

	public static int max1InRow(int[][] arrd) {
		for (int i = 0; i < arrd.length; i++) {
			for (int j = 0; j < arrd[i].length; j++) {
				if (arrd[i][j] == 1) {
					newcount1++;

				}
				else
				{
					break;
				}
			}
			if (newcount1 > oldcount1) 
			{
				oldcount1=newcount1;
				maxrow = i + 1;
			}
			newcount1=0;

		}
		return maxrow;
	}

	public static void main(String[] args) {
		
		int[][] arr = { { 1, 1, 0, 0 },
				{ 1, 0, 0, 0 }, 
				{ 1, 1, 1, 1 },
				{ 1, 1, 1, 1 },
				{ 1, 1, 0, 0 }};
		int m=max1InRow(arr);
		System.out.println(m);

	}
}
