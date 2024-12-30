package test;

import java.util.Date;

public class Program {

	public static void print1(Object object) {
		System.out.println(object);
	}
	
	public static <T> void print2(T object) {
		System.out.println(object);
	}
	
	public static <T extends Number> void print3(T object) {
		System.out.println(object);
	}
	
	public static void main(String[] args) {
		Program.print2(10);
		Program.print2(10.0f);
		Program.print2("Raj");
		Program.print2(new Date());
		
		Program.print3(10);
		Program.print3(10.0f);
//		Program.print3('a');		NOT OK
//		Program.print3("Raj");		NOT OK
//		Program.print3(new Date());	NOT OK

	}

}
