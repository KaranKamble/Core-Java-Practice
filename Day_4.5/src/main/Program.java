package main;

public class Program {

	// Variable Argument Method or variable arity method
	
	public static void addition(int... arguments) {
		int result = 0;
		for( int element : arguments ) 
			result = result + element;
		
		System.out.println("Addition : "+result);
	}
	
	public static void main(String[] args) {
		Program.addition(10,20);
		Program.addition(10,20,3);
		
		
		//Hello World without " ; "
		if(System.out.printf("Hello World") != null ){}
			
		

	}

}
