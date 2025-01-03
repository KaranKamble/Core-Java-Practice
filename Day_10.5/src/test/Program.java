package test;

import java.util.*;

public class Program {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(11,22,33);
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.set(2, 300);
		list.add(1, 40);
		list.addAll(list1);
	//	list.addAll(0,list1);
		list.sort(null);
		Collections.sort(list);
		
		for( int element : list )
			System.out.print(element+" ");
	}
}
