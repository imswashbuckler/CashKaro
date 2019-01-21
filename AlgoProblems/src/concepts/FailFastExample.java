package concepts;
	import java.util.ArrayList;
import java.util.Iterator;
/*
Note 2 : If you remove an element via Iterator remove() method,
exception will not be thrown. However, in case of removing via a 
particular collection remove() method, ConcurrentModificationException 
will be thrown.
Below code snippet will demonstrate this:

*/public class FailFastExample {
    public static void main(String[] args)
    {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);

      //fail fast
        Iterator<Integer> itr = al.iterator();
        
        while(itr.hasNext())
        {
        	if(itr.next()==4)
        	{
        		// itr.remove();// No error
        		 al.add(8);//Error fail fast
        		
        	}
        	
        }
        System.out.println(al);
        
    }
}