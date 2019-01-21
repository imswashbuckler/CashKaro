package concepts;

public class Vehicle extends Bike {

  int speed=50;  
  void display(){  
	   System.out.println(speed);//will print speed of Bike   
	  }  

  public static void main(String args[]){  
	   Bike b=new Vehicle();  
	   Vehicle b1=new Vehicle();  

	   b.display();  
	   b1.display();  
	    
	}  
}  
	  
	class Bike{  
	  int speed=100;  
	      
	  void display(){  
	   System.out.println(speed);//will print speed of Bike   
	  }  

}  
