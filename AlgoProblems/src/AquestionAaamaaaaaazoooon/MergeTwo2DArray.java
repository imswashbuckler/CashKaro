package AquestionAaamaaaaaazoooon;

public class MergeTwo2DArray {
	public static void main(String[] args) {
		String[][] arr1 = {{"id", "first_name", "last_name"},
				            {"1", "denise", "phillips"}};
		String[][] arr2 = {{"gender", "ip_address","gender1"}, 
				            {"Female", "152.81.244.149","tets"}};

		int m = arr1[0].length;
		int n= arr2[0].length;
		String[][] arr3 = new String[2][m+n];
				for(int i=0;i<2;i++)
		{
		    for(int j=0;j<m+n;j++)
		    {
		    	//System.out.println(i+"-----------"+j);
		    	
		        if(j<m)
		            arr3[i][j]=arr1[i][j];
		        else
		         
		        arr3[i][j]=arr2[i][j-m];
		    }
		}
		
		for(int x=0;x<2;x++)
		{
		    for(int y=0;y<arr3[0].length;y++)
		    {
		    	System.out.print(arr3[x][y] + "--");
		    	
		    }
		System.out.println();    
		}
		
		}
	}


