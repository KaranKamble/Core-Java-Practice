package test;

import java.util.Arrays;
import java.util.Scanner;

public class Program {

	private static void printRecord(int[] arr) {
		if (arr != null) {
			for (int index = 0; index < arr.length; index++) {
				System.out.print(arr[index] + " ");
			}
			System.out.println();
		}
	}

	private static void showRecord(int[] arr) {
		if( arr != null ) {
			for( int element : arr)
				System.out.print(element+" ");
		}

	}

	public static void main(String[] args) {
		int[] arr = new int[] { 4, 6, 8, 2, 4, 9 }; // OK
		int[] arr1 = { 7, 9, 3, 5, 2, 1 }; // OK

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		Program.printRecord(arr); // Using For
		Program.showRecord(arr);
	}

	public static void main3(String[] args) {
		int[] arr = new int[10];
		String str = Arrays.toString(arr);
		System.out.println(str);
		System.out.println(Arrays.toString(arr));
	}

	static Scanner sc = new Scanner(System.in);

	private static void acceptRecord(int[] arr) {
		if (arr != null) {
			for (int index = 0; index < arr.length; index++) {
				System.out.println("Enter element : ");
				arr[index] = sc.nextInt();
			}
		}
	}

	private static void printRecordUsingFor(int[] arr) {
		if (arr != null) {
			for (int index = 0; index < arr.length; index++) {
				System.out.print(arr[index] + " ");
			}
			System.out.println();
		}

	}

	private static void printRecordUsingForEach(int[] arr) {
		if (arr != null) {
			for (int element : arr)
				System.out.print(element + " ");
		}
	}

	public static void main2(String[] args) {
		int[] arr = new int[4];
		Program.acceptRecord(arr);
		Program.printRecordUsingFor(arr);
		Program.printRecordUsingForEach(arr);

	}

	public static void main1(String[] args) {
		int[] arr1 = null;
		int arr2[] = null;

		int[] arr3 = new int[5];
		int[] arr4 = new int[] { 1, 2, 3, 7, 5, 8 };
		int[] arr5 = { 6, 8, 3, 8, 2 };

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();

		int[] arr6 = new int[size];

		System.out.println(arr6.length);

		System.out.println(Arrays.toString(arr6));

	}

}
