package test;

import java.util.Scanner;

public class Program {

	static Scanner sc = new Scanner(System.in);

	public static void accept(int[][] arr3) {
		if (arr3 != null) {
			for (int r = 0; r < arr3.length; r++) {
				for (int c = 0; c < arr3.length; c++) {
					System.out.println("Enter element : ");
					arr3[r][c] = sc.nextInt();
				}
			}
		}
	}

	private static void print(int[][] arr3) {
		if (arr3 != null) {
			for (int r = 0; r < arr3.length; r++) {
				for (int c = 0; c < arr3.length; c++) {
					System.out.print(arr3[ r ][ c ]+" ");
				}
				System.out.println();
			}
		}

	}

	public static void main(String[] args) {
		int[] arr[] = null;
		int[][] arr1 = null;
		int arr2[][] = null;

		int[][] arr3 = new int[3][4];
		Program.accept(arr3);
		Program.print(arr3);
	}

}
