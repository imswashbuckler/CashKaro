package SingleTonPattern;
public class SingletinUse {
		   public static void main(String args[])     
	   { 
		   SingleTonPattern a = SingleTonPattern.getInstance(); 
		   SingleTonPattern b = SingleTonPattern.getInstance(); 
	       a.x = a.x + 10; 
	       System.out.println("Value of a.x = " + a.x); 
	       System.out.println("Value of b.x = " + b.x); 
	   }     
	} 


