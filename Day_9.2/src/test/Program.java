package test;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	private static void getDirectoryInfo(File file) {
		File[] files = file.listFiles();
		for( File element : files )
			System.out.println(element.getName());
	}

	private static void getFileInfo(File file) {
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getParent());
		System.out.println(file.lastModified());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("F.Q. Name : ");
		String pathName = sc.nextLine();

		File file = new File(pathName);
		if (file.exists()) {
			if (file.isDirectory())
				Program.getDirectoryInfo(file);
			else
				Program.getFileInfo(file);
		}else {
			System.out.println("Please enter valid path");
		}
	}

}
