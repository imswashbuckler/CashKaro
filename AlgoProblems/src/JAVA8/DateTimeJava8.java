package JAVA8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeJava8 {
	
	public static void main(String[] args) {
		
		LocalDate dt = LocalDate.now();
		System.out.println(dt);
		int dd=dt.getDayOfMonth();
		int mmm=dt.getMonthValue();
		int yy=dt.getYear();
		System.out.println(dd+"-"+mmm+"-"+yy+"");
		
		
		LocalTime tm = LocalTime.now();
		int hr=tm.getHour();
		int mm=tm.getMinute();
		int ss=tm.getSecond();
		int ns=tm.getNano();
		System.out.println(tm);
		
		System.out.println(hr+"-"+mm+"-"+ss+"-"+ns);
		System.out.printf("%d:%d:%d:%d",hr,mm,ss,ns);
		
		LocalDateTime ldt= LocalDateTime.of(1995, Month.JANUARY,28,12,45);
				System.out.println(ldt);
				System.out.println(ldt.minusMonths(6));				
				System.out.println(ldt.plusMonths(6));
	
	LocalDate ld=LocalDate.of(1984, Month.AUGUST, 23);
	LocalDate ldt1=LocalDate.now();
	Period pdt =Period.between(ldt1, ld);
	System.out.println(pdt);
	System.out.println(pdt.getYears()+"-"+pdt.getMonths()+"-"+pdt.getDays());
	
	ZoneId zone=ZoneId.systemDefault();
	System.out.println(zone);
	
	//Get Time for any zone
	ZoneId la=ZoneId.of("America/Los_Angeles");
	ZonedDateTime ztime=ZonedDateTime.now(la);
	System.out.println(ztime);
	
	
	
		
	}

}
