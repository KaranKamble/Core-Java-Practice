package test;

public class Program {
	
	public static void main(String[] args) {
//		StringBuffer s1 = new StringBuffer("cdac");
//		StringBuffer s2 = new StringBuffer("cdac");
		
		StringBuilder s1 = new StringBuilder("cdac");
		StringBuilder s2 = new StringBuilder("cdac");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
	
	public static void main5(String[] args) {
		String s1 = new String("cdac");
		String s2 = new String("cdac");
		
		if (s1 == s2)
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}
	
	public static void main4(String[] args) {
		StringBuilder s1 = new StringBuilder("cdac");
		StringBuilder s2 = new StringBuilder("cdac");

		if (s1.equals(s2))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}

	
	public static void main3(String[] args) {
		StringBuilder s1 = new StringBuilder("cdac");
		StringBuilder s2 = new StringBuilder("cdac");

		if (s1 == s2)
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}

	public static void main2(String[] args) {
		StringBuffer s1 = new StringBuffer("cdac");
		StringBuffer s2 = new StringBuffer("cdac");

		if (s1.equals(s2))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}

	public static void main1(String[] args) {
		StringBuffer s1 = new StringBuffer("cdac");
		StringBuffer s2 = new StringBuffer("cdac");

		if (s1 == s2)
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}

}
