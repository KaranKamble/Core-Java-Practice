package test;

import java.util.*;

public class Program {

	public static void main4(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

		// ListIterator loop
		ListIterator<Integer> itr = list.listIterator();

		while (itr.hasNext()) {
			int element = itr.next();
			System.out.print(element + " ");
		}

		System.out.println();

		while (itr.hasPrevious()) {
			int element = itr.previous();
			System.out.print(element + " ");
		}
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

		// iterator loop/ for each loop
		Iterator<Integer> itr = list.iterator();

		while (itr.hasNext()) {
			int element = itr.next();
			System.out.print(element + " ");
		}
	}

	public static void main2(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

		// for each loop
		for (int element : list) {
			System.out.print(element + " ");
		}

	}

	public static void main1(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

		// for loop
		for (int index = 0; index < list.size(); ++index)
			System.out.print(list.get(index) + " ");

	}
}
