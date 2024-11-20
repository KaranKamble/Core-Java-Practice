package main;



public class Program {
	
	public static void main(String[] args) {
		 int a = 10;
		 int b = 20;
		 
		 System.out.println("Before swap :  ");
		 System.out.println("A  : "+a);
		 System.out.println("B  : "+b);
		 System.out.println();
		 
		 int temp = a;
		 a = b;
		 b = temp;
		 
		 System.out.println("After swap :  ");
		 System.out.println("A  : "+a);
		 System.out.println("B  : "+b);
		
	}
}
