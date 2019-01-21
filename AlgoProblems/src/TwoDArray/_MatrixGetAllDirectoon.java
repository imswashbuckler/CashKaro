package TwoDArray;

public class _MatrixGetAllDirectoon {


	public void GetPath(int[][] arr, int r, int c) 
	{
		int rlength = arr.length;
		int clength = arr[0].length;
		/*int r = 2;
		int c = 2;
*/
		for (int j = c-1; j >=0; j--) {
			System.out.print("("+r+" "+j+")");
		}

		System.out.println();
		
			for (int j = c+1; j < clength; j++) {
				System.out.print("("+r+" "+j+")");
			}
		
			System.out.println();

			for (int i = r+1; i < rlength; i++) {
				System.out.print("("+i+" "+c+")");
				
			}

			System.out.println();
			for (int j = r-1; j >=0; j--) {
				System.out.print("("+j+" "+c+")");
				
				//System.out.print(arr[j][c]);
			}
			System.out.println();
			int ra=r;
			int ca=c;
			while(ra>=1 && ca>=1)
			{
				ca--;
				ra--;
				System.out.print("("+ra+" "+ca+")");			
			}
			
			System.out.println();
			
			int ra2=r;
			int ca2=c;


			while(ra2>=1 && ca2<clength)
			{
				ca2++;
				ra2--;
				System.out.print("("+ra2+" "+ca2+")");			
			}
			
			System.out.println();
			
			int ra3=r;
			int ca3=c;

			while(ra3<arr.length && ca3>=1)
			{
				ca3--;
				ra3++;
				System.out.print("("+ra3+" "+ca3+")");			
			}
			
			System.out.println();
			int ra4=r;
			int ca4=c;

			while(ra4<rlength-1 && ca4<clength)
			{
				ca4++;
				ra4++;
				System.out.print("("+ra4+" "+ca4+")");			
			}		{
		}
	}
	public static void main(String[] args) {
		
		int[][] arr = { { 1, 2, 3, 4 },
						{ 5, 6, 7, 8 }, 
						{ 9, 1, 1, 2 },
						{ 1, 4, 5, 6 },
						{ 1, 4, 5, 6 }};
		int r=2;
		int c=1;

		
		_MatrixGetAllDirectoon obj = new _MatrixGetAllDirectoon();
		obj.GetPath(arr, r, c);
	}

}
