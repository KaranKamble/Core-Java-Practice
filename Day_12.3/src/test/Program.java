package test;

class Outer {
	private int num1 = 10;

	public class Inner {
		private int num1 = 20;

		// OR
		Outer out = new Outer();

		public void print() {
			int num1 = 30;
			System.out.println("Num1  : " + Outer.this.num1);
			System.out.println("Num1  : " + this.num1);
			System.out.println("Num1  : " + num1);

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
