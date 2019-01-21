package OverrideExmaple;

class A11
{
    public A11(int i)
    {
        System.out.println(myMethod(i));
    }
     
    int myMethod(int i)
    {
    	
        return ++i + --i;
    }
}
 
class B11 extends A11
{
    public B11(int i, int j)
    {
        super(i*j);
         
        System.out.println(myMethod(i, j));
    }
     
    int myMethod(int i, int j)
    {
        return myMethod(i*j);
    }
}
 
public class Override11
{
    public static void main(String[] args)
    {
        B11 b = new B11(12, 21);
    }    
}