package AProgramsPorblems;

import java.util.Arrays;

public class Armstrong {

	int sum;
	int a;
	public int checkarmstrong(int num)
	{
		while (num>0)
		{
			a=num%10;
			System.out.println("a"+a);
			sum=sum+a*a*a;
			num=num/10;
			System.out.println("num" + num);
		
}
		return sum;
		
		
		
	}
	
public static void main(String[] args) {
	
	int k=152;
	Armstrong arm = new Armstrong();
	int armnu=arm.checkarmstrong(k);
	
	//System.out.println(5%2);
	
	if(k==armnu)
		
	{
		System.out.println("Armstring number");
		
	}
	else
	{

		System.out.println("Not Armstring number");
		
	}
	
	
	
}
}
