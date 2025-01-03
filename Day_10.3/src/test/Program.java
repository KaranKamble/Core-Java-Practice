package test;

import java.util.ArrayList;

public class Program {

	public static void printList(ArrayList<Integer> list) {
		if (list != null) {
			if (!list.isEmpty()) {
				for (Integer element : list)
					System.out.println(element);
			}
		}
	}

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);

		Program.printList(list);
	}
}
