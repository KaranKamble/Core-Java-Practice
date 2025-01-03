package test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Program {
	
	public static void main(String[] args) {
		String str = "Raghav";
		System.out.println(str.charAt(str.length()));	//StringIndexOutOfBoundsException
	}
	
	public static void main2(String[] args) {
		List<Integer> list = Arrays.asList(11,22,33,44,55);
		System.out.println(list.get(list.size()));	//ArrayIndexOutOfBoundsException
	}

	public static void main1(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(2);
		list.add(3);
		
		System.out.println(list.size());
		System.out.println(list.get(list.size()));	//IndexOutOfBoundsException
	}
}
