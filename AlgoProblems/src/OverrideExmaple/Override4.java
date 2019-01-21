package OverrideExmaple;
import java.io.FileNotFoundException;
import java.io.IOException;
 
public class Override4 {

	/*While overriding a method, you can compress the scope of checked exception but you cannot widen it. Also you can not throw any other checked exception which is not being thrown in parent class method.

	Here, FileNotFoundException is a child class of IOException. So, above code will compile successfully and it will give Circle as output.

	If we change FileNotFoundException to generic Exception in above code, then it will give compile time error saying 'Exception Exception is not compatible with throws clause in Shape.draw()'.
*/

 
    public static void main(String[] args) throws IOException{
        Shape3 s = new Circle3();
        s.draw();
    }
}
 
class Shape3{
    public void draw() throws FileNotFoundException, IOException
    {
        System.out.println("Shape3");
    }
}
 
class Circle3 extends Shape3{
    public void draw() throws  IOException
    {
        System.out.println("Circle3");
    }
}
