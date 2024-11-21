package main;

class Employee{
	private static int num1;
	
	public Employee() {
		num1++;
		System.out.println("Instance No.: "+num1);
	}
	
	public static int getNum1() {
		return Employee.num1;
	}
}

public class Program {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		
		System.out.println("Total Instances are : "+Employee.getNum1());

	}

}
