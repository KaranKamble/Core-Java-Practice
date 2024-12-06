package main;

import java.util.Scanner;

public class ComplexTest {

	private Complex complex;

	public ComplexTest() {
		this.complex = new Complex();
	}

	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("Enter Num1 : ");
		this.complex.setNum1(sc.nextInt());
		System.out.println("Enter Num2 : ");
		this.complex.setNum2(sc.nextInt());
	}
	
	public void print() {
		System.out.println("Num1  :  "+this.complex.getNum1());
		System.out.println("Num2  :  "+this.complex.getNum2());
	}
	
	public int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.For Enter 2 numbers");
		System.out.println("2. For Print 2 numbers");
		System.out.println("Enter Your choice : ");
		return sc.nextInt();
	}
	
}
