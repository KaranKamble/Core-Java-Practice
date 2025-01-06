package test;

interface Printable {
	void print();
}

class Test implements Printable {

	public void print() {
		System.out.println("Inside Test");
	}
}

public class Program {

	public static void main(String[] args) {
		Printable p = () -> {
			System.out.println("Lambda Expression");
		};

		p.print();
	}

	public static void main2(String[] args) {
		Printable p = new Printable() {

			@Override
			public void print() {
				System.out.println("Local class/ Method local inner class ");
			}
		};

		p.print();
	}

	public static void main1(String[] args) {
		Printable p = new Test();
		p.print();
	}
}
