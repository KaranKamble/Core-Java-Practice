package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>{
	private int empId;
	private String name;
	
	public Employee() {
	}

	public Employee(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Employee emp) {
		return this.empId - emp.empId;
	}
	
	
}
public class Program {

	public static void main(String[] args) {
		Employee emp1 = new Employee(11,"Satya");
		Employee emp2 = new Employee(22,"Raaj");
		Employee emp3 = new Employee(44,"Ram");
		
		List<Employee> list = new ArrayList<>();
		list.add(emp1);
		list.add(emp3);
		list.add(emp2);
		
	//	Collections.sort(list);
	//	list.sort(( obj1, obj2 ) -> obj1.getEmpId() - obj2.getEmpId());
		
		list.forEach( element -> System.out.println(element));
		
	}
}
