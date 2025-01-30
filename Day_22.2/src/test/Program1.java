package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Program1 {

	public static void main(String[] args) {
		Employee emp1 = new Employee(32, "Raj", "Pune");
		Employee emp2 = new Employee(32, "Ram", "Pune");
		Employee emp3 = new Employee(34, "Pihu", "Pune");
		
		List<Employee> list = new ArrayList<>();
		list.add(emp2);
		list.add(emp1);
		list.add(emp3);
		
	//	list.stream().distinct().forEach(emp -> System.out.println(emp));
		
	/*	boolean list2 = list.stream()
			.anyMatch(emp -> emp.getCity().equals("Pune"));
	*/
		
			
	}
	
	public static void main1(String[] args) {

		Employee emp1 = new Employee(32, "Raj", "Pune");
		Employee emp2 = new Employee(33, "Ram", "Nagpur");
		Employee emp3 = new Employee(34, "Pihu", "Pune");
		
		List<Employee> list = new ArrayList<>();
		list.add(emp2);
		list.add(emp1);
		list.add(emp3);
		
		System.out.println(list.stream().count());

	/*	list.stream()
			.filter(emp -> emp.getCity().equals("Pune"))
			.map( emp -> new Employee(emp.getImpId() + 1 , emp.getName(), emp.getCity()))
			.forEach(emp -> System.out.println(emp));
	*/
		
	/*	List<Employee> list2 = list.stream()
			.filter(emp -> emp.getCity() == "Pune")
			.map(emp -> new Employee(emp.getImpId()+ 2, emp.getName(), emp.getCity()))
			.collect(Collectors.toList());
			
		list2.forEach(System.out :: println );
	*/
			
	}
}
