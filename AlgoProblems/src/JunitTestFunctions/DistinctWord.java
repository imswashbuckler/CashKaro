package JunitTestFunctions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class DistinctWord {

	// this is BruteForce Mthod with n*n complexity
	public ArrayList<String> getCommonWordsByBruteForce(
			ArrayList<String> list1, ArrayList<String> list2)

	{

		ArrayList<String> commonlist = new ArrayList<String>();
		int i = 0;
		while (i < list2.size()) {
			for (int j = 0; j < list1.size(); j++) {
				if (list2.get(i) == list1.get(j)) {
					commonlist.add(list2.get(i));
					break;
				}

			}
			i++;
		}
		return commonlist;

	}

	public ArrayList<String> getCommonWords2(ArrayList<String> list1,
			ArrayList<String> list2)

	{
		ArrayList<String> commonlist = new ArrayList<String>();

		Set<String> st = new LinkedHashSet<String>();
		st.addAll(list1);
		for (int j = 0; j < list2.size(); j++) {
			if (st.contains(list2.get(j))) {
				commonlist.add(list2.get(j));

			}

		}
		return commonlist;

	}

	//With More Efficient Way using hashMap DataStructure
	public ArrayList<String> getCommonWords(ArrayList<String> list1,
			ArrayList<String> list2) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		Set<String> duplicateCheck = new HashSet<String>();
		ArrayList<String> commonWords = new ArrayList<String>();
		for (int i = 0; i < list1.size(); i++) 
		{
			int count = 1;
			if (map.get(list1.get(i)) != null) 
			{
				map.put(list1.get(i), map.get(list1.get(i)+1));
		
			}
			else
			{
				
				map.put(list1.get(i), count);
			}
		}

	
		
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

		ArrayList<String> l2 = new ArrayList<String>();
		l2.add("ABC");
		l2.add("DEF");
		l2.add("GHI");
		l2.add("PQR");
		l2.add("STU");
		l2.add("ABC");

		ArrayList<String> common1 = new ArrayList<String>();

	//	common1 = obj.getCommonWordsByBruteForce(l1, l2);

		 common1=obj.getCommonWords(l1, l2);
		System.out.println(common1);

	}

}
