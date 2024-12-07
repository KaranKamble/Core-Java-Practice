package main;

import java.util.Arrays;
import java.util.Scanner;

public class Program {

	public static void main1(String[] args) {
	//	int[] arr = new int[3];
	//	int arr[] = new int[] {1,2,3};
		int[] arr = {2,4,8,1,3,5,7,9,0};
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size Of array : ");
		int size = sc.nextInt();
		int[] arr = new int[5];
	//	System.out.println(Arrays.toString(arr));
		
	//	for( int index = 0 ; index < arr.length; index++ )
	//		System.out.print(arr[ index ]+"  ");
		
		
		for( int element : arr)
			System.out.print(element+"  ");
	}

}
