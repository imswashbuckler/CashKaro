package concepts;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class Ref2 {

	public static void tet(int a, int b)
	{
		System.out.println(a - b);
	}

	public static void tet(float a, float b) 
	{

	}

	public static void tet(Integer a, Integer b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) throws IOException,
			ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException,
			NoSuchFieldException 
	    {
	//	tet(new Integer(5), 3);
		try {
			Class c = Class.forName("Ref1.class");
			System.out.println("Class " + c + " found successfully!");
			Object o = c.newInstance();
			Method m = c.getDeclaredMethod("message", null);
			m.setAccessible(true);
			m.invoke(o, null);
			Field f1 = c.getClass().getField("l");
			f1.set(c, "reflecting on life");
			int str1 = (int) f1.get(c.getClass());
			System.out.println("field: " + str1);

		} catch (ClassNotFoundException ex) {

			System.err.println("A ClassNotFoundException was caught: "
					+ ex.getMessage());

			ex.printStackTrace();

		}

	}
}
