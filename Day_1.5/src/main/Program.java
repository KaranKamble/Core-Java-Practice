package main;

import java.util.Scanner;

class Employee {
	private String name;
	private int empId;
	private float salary;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public int getEmpId() {
		return this.empId;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public float getSalary() {
		return this.salary;
	}
}

public class Program {
	private Employee emp;

	public Program() {
		this.emp = new Employee();
	}
	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name   : ");
		this.emp.setName(sc.nextLine());
		System.out.println("Enter Id     : ");
		this.emp.setEmpId(sc.nextInt());
		System.out.println("Enter Salary : ");
		this.emp.setSalary(sc.nextFloat());
	}

	public void print() {
		System.out.println(this.emp.getName());
		System.out.println(this.emp.getEmpId());
		System.out.println(this.emp.getSalary());
	}

	public static void main(String[] args) {
			Program program = new Program();
			program.accept();
			program.print();
	}

}
