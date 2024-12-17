package main;

import java.util.Scanner;

public class Program {

	static Scanner sc = new Scanner(System.in);
	
	public static void acceptRecord(Date date) {
		System.out.println("Enter Day   : ");
		date.setDay(sc.nextInt());
		System.out.println("Enter Month : ");
		date.setMonth(sc.nextInt());
		System.out.println("Enter Year  : ");
		date.setYear(sc.nextInt());
	}
	public static void printRecord(Date date) {
		System.out.println("Date : "+date.getDay()+"/"+date.getMonth()+"/"+date.getYear());	
	}
	
	
	public static void acceptRecord(Address address) {
		System.out.println("Enter PinCode : " );
		address.setPinCode(sc.nextInt());
		
		System.out.println("Enter City    : " );
		sc.nextLine();
		address.setCity(sc.nextLine());
		
		System.out.println("Enter State   : " );
		address.setState(sc.nextLine());	
	}
	public static void printRecord(Address address) {
		System.out.println(" PinCode : " +address.getPinCode());		
		System.out.println(" City    : " +address.getCity());
		System.out.println(" State   : " +address.getState());
		
	}

	
	
	public static void acceptRecord(Person person) {
		System.out.println("Name    : ");
		person.setName(sc.nextLine());
		
		person.setBirthDate(new Date());
		Date date = person.getBirthDate();
		Program.acceptRecord(date);
		
		person.setAddress(new Address());
		Address address = person.getAddress();
		Program.acceptRecord(address);
		
		
	}
	public static void printRecord(Person person) {
		System.out.println("Name  : "+person.getName());
		
		Date date = person.getBirthDate();
		Program.printRecord(date);
		
		Address address = person.getAddress();
		Program.printRecord(address);
	}
	
	
	
	public static void main(String[] args) {
		Date date = new Date();
	//	Program.acceptRecord(date);
	//	Program.printRecord(date);
		
		Address address = new Address();
	//	Program.acceptRecord(address);
	//	Program.printRecord(address);
		
		Person person = new Person();
		Program.acceptRecord(person);
		Program.printRecord(person);
	}
	

	


	

}
