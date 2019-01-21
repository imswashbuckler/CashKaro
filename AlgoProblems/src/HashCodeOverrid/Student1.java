package HashCodeOverrid;

import java.util.Map;

public class Student1 {
	

	public String name;
	public String Branch;
	public Integer id;

	Student1(String name, String Branch, Integer id) {
		this.name = name;
		this.Branch = Branch;
		this.id = id;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return Branch;
	}

	public void setBranch(String branch) {
		Branch = branch;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		String st="da";
	}
	

	@Override
	public int hashCode() {
		return   name.hashCode()+Branch.hashCode()+id.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Student1 o=(Student1)obj;
		return (o.getBranch()==this.getBranch() && o.getName()==this.getName());
		
	}
	
	
		
}
