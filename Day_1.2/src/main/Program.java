package main;

import java.util.Scanner;

class Employee {
	private String name;
	private int empId;
	private float salary;

	Scanner sc = new Scanner(System.in);

	public void accept( /* Employee this */ ) {
		System.out.println("Enter Name : ");
		this.name = sc.nextLine();
		System.out.println("Enter empId : ");
		this.empId = sc.nextInt();
		System.out.println("Enter Salary : ");
		this.salary = sc.nextFloat();
	}

	public void print( /* Employee this */ ) {
		System.out.println(" Name : " + this.name);
		System.out.println(" empId : " + this.empId);
		System.out.println(" Salary : " + this.salary);
	}
}

public class Program {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.accept(); // emp.accept(emp);
		emp.print();  // emp.print(emp);
	}

}
