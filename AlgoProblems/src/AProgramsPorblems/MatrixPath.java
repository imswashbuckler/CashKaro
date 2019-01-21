package AProgramsPorblems;

import java.util.Scanner;

import TwoDArray.FindElementin2DsortedArray;

public class MatrixPath {
	
		static Boolean isExists=false;	
		
		public static void main(String[] args) {
			long start = System.currentTimeMillis();
			System.out.println("start time:" + System.currentTimeMillis());

			int[][] array = new int[][] { 
									    { 1, 1, 1, 1, 1 }, 
										{ 1, 0, 1, 0, 1}, 
										{ 1, 0, 1, 1, 1 }, 
										{ 1, 1, 1, 0, 1 },
										{ 1, 1, 0, 1, 1 } };

			paths(array, array.length - 1, array[0].length - 1);
			

		}
//c3 r6
		private static void paths(int[][] array, int row, int col) {
			 
			if (col - 1 >= 0 && array[row][col - 1] == 1)
			{
				paths(array, row, col - 1);
			//System.out.println("A");
		//	System.out.println("A"+row+col);
			
			}
			else if (row - 1 >= 0)
			{
				paths(array, row - 1, col);
			//System.out.println("B"+row+col);
			
			}
			System.out.println("{" + row + "," + col + "}");

		}

		private static boolean atStart(int[][] array, int row, int col) {

			return row == 0 && col == 0;
		}


	}

