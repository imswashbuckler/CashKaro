package AProgramsPorblems;

import java.util.ArrayList;
import java.util.Collections;

public class AddEmployeandSortByBubble {

	public static void main(String[] args) {
		
		ArrayList<Employee1> ls = new ArrayList<Employee1>();
		Employee1 e2 = new Employee1(2, "m");
		Employee1 e3 = new Employee1(4, "b");
		Employee1 e1 = new Employee1(7, "z");

		ls.add(e1);
		ls.add(e2);
		ls.add(e3);
		// Collections.sort(ls);

		 Employee1 mo=null;
		for (int i = 0; i < ls.size(); i++) {

			for (int j = 1; j < ls.size(); j++) {
				if (ls.get(i).compareTo(ls.get(j)) > 0)
				{
				mo = ls.get(i);
				ls.set(i, ls.get(j));
				ls.set(j, mo);

				

				}

			}
		}

			for (Employee1 k : ls) {

				System.out.println(k.empId + "--" + k.empName);

			

		}

	}
}
	class Employee1 implements Comparable<Employee1> {
		Integer empId;
		String empName;

		public Employee1(int empId, String empName) {
			this.empId = empId;
			this.empName = empName;

		}

		@Override
		public int compareTo(Employee1 o) {

			return empId.compareTo(o.empId);
		}

		public Integer getEmpId() {
			return empId;
		}

		public void setEmpId(Integer empId) {
			this.empId = empId;
		}

		public String getEmpName() {
			return empName;
		}

		public void setEmpName(String empName) {
			this.empName = empName;
		}

	}

