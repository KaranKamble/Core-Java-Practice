package main;

import java.util.Scanner;

class Employee {
	private int img;
	private int real;

	public Employee() {
	//	this(100,200);
		this.img = 10;
		this.real = 20;
	}
	
	public Employee( int img, int real ) {
		this.img = img;
		this.real = real;
	}
	
	public void print() {
		System.out.println("Img   : " + this.img);
		System.out.println("Real  : " + this.real);
	}

}

public class Program {
	public static void main(String[] args) {
			Employee emp = new Employee(11,22); 
			emp.print();
	}
}
