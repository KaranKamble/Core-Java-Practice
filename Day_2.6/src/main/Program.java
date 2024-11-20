package main;



public class Program {
	
	public static void main(String[] args) {
		 int a = 10;
		 int b = 20;
		 
		 System.out.println("Before swap :  ");
		 System.out.println("A  : "+a);
		 System.out.println("B  : "+b);
		 System.out.println();
		 
		 a = a + b;
		 b = a - b;
		 a = a - b;
		 
		 System.out.println("After swap :  ");
		 System.out.println("A  : "+a);
		 System.out.println("B  : "+b);
		
	}
}
