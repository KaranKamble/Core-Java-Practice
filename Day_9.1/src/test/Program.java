package test;

import java.io.File;
import java.io.IOException;

public class Program {
	
	
	public static void main4(String[] args) {
		File file = new File("Folder");
		file.delete();
	}
	
	public static void main3(String[] args) {
		File file = new File("Folder");
		file.mkdir();
	}

	public static void main2(String[] args) {
		File file = new File("Notes.text");
		file.delete();
	}
	
	public static void main1(String[] args) {
		File file = new File("Notes.text");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
