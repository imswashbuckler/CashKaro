package FileHandling;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.commons.collections.map.HashedMap;

public class Largest3FileFromDirectory {

	static HashMap<String, Integer> map = new HashMap<String, Integer>();

	public void listFilesAndFilesSubDirectories(String Path) {
		
		
		File files = new File(Path);
		// get all the files from a directory
		File[] fList = files.listFiles();
		for (File file : fList) {
			
			if (file.isFile()) {

				map.put(file.getAbsolutePath(), (int) file.length());
			} else if (file.isDirectory()) {
				listFilesAndFilesSubDirectories(file.getAbsolutePath());
			}
		}

	}

	public static void main(String[] args) {
		//	static HashMap<String, Integer> map = new HashMap<String, Integer>();
		Largest3FileFromDirectory listFilesUtil = new Largest3FileFromDirectory();
		final String directoryWindows = "D://AAAAAAA";
		listFilesUtil.listFilesAndFilesSubDirectories(directoryWindows);
		List<Entry<String, Integer>> list=new
				ArrayList<Entry<String,Integer>>(map.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String,Integer>>() 
				{
				@Override
					public int compare(Entry<String, Integer> o1,
							Entry<String, Integer> o2) {
						return o2.getValue().compareTo(o1.getValue());
					}
		
		});
		
		
		/*Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1,
					Map.Entry<String, Integer> o2) {
				return (o2.getValue()).compareTo(o1.getValue());
			}
		});
		*/
		
		int count = 1;
		for (Map.Entry<String, Integer> entry : list) {
			{

				System.out
						.println(entry.getKey() + " ==== " + entry.getValue());

			}
			count = count + 1;
			if (count > 3) {
				break;
			}

		}
	}

}
