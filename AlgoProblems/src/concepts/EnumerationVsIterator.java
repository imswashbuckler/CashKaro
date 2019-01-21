package concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationVsIterator {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("A");
		arr.add("A");
		arr.add("A");
		arr.add("D");
		arr.add("C");
	//	System.out.println(arr);
		Iterator<String> it = arr.iterator();
		
		while (it.hasNext()) {
			String el="A";
			if(el.equals(it.next()))
			{
				it.remove();

			}
		}

	    Enumeration e = Collections.enumeration(arr);

	    while(e.hasMoreElements())
	        System.out.print(e.nextElement());
	    
		//System.out.println();

				//System.out.println(arr);

	}

	}
	

