package AProgramsPorblems;

public class dividebyDigitPractice {
	
	public void countDigits(int k)
	{
		int n=k;
		int count=0;
		while(n>0)
		{
			int i=n%10;
				
			if(i>0 && k%i==0)
			{
				count++;
				
			}
			n=n/10;
			
			
			
		}
		System.out.println(count);
		
		
	}
	
	public static void main(String[] args) {
	
		dividebyDigitPractice obj = new  dividebyDigitPractice();
obj.countDigits(100);
	}

}
