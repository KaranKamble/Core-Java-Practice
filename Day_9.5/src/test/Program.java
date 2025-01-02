package test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Program {

	static Scanner sc = new Scanner(System.in);

	private static void writeRecord(String path) throws Exception{

		try( BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(new File(path)));){
			
			for( char ch = 'A'; ch <= 'Z'; ++ch )
			outputStream.write(ch);
			
		}
	}

	private static void readRecord(String path)throws Exception {
		
		try( BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(new File(path)));){
			
			int data = 0;
			while( ( data = inputStream.read() ) != -1 )
				System.out.print((char)data+" ");
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
				try {
					Program.writeRecord("file.dat");
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			case 2:
				try {
					Program.readRecord("file.dat");
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;
			}
		}
	}

}
