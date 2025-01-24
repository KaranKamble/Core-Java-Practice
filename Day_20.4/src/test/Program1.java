package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {

		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			System.out.println("Enter num1 : ");
			int num1 = sc.nextInt();
			System.out.println("Enter num2 : ");
			int num2 = sc.nextInt();
			if (num2 == 0) {
				ArithmeticException ex = new ArithmeticException("Please check your 0-0");
				throw ex;
			}
			int result = num1 / num2;
			System.out.println("Addition   : " + result);

		} catch (ArithmeticException | InputMismatchException ex) {
			ex.printStackTrace();
			System.out.println("Inside catch");
			// System.exit(0);
		} finally {
			sc.close();
			System.out.println("Inside finally");
		}

	}
}
