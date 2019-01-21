import java.util.Arrays;


public class fibonacciSeries 
{
public static void main(String[] args) {
	int a=100;
	int[] fib= new int[a];
	fib[0]=0;
	fib[1]=1;int i=2;
	
while(i<100)
{
	for(i=2;i<a;i++)
	{
		fib[i]=fib[i-1]+fib[i-2];		
		
	}
}
	System.out.println(Arrays.toString(fib));
}
	
}