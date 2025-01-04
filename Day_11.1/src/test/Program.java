package test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main1(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();
		set.add(null);
	}
	
	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(10);
		
		Iterator<Integer> itr = set.iterator();
		
		while(itr.hasNext()) {
			int element = itr.next();
			System.out.print(element+" ");
		}
		
	}
}
