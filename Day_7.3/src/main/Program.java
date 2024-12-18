package main;

abstract class A {

	public abstract void print();
}

class B extends A {

	@Override
	public void print() throws RuntimeException {
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
			try {
				Thread.sleep(250);
			} catch (InterruptedException ex) {
				throw new RuntimeException();
			}
		}
	}
	

}

public class Program {

	public static void main(String[] args) {
		A a = new B();
		a.print();
	}

}
