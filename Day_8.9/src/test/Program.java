package test;

import java.util.ArrayList;

public class Program {

	public static ArrayList<Integer> getInteger() {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		return list;
	}
	
	public static ArrayList<Double> getDouble() {
		ArrayList<Double> list = new ArrayList<>();
		list.add(10.0d);
		list.add(20.0d);
		list.add(30.0d);
		return list;
	}
	
	public static ArrayList<String> getString() {
		ArrayList<String> list = new ArrayList<>();
		list.add("Raj");
		list.add("Raghav");
		list.add("Ram");
		return list;
	}
	
	public static void printList(ArrayList<?> list ) {
		for( Object object : list )
			System.out.println(object);
	}
	public static void main(String[] args) {
		ArrayList<Double> list= Program.getDouble();
		Program.printList(list);
		
		ArrayList<Integer> list1= Program.getInteger();
		Program.printList(list1);
		
		ArrayList<String> list2= Program.getString();
		Program.printList(list2);
		

	}

}
