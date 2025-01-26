package test;

public class Program {

	public static void main(String[] args) {
		// Program to print duplicate element from given string

		String str = "Programming";
		String duplicate = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (duplicate.indexOf(ch) == -1) {
				for (int j = 0; j < str.length(); j++) {
					if (i != j && ch == str.charAt(j)) {
						duplicate = duplicate + ch+" ";
						break;
					}
				}
			}
		}

		System.out.println(duplicate);
	}
}
