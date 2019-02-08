package concepts;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class SOLID_LiskovsPrincipleExample {

	public static void main(String[] args) {
		
		List<Members> ls = new ArrayList<Members>();
		ls.add(new LifeTimeMebers("Ram", new Date()));
		ls.add(new AnnualMebers("Niwas", new Date()));
		ls.add(new Enquiry("Sahu"));
		
		for(Members m:ls)
		{
			System.out.println(m.memebertype);
		}
		
	}
	
}

interface int1
{

 void addToDatabase();
	
	}
abstract class Members implements int1 {
	String name; 
	String memebertype;
	Date mStartDate;
	Date mEndDate;
	
	public Members(String name)
	{
		this.name=name;
		
	}
	public abstract void addToDatabase();
	

}

class LifeTimeMebers extends Members {

	public LifeTimeMebers(String name,Date mStart) {
		super(name);
		this.memebertype="LifeTime";
		this.mStartDate=mStart;
		Calendar c = Calendar.getInstance();
		c.setTime(this.mStartDate);
		c.add(Calendar.YEAR, 70);
		this.mEndDate=c.getTime();
	}

	@Override
	public void addToDatabase() {
		System.out.println("i am LifeTime Member");
		
	}

	
	
}

class AnnualMebers extends Members {
	
	public AnnualMebers(String name,Date mStart) {
		super(name);
		this.memebertype="Annual";
		this.mStartDate=mStart;
		Calendar c = Calendar.getInstance();
		c.setTime(this.mStartDate);
		c.add(Calendar.YEAR, 1);
		this.mEndDate=c.getTime();
	}
	
	@Override
	public void addToDatabase() {
		System.out.println("i am Annual Member");
		
	}


}

class Enquiry extends Members {
	
	public Enquiry(String name) {
		super(name);
		this.memebertype="Enquiry";
		
	}
	
	@Override
	public void addToDatabase() {
		System.out.println("i am here for Enquiry");
		
	}



}
