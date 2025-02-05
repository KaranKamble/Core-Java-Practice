package test;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Employee {
	String name;
	String gender;
	String department;
	double salary;

	// Constructor
	public Employee(String name, String gender, String department, double salary) {
		this.name = name;
		this.gender = gender;
		this.department = department;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee{name='" + name + "', gender='" + gender + "', department='" + department + "', salary="
				+ salary + "}";
	}
}

public class Program {

	public static void main(String[] args) {
		Function<Employee, Employee> function = ( emp ) -> new Employee("Yarah", emp.getGender(), emp.getDepartment(), emp.getSalary());
		
		Employee emp = new Employee("Sara", "Female", "IT", 80000);
		
		System.out.println(function.apply(emp));
	}

	public static void main3(String[] args) {

		Supplier<Employee> supplier = () -> new Employee("Yarah", "Male", "HR", 50000);

		System.out.println(supplier.get());
	}

	public static void main2(String[] args) {
		Consumer<Employee> consumer = emp -> System.out.println(emp);

		Employee emp = new Employee("Yarah", "Male", "HR", 50000);
		consumer.accept(emp);
	}

	public static void main1(String[] args) {

		Predicate<Employee> predicate = emp -> emp.getName().equalsIgnoreCase("Yarah");

		Employee emp = new Employee("yaraH", "Male", "HR", 50000);

		System.out.println(predicate.test(emp));

	}

}
