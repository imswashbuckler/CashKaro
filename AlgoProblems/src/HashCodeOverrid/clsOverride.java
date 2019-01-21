package HashCodeOverrid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class clsOverride {
public static void main(String[] args) throws ClassNotFoundException
{
	
	
	    Student1 stu1 = new Student1("Ram2","EE",1);
		Student1 stu2 = new Student1("Ram2","EE",1);	
	/*	Student1 stu3 = new Student1("Ram1","EE",1);	
		Student1 stu4 = new Student1("Ram","EE",1);	
		Student1 stu5 = new Student1("Ram","EE",1);	
	*/	
		//System.out.println(stu1.hashCode());
	//	System.out.println(stu2.hashCode());
		//System.out.println(stu1.equals(stu2));
		Map<Student1, String> map = new  HashMap<Student1, String>();
		map.put(stu1, "Ram");
		map.put(stu2, "Ram1");
		
	//	System.out.println(map.size());
	 //  System.out.println(map.get(stu5));
		
		List<Student1> ls = new ArrayList<Student1>();
		ls.add(stu1);
		ls.add(stu2);

		for (Student1 s:ls)
		{
			System.out.println(s.getName()+s.getBranch()+s.getId());
			
		}
	   
		
	   Set<Student1> obj = new  HashSet<Student1>();
	   obj.add(stu1);
	   obj.add(stu2);
	   
	   
		for (Student1 s:obj)
		{
			// System.out.println(s.getName()+s.getBranch()+s.getId());
			
		}
	   
	   if(obj.contains(new Student1("Ram2","EE",5)))
	   {
		   System.out.println("Yes");
		   
	   }
	   else
	   {
		   System.out.println("No");
	   }
		
	
}
}
