package main;

import java.util.Scanner;

public class Program {
	private int num1;
	private int num2;
	private static int num3;

	static {
		num3 = 5;
	}
	
	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("Num1 : ");
		this.num1 = sc.nextInt();
		System.out.println("Num2 : ");
		this.num2 = sc.nextInt();
		System.out.println("Num3 : ");
	//	Program.num3 = sc.nextInt();
	}

	public void print() {
		System.out.println("Num1 : "+this.num1);
		System.out.println("Num2 : "+this.num2);
		System.out.println("Num3 : "+Program.num3);
	}

	public static void main(String[] args) {
		Program program = new Program();
		program.accept();
		program.print();

	}

}
