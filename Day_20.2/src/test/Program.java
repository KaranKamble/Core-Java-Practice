package test;

public class Program {

	public static int[] swap(int[] arr) {
		int temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;
		return arr;
	}

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int[] arr = { a, b };
		System.out.println("Before swap  : A = " + arr[0] + ", B = " + arr[1]);

		Program.swap(arr);
		System.out.println("After swap   : A = " + arr[0] + ", B = " + arr[1]);
	}

	public static void main2(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("Before swap  : A = " + a + ", B = " + b);

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swap   : A = " + a + ", B = " + b);
	}

	public static void main1(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("Before swap  : A = " + a + ", B = " + b);

		int temp = a;
		a = b;
		b = temp;
		System.out.println("After swap   : A = " + a + ", B = " + b);
	}

}
