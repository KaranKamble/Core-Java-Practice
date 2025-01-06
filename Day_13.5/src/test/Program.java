package test;

public class Program {
	
	public static void main8(String[] args) {
		String s1 = "c" + "dac";
		String s2 = "cdac";

		if (s1.equals(s2))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}

	public static void main7(String[] args) {
		String s1 = "c" + "dac";
		String s2 = "cdac";

		if (s1 == s2)
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}

	public static void main6(String[] args) {
		String s1 = new String("cdac");
		String s2 = "cdac";

		if (s1.equals(s2))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}

	public static void main5(String[] args) {
		String s1 = new String("cdac");
		String s2 = "cdac";

		if (s1 == s2)
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}

	public static void main4(String[] args) {
		String s1 = "cdac";
		String s2 = "cdac";

		if (s1.equals(s2))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}

	public static void main3(String[] args) {
		String s1 = "cdac";
		String s2 = "cdac";

		if (s1 == s2)
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}

	public static void main2(String[] args) {
		String str1 = new String("Cdac");
		String str2 = new String("Cdac");

		if (str1.equals(str2))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}

	public static void main(String[] args) {
		String str1 = new String("Cdac");
		String str2 = new String("Cdac");

		if (str1 == str2)
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}

}
