package test;

interface A {

	void print();
}

public class Program6 {
	public static void main(String[] args) {
		A a = new A() {

			@Override
			public void print() {
				System.out.println("Hello");
			}

		};
		a.print();

	}
}
