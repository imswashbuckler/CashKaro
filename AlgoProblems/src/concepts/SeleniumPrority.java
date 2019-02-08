package concepts;
import java.util.Set;

public class SeleniumPrority {
	
	public static void main(String[] args) {
		java.util.Properties prop=System.getProperties();
		Set<Object> st= prop.keySet();
		for(Object ob:st)
		{
			System.out.println(ob.toString()+"-->"+System.getProperty(ob.toString()));
		}
		
	}
	
	/*@Test()
	public void aa_method(){
		System.out.println("I'm in method C");
	}
	@Test()
	public void aa_method1(){
		System.out.println("I'm in method B");
	}
	@Test(priority=-6)
	public void ca_method(){
		System.out.println("I'm in method A");
	}
	@Test(priority=0)
	public void e_method(){
		System.out.println("I'm in method E");
	}
	@Test(priority=6)
	public void d_method(){
		System.out.println("I'm in method D");
	}
*/
}
