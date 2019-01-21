package PolyMor;

public class ClassB extends ClassA {            
    
	public void method(Number d) {
        System.out.println("ClassB: " + d + " " + d.getClass());
    }
    
    
    public static final void main(String[] args) {
    	ClassA a = new ClassB(); 
    	//a.method("r");
    	a.method(4);
    	Object iAmAString = "avalue+"; 
    	String str = (String)iAmAString; 
    	String s1=iAmAString.toString();

    	System.out.println(s1+str);

    	
	}
    
    	
}


