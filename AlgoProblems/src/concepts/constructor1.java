package concepts;

public class constructor1 extends constructor

{
	constructor1()
	{
		//super(5);
	//	this(1);
		System.out.println("im without child");
		
	}
	
	constructor1(int i)
	{
		
		System.out.println("im child");
		
	}
	
	public static void main(String[] args) {
		
		constructor1 as = new constructor1(5);
		
		
	}
	
	
}

class constructor {
	
	constructor(int k)
	{
		
	System.out.println("super");	
	
	}
	
	constructor()
	{
		
	System.out.println("not parame super");	
	}
	/*public static void main(String[] args) {
		
		System.out.println("i m main");
	}
	*/
}

