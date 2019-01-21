package OverrideExmaple;

public class Override1 {
	public static void main(String[] args) {
        Shape s = null;
        s.draw();
    }
}
 
class Shape{
    public static void draw()//if not static then will throw nullpointer
    {
        System.out.println("Shape");
    }
}