package main;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		class Date {
			int day;
			int month;
			int year;

			Scanner sc = new Scanner(System.in);
			
			public void accept() {
				System.out.println("Enter Day   : ");
				this.day = sc.nextInt();
				System.out.println("Enter Month : ");
				this.month = sc.nextInt();
				System.out.println("Enter Year  : ");
				this.year = sc.nextInt();
			}

			public void print() {
				System.out.println(" Day   : " + this.day);
				System.out.println(" Month : " + this.month);
				System.out.println(" Year  : " + this.year);
			}
		}

		Date date = new Date();
		date.accept();
		date.print();

	}
}
