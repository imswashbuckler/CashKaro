package Brills;

public class Test_1 {
	static void t()
	{
		System.out.println("S");
		t();
	}
	
	public static void main(String[] args) {
		
		
		 try
	        {
	            int i=1/0;
	        }
	        catch (Exception e)
	        {
	            System.out.print("z");   
	        }  
		/* catch (ArithmeticException ee)// throw unreachable code
	        {
	            System.out.print("z");   
	        }        
*/
	    }
}