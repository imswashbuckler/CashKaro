package AProgramsPorblems;

public class MatrixPathFindV1 {

	static Boolean isExists=false;	
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println("start time:" + System.currentTimeMillis());

		int[][] array = new int[][] { 
									{ 1, 0, 0, 0 }, 
									{ 1, 1, 0, 1 }, 
									{ 0, 1, 1, 0 }, 
									{ 1, 0, 1, 1 }, 
									{ 1, 0, 1, 1 },
									{ 1, 1, 1, 1 } };

		//Boolean isExists=false;							
		paths(array, array.length - 1, array[0].length - 1);
		
		//System.out.println(!isExists?"No Path exists..":"Path Exists");

	}

	private static void paths(int[][] array, int row, int col) {
		 
		if (col - 1 >= 0 && array[row][col - 1] == 1)
			paths(array, row, col - 1);
		else if (row - 1 >= 0)
			paths(array, row - 1, col);
		
		System.out.println("{" + row + "," + col + "}");

	}

	private static boolean atStart(int[][] array, int row, int col) {

		return row == 0 && col == 0;
	}

/*	private static boolean isValidPath(int[][] array, int row, int col) {

		// // boolean valid=false;
		if (row + 1 > array.length || col + 1 >= array[0].length) {
			return false;
		}
		;

		if (array[row][col + 1] == 0 && array[row + 1][col] == 0) {
			return false;
		} else
			return true;

	}
*/
}

