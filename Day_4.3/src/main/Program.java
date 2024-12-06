package main;

public class Program {

	//Constructor Overloading
	
	public Program() {
		System.out.println("Hey");
	}
	
	public Program( int a ) {
		System.out.println(a);
	}
	
	public Program( int a, String msg ) {
		System.out.println(a);
		System.out.println(msg);
	}
	
	
	public static void main(String[] args) {
	//	Program p = new Program();
	//	Program p = new Program(10);
		Program p = new Program(65000, "Hello");

	}

}
