package Serializationcls;

public class Test12  {
	
	public static void main(String[] args) {
		//Dog1 o=new Dog1();
		//Animal1 o1=new Animal1();
		Animal1 o1=new Dog1();
		
		o1.m();
	}

}

class Dog1 extends  Animal1{
	
	

}


 class Animal1

{
	 public void m()
		{
			System.out.println("Ram1");
			
		}

}
