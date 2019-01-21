
public class BintoDecim {

	
	public static void BinToDec(String str)
	{
			int sum=0;
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			int p=Character.getNumericValue(c);
			int l=(int) Math.pow(2, str.length()-1-i);
			sum=sum+p*l;
			
			
		}
		System.out.println(sum);
	}
	
	
	public static void main(String[] args) {
		
		BinToDec("111");
	}

}
