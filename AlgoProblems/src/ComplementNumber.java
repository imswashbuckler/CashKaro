import java.util.Arrays;

public class ComplementNumber {
	static String sum = "";

	public static String complementNum(int i) {

		while (i > 0) {

			int k = i % 2;
			String r = String.valueOf(k);
			sum =  sum+r;
			i = i / 2;

		}		
		char[] cA=sum.toCharArray();
		
		for(int m=0;m<cA.length;m++)
		{
			if(cA[m]=='0')
			{
				
				cA[m]='1';
				
			}
			 else if(cA[m]=='1')
			{
				cA[m]='0';
				
			}
			
		}
		
		/*int m=Integer.parseInt(sum);
		System.out.println(m);
		*/
		String str = String.valueOf(cA);
	
		// int j=Integer.parseInt(str);
		return str;
	}	

	public static int getDecimal(int binary){  
	    int decimal = 0;  
	    int n = 0;  
	    while(binary>0)
	    {  
	    
	          int temp = binary%10;  
	          decimal += temp*Math.pow(2, n);  
	          binary = binary/10;  
	          n++;  
	       
	    }  
	    return decimal;  
	}  
	static int binaryToDecimal(String n)
    {
        String num = n;
        int dec_value = 0;
     
        // Initializing base value to 1, 
        // i.e 2^0
        int base = 1;
     
        int len = num.length();
        for (int i = len - 1; i >= 0; i--)
        {
            if (num.charAt(i) == '1')
                dec_value += base;
            base = base * 2;
        }
     
        return dec_value;
    }
	

	public static void main(String[] args)
	{
		String a=complementNum(5);
		System.out.println(a);
		//char[] arr=a.toCharArray();
		
		//double compledeci=binarytoDecimal(a);
		//System.out.println(compledeci);
		
		int k =getDecimal(11);
		System.out.println(k);
		String num = new String("10101001"); 
        System.out.println(binaryToDecimal(num));
        
        int k1=100001;
        String k2=Integer.toString(k1);
        String g1="100001";
        int g2=Integer.parseInt(g1);
        System.out.println(k2);
	}

}
