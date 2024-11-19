package main;

import java.util.Scanner;

class Employee{
	private String name;
	private int empId;
	private float salary;
	
	public void setName( String name ) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setEmpId( int empId ) {
		this.empId = empId;
	}
	
	public int getEmpId() {
		return this.empId;
	}
	
	public void setSalary( float salary ) {
		this.salary = salary;
	}
	
	public float getSalary() {
		return this.salary;
	}
}

public class Program {

	public static void main(String[] args) {
		Employee emp = new Employee();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name   : ");
		emp.setName(sc.nextLine());
		System.out.println("Enter Id     : ");
		emp.setEmpId(sc.nextInt());
		System.out.println("Enter Salary : ");
		emp.setSalary(sc.nextFloat());
		
		System.out.println(emp.getName());
		System.out.println(emp.getEmpId());
		System.out.println(emp.getSalary());
		
	}

}
