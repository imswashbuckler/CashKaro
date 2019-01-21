package OverrideExmaple;

class X1
{
    void method(int a)
    {
        System.out.println("ONE");
    }
     
    void method(double d)
    {
        System.out.println("TWO");
    }
}
 
class Y1 extends X1
{
    @Override
    void method(double d)
    {
        System.out.println("THREE");
    }
}
 
public class Overload3 
{    
    public static void main(String[] args)
    {
        new Y1().method(100);
        new Y1().method(100.0);
    }
}