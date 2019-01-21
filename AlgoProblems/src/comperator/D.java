package comperator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public class D {
	
	public static void main(String[] args) {
		String str="Ram,Niwas,sahu";
		StringTokenizer st2 = new StringTokenizer(str, ",");

		while (st2.hasMoreElements()) {
			System.out.println(st2.nextElement());
		}
		
		List<String> ls = new ArrayList<String>();
		ls.add("A");
		ls.add("B");
		Iterator<String> str1 =ls.iterator();

		while(str1.hasNext())
		{
			System.out.println(str1.next());
			if(str1.next().equals("B"))
			{
				str1.remove();
				
			}
			
		}
		System.out.println(Arrays.asList(ls));
		
	}

}

