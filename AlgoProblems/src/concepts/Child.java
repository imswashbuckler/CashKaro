package concepts;


 public class Child extends BaseclasConstructorProblem {

	Child(int x,int y)
		{
	//	super(y); or this if in parent class default constructor is not defined
		
		System.out.println("Ram");
			
		}
	public static void main(String[] args) {
		int a=4;
		int b=5;
	
		   System.out.println(a>2||b>2); 

		
		
	}
 
 }
 class BaseclasConstructorProblem {
	int a;
	int b;
	BaseclasConstructorProblem(){}
	
	BaseclasConstructorProblem(int a) {
		this.a = a;

	}

}