package concepts;

public class _Cust {
	String name;

	_Cust(String name)
	{
		this.name=name;
	}


	public void setName(String name) {
		this.name = name;
	}
	public String getname()
	{
		String temp=this.name;
		this.name="test";
		return temp;
		
	}
	
	

}
