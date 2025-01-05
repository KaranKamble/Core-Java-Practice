package test;

class Outer {
	private int num1;
	private static int num2;

	public Outer() {
		this.num1 = 10;
		Outer.num2 = 20;
	}

	public class Inner {
		private int num3;
		private static int num4;

		public Inner() {
			this.num3 = 30;
			Inner.num4 = 40;
		}

		//OR
		Outer out = new Outer();

		public void print() {
			System.out.println("Num1  : " + num1);
			System.out.println("Num1  : " + Outer.num2);
			System.out.println("Num1  : " + this.num3);
			System.out.println("Num1  : " + Inner.num4);
		}
	}

}

public class Program {
	public static void main(String[] args) {
		Outer out = new Outer();
		Outer.Inner in = out.new Inner();
		in.print();

		System.out.println("//OR");

		Outer.Inner inner = new Outer().new Inner();
		inner.print();
	}

}
