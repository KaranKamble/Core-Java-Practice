package test;

class Outer {
	private int num1 = 10;

	public class Inner {
		private int num1 = 20;

	}

	//Outer.Inner in = new Outer.Inner();
	
	Inner in = new Inner();

	public void print() {
		int num1 = 30;
		System.out.println("Num1  : " + this.num1);
		System.out.println("Num1  : " + in.num1);
		System.out.println("Num1  : " + num1);
	}
}

public class Program {
	public static void main(String[] args) {
		Outer out = new Outer();
		out.print();
	}

}
