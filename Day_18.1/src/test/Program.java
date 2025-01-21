package test;

class Singleton3 {
	private static Singleton3 s3;

	private Singleton3() {
		System.out.println("Singleton3.Singleton3()...");
	}

	public static Singleton3 getInstance() {
		if (s3 == null)
			s3 = new Singleton3();
		return s3;
	}

}

class Singleton2 {
	private static Singleton2 s2;

	static {
		s2 = new Singleton2();
	}

	private Singleton2() {
		System.out.println("Singleton2.Singleton2()...");
	}

	public static Singleton2 getInstance() {
		return s2;
	}

}

class Singleton1 {
	private static Singleton1 s3;

	static {
		s3 = new Singleton1();
	}

	public Singleton1() {
		System.out.println("Singleton1.Singleton1() called...");
	}

	public static Singleton1 getInstance() {
		return s3;
	}

}

public class Program {

	public static void main(String[] args) {
		Singleton3 s1 = Singleton3.getInstance();
		Singleton3 s2 = Singleton3.getInstance();
	}

	public static void main2(String[] args) {
		Singleton2 s1 = Singleton2.getInstance();
		Singleton2 s2 = Singleton2.getInstance();

	}

	public static void main1(String[] args) {
		Singleton1 s1 = Singleton1.getInstance();
		Singleton1 s2 = Singleton1.getInstance();

	}

}
