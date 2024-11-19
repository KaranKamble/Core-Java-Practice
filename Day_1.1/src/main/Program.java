package main;

public class Program {

	public static void main(String[] args) {
		
		String name = args[ 0 ];
		int empId = Integer.parseInt( args[ 1 ] );
		float salary = Float.parseFloat( args[ 1 ] );
		
		System.out.println("Name : "+name);
		System.out.println("EmpId : "+empId);
		System.out.println("Salary : "+salary);
	}

}
