package SingleTonPattern;

public class SingleTonPattern 
{ 
	
    static final SingleTonPattern instance = new SingleTonPattern(); 
    public int x = 10; 
    
    private SingleTonPattern() {  } 
   
    static public SingleTonPattern getInstance() 
    { 
   
        return instance; 
    }  
    public static void main(String[] args) {
    	
    	SingleTonPattern instance1 = new SingleTonPattern(); 
    	SingleTonPattern instance2 = new SingleTonPattern(); 
System.out.println(instance1.hashCode());
System.out.println(instance2.hashCode());
		
	}
} 