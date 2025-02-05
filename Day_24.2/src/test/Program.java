package test;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;

public class Program {
	/*
	 * MenuDriven code to read and write Inside file 
	 */
	static final int WORDS_PER_LINE = 15;

	static Scanner sc = new Scanner(System.in);

	public static void write(String silent) {
		try ( FileOutputStream outputStream = new FileOutputStream(silent, true); 
				PrintStream out = new PrintStream(outputStream)){
				System.out.println("Please write something here , I will append it inside your file: ");
				String message = sc.nextLine();
				 String[] words = message.split(" ");
		            
		            for (int i = 0; i < words.length; i++) {
		                if (i > 0 && i % WORDS_PER_LINE == 0) {
		                    out.println(); 
		                }
		                out.print(words[i] + " ");
		            }
		            out.println();
		            System.out.println();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void read(String silent) {
		try(BufferedReader reader = new BufferedReader(new FileReader(silent))){
			String msg = null;
			while( ( msg = reader.readLine() ) != null ) {
				if( msg.length() < 50)
					System.out.println();
				System.out.print(msg);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static int menuList() {
		System.out.println();
		System.out.println("Press 0. Exit");
		System.out.println("Press 1. to Write Inside File");
		System.out.println("Press 2. to Read File content");
		System.out.println("File will get create during 1. operation. To check file has Created, Right click On Project and Refresh");
		System.out.println("Enter Your choice : ");
		int choice = sc.nextInt();
		sc.nextLine();
        return choice;
    }

	public static void main(String[] args) {

		String pathName = "silent.txt";
		int choice = 0;
		while (( choice = Program.menuList() ) != 0) {

			switch (choice) {
			case 1:
				Program.write(pathName);
				break;
			case 2:
				Program.read(pathName);
				break;
			}
		}

	}
}
