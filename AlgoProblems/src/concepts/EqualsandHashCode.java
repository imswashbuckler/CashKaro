package concepts;

import java.util.HashMap;
import java.util.Map;

public class EqualsandHashCode {
	
	public static void main(String[] args) {
		
		Student s1=new Student(1234);
		Student s2=new Student(1234);
		System.out.println(s1.equals(s2));
		
		Map<Student,Integer> map= new HashMap<Student,Integer>();
		map.put(s1, 1);
		map.put(s2, 1);
		System.out.println(map.size());
		
	}

}


class ReportCard
{
	private int mathScore;
	ReportCard()
	{
		
	}
	public int getmathScore()
	{
		return mathScore;
	}
	
}

class Student
{
private int registratinNumber;
Student(int registratinNumber)
{
	this.registratinNumber=registratinNumber;
}
public int getregistratinNumber()
{
	return registratinNumber;
	
	}


	public boolean equals(Object obj) {
	
	  if(this == obj) 
          return true; 
      
      if(obj == null || obj.getClass()!= this.getClass()) 
          return false; 
        
      // type casting of the argument.  
      Student geek = (Student) obj; 
        
      // comparing the state of argument with  
      // the state of 'this' Object. 
      return (geek.registratinNumber == this.registratinNumber); 
	
}
	public int hashCode() 
    { 
          
        // We are returning the Geek_id  
        // as a hashcode value. 
        // we can also return some  
        // other calculated value or may 
        // be memory address of the  
        // Object on which it is invoked.  
        // it depends on how you implement  
        // hashCode() method. 
        return this.registratinNumber; 
    } 
}