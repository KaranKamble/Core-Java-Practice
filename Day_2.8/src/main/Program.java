package main;


public class Program {
	private static int num1;
	
	public void print() {
		num1++;
		System.out.println(num1);	
	}
	
	public static void main(String[] args) {
		Program program = new Program();
		program.print();
		program.print();
		program.print();
		

	}

}
