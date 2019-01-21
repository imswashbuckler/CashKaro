package AProgramsPorblems;

public class Triangle1 {
	int count=1;
	
	public void  triangle(int k)
	{
			while(k>1)
			{
			
				for(int i=1;i<(k+1)/2;i++)
				{
					//System.out.println(i);
					System.out.print(" ");
					
				}
			
				for(int i=0;i<count;i++)
				{
					System.out.print("*");
					
				}
				count=count+2;
				k=k-2;
				System.out.println();
				
				
			}
		
		
	}

	public static void main(String[] args) {
		
		Triangle1 t = new Triangle1();
		t.triangle(10);
		String a ="Ram";
		a.concat("Sahu");
		String b=a;

		System.out.println(a);
		System.out.println(a.concat("Sahu"));
	}
}
