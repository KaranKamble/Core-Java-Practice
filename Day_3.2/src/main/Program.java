package main;

class Employee{
	private static Employee employee;
	
	private Employee() {
		System.out.println("Ctor");
	}
	
	public static Employee getEmployee() {
		if( employee == null )
			employee = new Employee();
		return employee;
	}
}

public class Program {
	public static void main(String[] args) {
		Employee emp1 = Employee.getEmployee();
		Employee emp2 = Employee.getEmployee();
	}

}
