package FactoryPattern;

public class C {
	  private static int x; 
	   private static Integer y; 

	 C(int x,int y){}; 
	    
	   public static void main(String[] args){ 
	      C c = new C(1,2); 
	      System.out.println(x); 

	      System.out.println(y); 
	     // Object i = Integer.valueOf(42);
	      int i=9;
	   //   String s = (String)i;
	      String s1 = String.valueOf(i);
	      
	      Integer obj = new Integer(i);
	      String str4 = obj.toString();
	      System.out.println(str4);
	      String k="8";
	      int j=Integer.parseInt(k);
	      int k2=Integer.valueOf(k);
	      System.out.println("Value:  "+k2);
	      
	      String str5 = new Integer(i).toString();
	      System.out.println("String str4 = " + str5);
	    	   
	      for(String s : args){
	    		System.out.println("D: "+s);
	    	    }
	    		
	    	    }


	      
	     /* String k="5";
	      int p=Integer.parseInt(k);
	      System.out.println(p);
	   */ 		  
	   } 
	
