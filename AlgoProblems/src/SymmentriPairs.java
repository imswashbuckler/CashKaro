import java.util.HashMap;

public class SymmentriPairs {

	
	public static void symPair(int[][] arr)
	{
		HashMap<Integer, Integer> hm1 = new HashMap<Integer, Integer>();

		for(int i=0;i<arr.length;i++)
		{
		int f=arr[i][0];
		int s=arr[i][1];
		Integer val=hm1.get(s);
		if(val !=null && val==f  )
		{
			System.out.println(f+"--------"+s);
			
		}
		else
		{
			hm1.put(f, s);
		}
		}
	}
	public static void findSymPair(int[][] arr) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {

			int first = arr[i][0];
			int second = arr[i][1];
			Integer val = hm.get(second);

			if ( val!=null && val == first) {
				System.out.println(first + " " + second);
			}

			else {

				hm.put(first, second);
			}

		}

	}
	
	public static void symPairs2(int[][] arr)
	{
		HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();
		

		for(int i=0;i<arr.length;i++)
		{
			int first=arr[i][0];
			int second=arr[i][1];
			if(map.containsKey(second) && map.get(second)==first)
			{
				System.out.println(first+" -- "+second);
			}
			else
			{
			map.put(first, second);	
			}
			
			
		}
		
	}

	public static void main(String[] args) {
		int arr[][] = new int[5][2];
		//11 20 
		//30 40
		//5 10
		//40 30
		//10 5
		arr[0][0] = 11;
		arr[0][1] = 20;
		arr[1][0] = 30;
		arr[1][1] = 40;
		arr[2][0] = 5;
		arr[2][1] = 10;
		arr[3][0] = 40;
		arr[3][1] = 30;
		arr[4][0] = 10;
		arr[4][1] = 5;
		//symPair(arr);
		findSymPair(arr);

		//symPairs2(arr);
	}

}
