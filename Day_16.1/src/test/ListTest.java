package test;

import java.util.Comparator;
import java.util.List;

public class ListTest {
	private List<Employee> list;

	public ListTest() {
	}

	public ListTest(List<Employee> list) {
		this.list = list;
	}

	public void setList(List<Employee> list) {
		this.list = list;
	}

	public void addEmployee(Employee[] arr) {
		if (this.list != null && arr != null) {
			for (Employee element : arr) {
				this.list.add(element);
			}
		}
	}

	public Employee findEmployee(int empId) {
		if (this.list != null) {
			Employee key = new Employee();
			key.setEmpId(empId);
			if (this.list.contains(key)) {
				int index = this.list.indexOf(key);
				Employee emp = this.list.get(index);
				return emp;
			}
		}
		return null;
	}
	
	public void printRecord( Comparator<Employee> emp ) {
		if( this.list != null ) {
			this.list.sort(emp);
			for( Employee element : list )
				System.out.println(element);
		}
		
	}

}
