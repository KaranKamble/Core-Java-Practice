package test;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) throws ClassNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter F.Q.class name : ");
		String className = sc.nextLine();
		Class<?> clazz = Class.forName(className);
	}
	
	public static void main2(String[] args) {
		Class<?> clazz = Number.class;
	}

	public static void main1(String[] args) {
		ArrayList arr = new ArrayList();
		Class<?> clazz = arr.getClass();
		
	}
}
