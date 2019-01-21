package AProgramsPorblems;

public class NullPointerCls {
	 static NullPointerCls obj;
	public static void main(String[] args) {
		
		//There are 3 println methods in PrintStream that accept a reference 
		//type - println(char x[]), println(String x), println(Object x).
		// System.out.println(null);
		
		// No compile time excetion because println direlclt go to Object argument method  
		//System.out.println(obj);
		// System.out.println(obj==null);//true
		
		// System.out.println(obj.equals(null));//NullPointerException
		
		// System.out.println(null==null);  // true
		
		String k=null;
		 String k1=null;
		// System.out.println(k); //o/p null
		 String k3 =k+k1;
		// System.out.println(k3);// o/p nullnull
		

		
		
		
		
	}

}
