package test;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>(); // OK
		list.add(11);
		list.add(22);

		list.clear();

		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);

		int element = list.get(2);
		System.out.println("element of index 2 : " + element);

		int size = list.size();
		System.out.println("Size " + size);

		list.remove(1);

		System.out.println(list);
	}

	public static void main1(String[] args) {

		ArrayList arrayList = new ArrayList(); // OK

		List list = new ArrayList(); // OK
		list.add(10);
		list.add(20);
		list.add("dac");
		list.add(2, 30);

		System.out.println(list);
	}

}
