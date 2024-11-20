package main;

class Employee{
	
	private Employee() {
		System.out.println("Ctor");
	}
	
	public static Employee getEmployee() {
		return new Employee();
	}
}
public class Program {
	
	public static void main(String[] args) {
		 Employee.getEmployee();
		 Employee.getEmployee();
		 Employee.getEmployee();
	}

}
