package ADeafult;

public class DecimalTobinary {
	
	public static void DecimalToBin(int dec)//111101
	{ String k="";
		while(dec>0)
		{
			int n=dec%2;
			k=n+k;	
			dec=dec/2;
			
			
		}
		
		System.out.println(k);
	}
	public static void main(String[] args) {
		DecimalToBin(10);
		
	}
}