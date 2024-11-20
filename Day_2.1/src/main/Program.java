package main;

import java.util.Scanner;

public class Program {

	
	public static void main(String[] args) {
		
		class Date{
			int day;
			int month;
			int year;
		}
		
		Date date = new Date();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Day   : ");
		date.day = sc.nextInt();
		System.out.println("Enter Month : ");
		date.month = sc.nextInt();
		System.out.println("Enter Year  : ");
		date.year = sc.nextInt();
		System.out.println();
		
		System.out.println(" Day   : "+date.day);		
		System.out.println(" Month : "+date.month);
		System.out.println(" Year  : "+date.year);
	}
}
