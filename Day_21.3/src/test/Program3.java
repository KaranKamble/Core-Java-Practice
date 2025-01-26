package test;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class Program3 {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		Consumer<Integer> action = element -> System.out.println(element);
		list.forEach(action);
		
	//	list.forEach( number -> System.out.println(number));
	}
	
	public static void main2(String[] args) {
		List<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		for( int element : list ) {
			System.out.println(element);
		}
	}
	
	public static void main1(String[] args) {
		List<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		for( int i = 0; i < list.size(); i++ ) {
			int element = list.get(i);
			System.out.println(element);
		}
	}
}
