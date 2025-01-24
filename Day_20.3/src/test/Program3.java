package test;

class Singleton2 {
	private static Singleton2 s2;

	private Singleton2() {
		System.out.println("Singleton2.Singleton2()");
	}

	public static Singleton2 getInstance() {
		if (s2 == null) {

			synchronized (Singleton2.class) {
				if (s2 == null)
					s2 = new Singleton2();
			}
		}
		return s2;
	}
}

class Singleton1 {
	private static Singleton1 s1;

	private Singleton1() {
		System.out.println("Singleton.Singleton()");
	}

	public static Singleton1 getInstance() {
		if (s1 == null)
			s1 = new Singleton1();
		return s1;
	}

}

public class Program3 {
	
	public static void main(String[] args) {
		Singleton2.getInstance();
		Singleton2.getInstance();
	}
	
	public static void main1(String[] args) {
		Singleton1.getInstance();
		Singleton1.getInstance();

	}
}
