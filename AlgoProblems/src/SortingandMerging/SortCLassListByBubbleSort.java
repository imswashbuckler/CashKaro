package SortingandMerging;

import java.util.ArrayList;
import java.util.Arrays;

public  class SortCLassListByBubbleSort {
	static int m;
	int n;

	public void test() {
		System.out.println(m);
		System.out.println(n);

	}

	public static void test1() {
		System.out.println(m);
		SortCLassListByBubbleSort obj = new SortCLassListByBubbleSort();
		System.out.println(obj.n);

	}

	public static void main(String[] args) {
	/*	System.out.println();

		String s1 = new String("hello");
		String s2 = "hello";
		String s3 = s1.intern();// returns string from pool, now it will be same
								// as s2
		String s5 = s2.intern();
		String s4 = s1.intern();

		System.out.println(s1 == s3);
		System.out.println(s4 == s1);
		System.out.println(s1.equals(s4));
		System.out.println(s1 == s2);// false because reference is different
		System.out.println(s2 == s3);// true because reference is same
*/		
		emp1 e=new emp1(1, "A");
		emp1 e1=new emp1(2, "B");
		ArrayList<emp1> l=new ArrayList<emp1>();
		l.add(e);
		l.add(e1);
		System.out.println(l.size());
		
		for(int i=0;i<l.size();i++)
		{
			for(int j=1;j<l.size();j++)
			{
				if(l.get(i).name.compareTo(l.get(j).name)>0)
				{
					emp1 temp=l.get(i);
					l.set(i,l.get(j));
					l.set(j,temp);
					
				}
				
				
			}
		}
		
System.out.println(l);
		
			
	}
}



class emp1
{
	int id;
	String name;
	
	emp1(int id,String name)
	{
		this.id=id;
		this.name=name;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "emp1 [id=" + id + ", name=" + name + "]";
	}
	
	
}

