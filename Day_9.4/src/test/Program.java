package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Program {

	static Scanner sc = new Scanner(System.in);

	private static void writeRecord(String path) {
		try (FileOutputStream outputstream = new FileOutputStream(new File(path));) {

			for (char ch = 'A'; ch <= 'Z'; ch++)
				outputstream.write(ch);

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	private static void readRecord(String path) {
		try( FileInputStream inputStream = new FileInputStream(new File(path));){
			
			int data = 0;
			while( ( data = inputStream.read() ) != -1) 
				System.out.print((char)data);
			
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
	private static int menuList() {
		System.out.println();
		System.out.println("0.Exit");
		System.out.println("1.Write");
		System.out.println("2.Read");
		System.out.println("Enter Your Choice :  ");
		return sc.nextInt();
	}

	public static void main(String[] args) {

		int choice = 0;

		while ((choice = Program.menuList()) != 0) {

			switch (choice) {
			case 1:
				Program.writeRecord("file.dat");
				break;
			case 2:
				Program.readRecord("file.dat");
				break;
			}
		}
	}

	

}
