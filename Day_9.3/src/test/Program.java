package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Program {

	static Scanner sc = new Scanner(System.in);

	public static void writeRecord(String pathName) {
		try (FileOutputStream outputStream = new FileOutputStream(new File(pathName));) {

			for (char ch = 'A'; ch <= 'Z'; ch++) {
				outputStream.write(ch);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private static void raedRecord(String pathName) {
		try (FileInputStream inputStream = new FileInputStream(new File(pathName));) {
			int data = 0;
			while( (data = inputStream.read()) != -1 )
				System.out.print((char)data+" ");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private static int menuList() {
		System.out.println();
		System.out.println("0.Exit");
		System.out.println("1.Write");
		System.out.println("2.Read");
		System.out.println("Enter Your choice : ");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		int count = 0;
		while ((count = Program.menuList()) != 0) {

			switch (count) {
			case 1:
				Program.writeRecord("file.dat");
				break;
			case 2:
				Program.raedRecord("file.dat");
				break;
			}
		}
	}

}
