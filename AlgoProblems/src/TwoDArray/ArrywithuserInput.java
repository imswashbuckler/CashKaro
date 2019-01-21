package TwoDArray;

import java.util.Arrays;
import java.util.Scanner;


public class ArrywithuserInput {
	
	static int m;
	static int n;
	public static void display2dArray(int[][] arr1)
	{
		for ( int[] i:arr1)
		{
			for(int j:i )
			{
				
				System.out.print(j+" ");
				
			}
			System.out.println();
				
			
			
		}
		
	}
	
	public static void main(String[] args) {
	
		
		Scanner scn = new Scanner(System.in);
		 m =scn.nextInt();
		Scanner scn1 = new Scanner(System.in);
		 n =scn.nextInt();
		 int[][] arr= new int[m][n];	
			
		 
		 System.out.println(Arrays.toString(arr));
		 
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				Scanner scn3 = new Scanner(System.in);
				 int data =scn3.nextInt();
				arr[i][j]= data;
			}					
		}
				
		display2dArray(arr);
		
	}
	

}
