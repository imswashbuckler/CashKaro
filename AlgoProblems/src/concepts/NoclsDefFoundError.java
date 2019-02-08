package concepts;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class NoclsDefFoundError implements t {


	public static void main(String[] args) {
		
        
      //  SimpleCalculator calculator2 = new SimpleCalculator();
        
        Vector<String> v=new Vector<String>();
        v.add("Amit");
        v.add("Raj");
        v.add("Pathak");
        v.add("Sumit");
        v.add("Aron");
        v.add("Trek");
        
        List<String> al=new ArrayList<String>();
        al.add("Amit1");
        al.add("Raj1");
        al.add("Pathak1");
        al.add("Sumit1");
        al.add("Aron1");
        al.add("Trek1");

        Iterator<String> itr =al.iterator();
        while(itr.hasNext())
        {
            String value=(String) itr.next();
            System.out.println(value);

        	itr.remove();;
        	//System.out.println(itr.next());
        	
        }
        
        Enumeration<String> en=v.elements();

        while(en.hasMoreElements())
        {
            String value=(String) en.nextElement();
           // System.out.println(value);
            v.remove(value);

        }

    }
        
    }

interface t
{
	int k=5;
	}

 class SimpleCalculator {
 //   static int undefined = 1 / 0;
}