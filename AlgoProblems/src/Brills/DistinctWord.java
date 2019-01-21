package Brills;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.lang.model.element.Element;

public class DistinctWord {

	public ArrayList<String> getCommonWords1(ArrayList<String> list1,
			ArrayList<String> list2)
	{

		ArrayList<String> commonlist = new ArrayList<String>();
		int i = 0;
		while (i < list1.size()) {
			for (int j = 0; j < list2.size(); j++) {
				if (list1.get(i) == list2.get(j)) {
					commonlist.add(list1.get(i));
					break;
				}

			}
			i++;
		}
		return commonlist;

	}

	public ArrayList<String> getCommonWords(ArrayList<String> list1,
			ArrayList<String> list2) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		Set<String> duplicateCheck = new HashSet<String>();
		ArrayList<String> commonWords = new ArrayList<String>();

		for (int i = 0; i < list1.size(); i++) {

			int count = 0;

			if (map.get(list1.get(i)) != null) {
				count = count + map.get(list1.get(i));

			}
			map.put(list1.get(i), count);
		}

		// List1
		for (int i = 0; i < list2.size(); i++) {

			int count = 0;

			if (map.get(list2.get(i)) != null
					&& !duplicateCheck.contains(list2.get(i))) {
				count = count + map.get(list1.get(i));
				commonWords.add(list2.get(i));
			}
			map.put(list2.get(i), count);
			duplicateCheck.add(list2.get(i));
		}
		return commonWords;

	}

	public static void main(String[] args) {
		DistinctWord obj = new DistinctWord();
		ArrayList<String> l1 = new ArrayList<String>();
		l1.add("ABCD");
		l1.add("DEF");
		l1.add("GHI");
		l1.add("JKL");
		l1.add("MNO");
		l1.add("PQR");
		l1.add("MNO");
	//	Collections.sort(l1);
		ArrayList<String> l2 = new ArrayList<String>();
		l2.add("ABCD");
		l2.add("DEF");
		l2.add("GHI");
		l2.add("JKL");
		l2.add("MNO");
		l2.add("PQR");
		l2.add("MNO");

		ArrayList<String> common1 = new ArrayList<String>();
		// Method 1

		common1 = obj.getCommonWords(l1, l2);
		System.out.println("Common"+common1);
		
		List<String> l3 = new ArrayList<String>(l2);
		l3.retainAll(l1);

	    System.out.println("The common collection is : " + l3);
	    
	    List<String> listapluslistb =new ArrayList<String>(l1);    
        listapluslistb.addAll(l2);
        System.out.println(listapluslistb);

        Set<String> listaunionlistb =new HashSet<String>(l1);
        listaunionlistb.addAll(l2);
        System.out.println(listaunionlistb);

        for(String s:listaunionlistb)
        {
            listapluslistb.remove(s);
        }
        System.out.println(listapluslistb);


	}

}
