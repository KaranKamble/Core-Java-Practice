package test;

@FunctionalInterface
interface Printable {

	void print(String msg);
}

public class Program {

	public static void main(String[] args) {
		Printable p = message -> System.out.println(message);
	}

	public static void main2(String[] args) {
		Printable p = (message) -> {
			System.out.printf(message);
		};
		p.print("Hey World");
	}

	public static void main1(String[] args) {
		Printable p = (String msg) -> {
			System.out.println(msg);
		};

		p.print("Hey World");
	}
}
