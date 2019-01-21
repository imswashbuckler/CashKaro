
public class SubstringFromLargeString {
	
	
	public  double calcHash(String str)
	{
		double sum=0;
		char[] chA=str.toCharArray();
		for(int i=0;i<chA.length;i++)
		{
		int k= chA[i];
		double l=Math.pow(k, i);	
		sum=sum+l;
		
		}
		return sum;
		
	}
	
	public boolean subtringPresent(String str,String substr)
	{
		boolean b=false;
		double subHash=calcHash(substr);
		int strlength=str.length();
		int sublenght=substr.length();
		int dif=strlength-sublenght;
		for(int i=0;i<=dif;i++)
		{

			String substr1=str.substring(i, sublenght+i);
			double strsubHash=calcHash(substr1);
			if(subHash==strsubHash)
			{
				b=true;
				break;
				
			}	
		}
		
		
		return b;
	}
	public static void main(String[] args) {
		
		SubstringFromLargeString obj= new SubstringFromLargeString();
		String str1="ABCDFEFGHI";
		String str2="ABCDFEFKH";
		boolean k=obj.subtringPresent(str1,str2);
		System.out.println(k);
		
		
	}

}
