package test;

public class Program {
	private static int num;

	public static void print() {
		num++;
		System.out.println(Program.num);
	}

	public static void main1(String[] args) {
		Program.print();
		Program.print();
		Program.print();
	}

	public static void main(String[] args) {

		if (System.out.printf("Hello World") != null) {}
		
	}
}
