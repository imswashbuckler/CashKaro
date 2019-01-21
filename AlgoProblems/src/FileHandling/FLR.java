package FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class FLR {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader(
				"D:\\AAAAAAA\\a\\File.txt"));
		Map<String, Integer> map = new TreeMap<String, Integer>();
		String line;
		int count = 1;
		while ((line = br.readLine()) != null) {
			String[] L1 = line.split(" ");

			for (String k : L1) {
				if (map.containsKey(k)) {
					map.put(k, count + 1);
				}

				else {
					map.put(k, count);

				}
			}
	
	}
		
		//System.out.println(map);
		List<Entry<String, Integer>> list= new ArrayList<Map.Entry<String,Integer>>(map.entrySet());

		Collections.sort(list,new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				
				return o1.getValue().compareTo(o2.getValue());
			}
		});

        System.out.println(Arrays.asList(list));

	}
}

