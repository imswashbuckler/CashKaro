package OverrideExmaple;

public class Override5 {

//	Answer: Yes. Overridden methods can throw any RuntimeException 
	// irrespective of its scope unlike checked exception.
	// but for checked exception , it should be in scope


    public static void main(String[] args){
        Shape5 s = new Circle5();
        s.draw();
    }
}
 
class Shape5{
    public void draw() throws ArithmeticException
    {
        System.out.println("Shape5");
    }
}
 
class Circle5 extends Shape5{
    public void draw() throws RuntimeException 
    {
        System.out.println("Circle5");
    }
}
