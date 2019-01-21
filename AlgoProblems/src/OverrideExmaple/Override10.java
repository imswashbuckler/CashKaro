package OverrideExmaple;

class X10
{
    int method(int i)
    {
        return i *= i;
    }
}
 
class Y10 extends X10
{
    double method(double d)
    {
        return d /= d;    
    }
}
 
class Z10 extends Y10
{
    float method(float f)
    {
        return f += f;
    }
}
 
public class Override10 {

    public static void main(String[] args)
    {
    	float f =2145;
    	System.out.println(f += f);
    	
        Z10 z = new Z10();
         
        System.out.println(z.method(21.12));
    }
}