package main;

class Employee{
	private static Employee employee;
	
	private Employee() {
		System.out.println("Ctor");
	} 
	
	static {
		employee = new Employee();
	}
	
	public static Employee getEmployee() {
		return employee;
	}
}

public class Program {
	public static void main(String[] args) {
		Employee emp1 = Employee.getEmployee();
		Employee emp2 = Employee.getEmployee();
	}

}
