package test;

class Outer {
	private int num1 = 10;
	private static int num2 = 20;

	public static class Inner {
		private int num3 = 30;
		private static int num4 = 40;

	}

	Inner in = new Inner();

	public void print() {
		System.out.println("Num1  : " + this.num1);
		System.out.println("Num2  : " + Outer.num2);
		System.out.println("Num3  : " + in.num3);
		System.out.println("Num4  : " + Inner.num4);
	}
}

public class Program {
	public static void main(String[] args) {
		Outer out = new Outer();
		out.print();
	}

}
