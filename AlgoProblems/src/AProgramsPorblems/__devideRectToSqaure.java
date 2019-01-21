package AProgramsPorblems;

/*Given a paper of size A x B. Task is to cut the paper into squares of any size. Find the minimum number of squares that can be cut from the paper.

Examples:

Input  : 13 x 29
Output : 9
Explanation : 
2 (squares of size 13x13) + 
4 (squares of size 3x3) + 
3 (squares of size 1x1)=9
*/
public class __devideRectToSqaure {

	public static void swap(int k, int l)
	{
		int temp=k;
		k=l;
		l=temp;	
	}
	static int minimumSquare(int a, int b)
	{
	     int result = 0, rem = 0;
	    if (a < b)
	        swap(a, b);
	 
	    while (b > 0)
	    {
	        result += a/b;
	        rem = a % b;
	        a = b;
	        b = rem;
	    }
	 
	    return result;
	}
	 
	
	
	public static int findsqr(int a,int b)
	{
		int result=0;
		while (b>0)
		{
		 result=result+a/b;
		 int r=a%b;
		 a=b;
		 b=r;
			
		}
		return result;
		
		
	}
	
public static void main(String[] args) {//12+2
	
	    int m = 99, n = 8;  //3*8;2*3  
	    
	  int r=  findsqr(m,n);

	  int r1=  minimumSquare(m,n);
	  System.out.println(r);
	  System.out.println(r1);
			
}
}
