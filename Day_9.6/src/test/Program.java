package test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Program {

	static Scanner sc = new Scanner(System.in);

	private static void writeRecord(String path) throws Exception{

		try(DataOutputStream outputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File(path))));){
			
			String name = "Yarah";
			int id = 32;
			int id1 = 30;
			outputStream.writeUTF(name);
			outputStream.writeInt(id);
			outputStream.writeInt(id1);
		}
	}

	private static void readRecord(String path)throws Exception {
		try( DataInputStream inputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(new File(path))));){
			
			System.out.println(inputStream.readUTF());
			System.out.println(inputStream.readInt());
			System.out.println(inputStream.readInt());
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
