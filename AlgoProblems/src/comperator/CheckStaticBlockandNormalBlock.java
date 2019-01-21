package comperator;

import java.util.HashMap;
import java.util.Map;

public class CheckStaticBlockandNormalBlock extends test1 {

	CheckStaticBlockandNormalBlock(String str) {
		System.out.println("CheckStaticBlockandNormalBlock Consturctor");
	}

	{
		System.out.println("CheckStaticBlockandNormalBlock Normal bloclk");
	}

	static {
		System.out.println("CheckStaticBlockandNormalBlock stacic block");
	}

	public static void main(String[] args) {

		CheckStaticBlockandNormalBlock t = new CheckStaticBlockandNormalBlock("str");
		Map<String,String> map = new HashMap<String, String>();
		map.put(null, "a");
		for(String k:map.keySet())
		{
			System.out.println(map.get(k));
			
		}
		//System.out.println(map.get(null).hashCode());
		
	}

}

class test1 {

	{
		System.out.println("test1 Normal bloclk");
	}

	static {
		System.out.println("test1 stacic block");
	}

}
