package concepts;

public class _FinalVarRefer {
	
	public static void main(String[] args) {
		final _Cust cust=new _Cust("A");
	//	cust.setName("V");
		
		System.out.println(cust.getname());
		System.out.println(cust.getname());
		
		
	}

}

class _Cust {
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
