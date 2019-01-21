package AProgramsPorblems;

public class ArrayRemoveDupli {

	
	
	
	
	public static void main(String[] args)
	{
		int[] MyArr = {2,2,5,3,6,12,7,2,9,3,6,12};
		int len=MyArr.length;
		int j=0;
		
		for (int i=0;i<len;i++)
		{
			for (int k=i+1;k<len;k++)
			{
				if(MyArr[i] != MyArr[k])
				{
					MyArr[j] = MyArr[i];
					j++;
					//break;
				}
				
			
			}
		
				
		}
		System.out.println("The length now is" +len);
		System.out.println("The array without duplicates is");
		for (int l=0;j<len;j++)
			System.out.println(MyArr[l]);
		
	}
}