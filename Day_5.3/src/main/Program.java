package main;

import java.util.Arrays;
import java.util.Scanner;

public class Program {

	static Scanner sc = new Scanner(System.in);

	public static void accept(int[] arr) {
		if (arr != null) {
			for (int index = 0; index < arr.length; index++) {
				System.out.println("Enter Element : ");
				arr[index] = sc.nextInt();
			}
		}
	}

	public static void print(int[] arr) {
		if( arr != null ) {
			for( int index = 0; index < arr.length; index++ ) {
				System.out.print(arr[index]+"  ");
			}
			Arrays.sort(arr);
			System.out.println();
			System.out.println(Arrays.toString(arr));
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[4];
		Program.accept(arr);
		Program.print(arr);
	}

}
