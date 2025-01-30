package test;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Program {
	
	public static void main(String[] args) {
		//Supplier
		Supplier<Employee> supplier = () -> {
			return new Employee(34, "Pihu", "Pune");
		};
		
		
		System.out.println(supplier.get());
	}
	
	public static void main3(String[] args) {
		//Function
		Function<Employee, Employee> function = emp -> {
		//	emp.setCity("Mumbai");
			emp.setImpId(emp.getImpId()+2);
			return emp;
		};
		
		
		Employee emp = new Employee(33, "Ram", "Nagpur");
		function.apply(emp);
		System.out.println(emp);
	}
	
	public static void main2(String[] args) {
		// Consumer
		Consumer<Employee> action = emp -> {
			System.out.println(emp);
		};
		
		Employee emp = new Employee(32, "Raj", "Pune");
		action.accept(emp);
		
	}

	public static void main1(String[] args) {
		// Predicate
		Predicate<Employee> p =  emp -> emp.getCity() == "Pune";
		
		Employee emp1 = new Employee(32, "Raj", "Pune");
		Employee emp2 = new Employee(33, "Ram", "Nagpur");
		Employee emp3 = new Employee(34, "Pihu", "Pune");
		
		System.out.println(p.test(emp1));
		System.out.println(p.test(emp2));
		
		
		
		
			
		
	}
}
