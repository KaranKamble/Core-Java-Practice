package main;

public class Program {

	public static void f3(String str) {
		System.out.println("Inside f3()");
		int num = Integer.parseInt(str);
		System.out.println(num);
	}

	public static void f2(String str) {
		System.out.println("Inside f2()");
		Program.f3(str);
	}

	public static void f1(String str) {
		System.out.println("Inside f1()");
		Program.f2(str);
	}

	public static void main(String[] args) {
		try {
		String str = "b2";
		Program.f1(str);
		}catch(NumberFormatException ex) {
			ex.printStackTrace();
		}

	}

}
