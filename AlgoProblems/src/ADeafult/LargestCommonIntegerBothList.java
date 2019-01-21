package ADeafult;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class LargestCommonIntegerBothList {

	public static void  biggestCommonInteger1(int[] a,int[] b) {
		
		Set<Integer> st1 = new TreeSet<Integer>();
		Set<Integer> st2 = new TreeSet<Integer>();
		int x=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			st1.add(a[i]);
		}
		
		for(int i=0;i<b.length;i++)
		{
			st2.add(b[i]);
		}
		
		for(int b1:st1)
		{
			if(st2.contains(b1)==true)
			{
				//System.out.println(b1);
		
				if(x<b1)
				{
					x=b1;
					
				}
				
			}
		}
		System.out.println(x);
	}

	public static void main(String[] args) {

		int[] k = { 31, 2, 13, 14, 5, 6, 43 };
		int[] l = { 19, 23, 31, 6, 15, 36, 2 };
		/*getMaxCommon(k, l);
		// System.out.println(Arrays.toString(k));

		List<Integer> ls1 = new ArrayList<Integer>(Arrays.asList(k));
		List<Integer> ls2 = new ArrayList<Integer>(Arrays.asList(l));

		int m = biggestCommonInteger(ls1, ls2);
		System.out.println(m);
		*/
		biggestCommonInteger1(k,l);

	}

}
