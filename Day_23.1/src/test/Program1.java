package test;

import java.util.Arrays;
import java.util.List;

public class Program1 {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("apple", "banana", "cherry", "date", "apple", "apple");

		list.stream()
			//.sorted()
			.distinct()
			.forEach(fruit -> System.out.println(fruit));
	}

	public static void main1(String[] args) {

		List<String> list = Arrays.asList("apple", "banana", "acherry", "date");

		list.stream().filter(fruit -> fruit.charAt(0) == 'a').forEach(fruit -> System.out.println(fruit));

	}

}
