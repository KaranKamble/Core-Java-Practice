package main;

import java.util.Scanner;

public class Program {

	
	public static void main(String[] args) {
		
		
		ComplexTest test = new ComplexTest();
		int choice = 0;
		while ((choice = test.menuList()) != 0) {
			switch (choice) {
			case 1:
				test.accept();
				break;
			case 2:
				test.print();
				break;

			}
		}
	}

}
