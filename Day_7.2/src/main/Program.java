package main;

public class Program {

	public static void show() {
		for( int i = 1; i < 11; i++ ) {
			System.out.println(i);
			try {
			Thread.sleep(500);
			}catch(InterruptedException ex ) {
				ex.printStackTrace();
			}
		}
	}
	
	public static void display()throws InterruptedException  {
		for( int i = 1; i < 11; i++ ) {
			System.out.println(i);
			Thread.sleep(500);
		}
	}
	public static void main(String[] args) {
	//	Program.show();
		
		try {
		Program.display();
		}catch(InterruptedException ex) {
			ex.printStackTrace();
		}

	}

}
