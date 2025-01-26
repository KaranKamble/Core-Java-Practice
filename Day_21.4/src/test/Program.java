package test;

@FunctionalInterface
interface Printable {

	int add(int a, int b);
}

public class Program {

	public int addition(int num1, int num2) {
		return num1 + num2;
	}

	public static int summation(int num1, int num2) {
		return num1 + num2;
	}
	
	
	public static void main4(String[] args) {
		Printable p = Integer :: sum;
		System.out.println(p.add(5,5));
	}
	
	public static void main3(String[] args) {
		Printable p = Program :: summation;
		System.out.println(p.add(20, 20));
	}

	public static void main2(String[] args) {
		Program p1 = new Program();
		Printable p = p1::addition;
		System.out.println(p.add(2, 20));

	}

	public static void main1(String[] args) {
		Printable p = (num1, num2) -> num1 + num2;
		System.out.println(p.add(10, 10));
	}
}
