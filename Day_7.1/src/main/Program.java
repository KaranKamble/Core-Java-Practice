package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {

		Scanner sc = null;
		System.out.println("Opened");
		try {
			sc = new Scanner(System.in);

			System.out.println("Enter Num1 : ");
			int num1 = sc.nextInt();
			System.out.println("Enter Num2 : ");
			int num2 = sc.nextInt();
			if (num2 == 0) {
				// ArithmeticException ex = new ArithmeticException("Please check your eyes");
				// throw ex;

				throw new ArithmeticException("Please check your eyes");
			}
			int sum = num1 / num2;
			System.out.println("Division  : " + sum);
			
		} catch (ArithmeticException | InputMismatchException ex) {
			ex.printStackTrace();
		//	System.exit(0);   			In this case finally block will not get execute
		} finally {
			System.out.println("Inside Finally");
			sc.close();
		}
		System.out.println("Closed");
	}
	
	public static void main5(String[] args) {

		
		System.out.println("Opened");
		try( Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Num1 : ");
			int num1 = sc.nextInt();
			System.out.println("Enter Num2 : ");
			int num2 = sc.nextInt();
			if (num2 == 0) {
				// ArithmeticException ex = new ArithmeticException("Please check your eyes");
				// throw ex;

				throw new ArithmeticException("Please check your eyes");
			}
			int sum = num1 / num2;
			System.out.println("Division  : " + sum);
			
		} catch (ArithmeticException | InputMismatchException ex) {
			ex.printStackTrace();
		} 
		System.out.println("Closed");
	}
	
	public static void main4(String[] args) {

		Scanner sc = null;
		System.out.println("Opened");
		try {
			sc = new Scanner(System.in);

			System.out.println("Enter Num1 : ");
			int num1 = sc.nextInt();
			System.out.println("Enter Num2 : ");
			int num2 = sc.nextInt();
			if (num2 == 0) {
				// ArithmeticException ex = new ArithmeticException("Please check your eyes");
				// throw ex;

				throw new ArithmeticException("Please check your eyes");
			}
			int sum = num1 / num2;
			System.out.println("Division  : " + sum);
			
		} catch (ArithmeticException | InputMismatchException ex) {
			ex.printStackTrace();
		} finally {
			sc.close();
		}
		System.out.println("Closed");
	}

	public static void main3(String[] args) {

		Scanner sc = null;
		System.out.println("Opened");
		try {
			sc = new Scanner(System.in);

			System.out.println("Enter Num1 : ");
			int num1 = sc.nextInt();
			System.out.println("Enter Num2 : ");
			int num2 = sc.nextInt();
			if (num2 == 0) {
				// ArithmeticException ex = new ArithmeticException("Please check your eyes");
				// throw ex;

				throw new ArithmeticException("Please check your eyes");
			}
			int sum = num1 / num2;
			System.out.println("Sum  : " + sum);
			System.out.println("Closed");
		} catch (ArithmeticException | InputMismatchException ex) {
			ex.printStackTrace();
		}
		System.out.println("Closed");

	}

	public static void main2(String[] args) {

		Scanner sc = null;
		System.out.println("Opened");
		try {
			sc = new Scanner(System.in);

			System.out.println("Enter Num1 : ");
			int num1 = sc.nextInt();
			System.out.println("Enter Num2 : ");
			int num2 = sc.nextInt();
			int sum = num1 / num2;
			System.out.println("Sum  : " + sum);
			System.out.println("Closed");
		} catch (ArithmeticException | InputMismatchException ex) {
			ex.printStackTrace();
		}
		System.out.println("Closed");

	}

	public static void main1(String[] args) {

		Scanner sc = null;
		System.out.println("Opened");
		try {
			sc = new Scanner(System.in);

			System.out.println("Enter Num1 : ");
			int num1 = sc.nextInt();
			System.out.println("Enter Num2 : ");
			int num2 = sc.nextInt();
			int sum = num1 / num2;
			System.out.println("Sum  : " + sum);
			System.out.println("Closed");
		} catch (ArithmeticException ex) {
			ex.printStackTrace();
		} catch (InputMismatchException ex) {
			ex.printStackTrace();
		}
		System.out.println("Closed");

	}

}
