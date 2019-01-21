package concepts;

public class Serialization implements java.io.Serializable {
	   public String name;
	   public String address;
	   public transient int SSN;
	   public int number;
	   
	   public void mailCheck() 
	   {
	      System.out.println("Mailing a check to " + name + " " + address+"  SSN: "+SSN+"  number: "+number);
	   }
	   
	   
	   public static void main(String[] args) {
		Serialization sz = new Serialization();
		sz.mailCheck();
		   
	}
	}

