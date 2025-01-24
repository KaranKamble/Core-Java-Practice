package test;

public class Program4 {
	
	// Write a program to count the number of occurrences of each character in a string
	
	public static void main(String[] args) {
		
		String str = "apple";
		
		for( int i = 0; i < str.length(); i++ ) {
			char ch = str.charAt(i);
			int count = 1;
			
			for( int j = 0; j < str.length(); j++ ) {
				if( i != j && ch == str.charAt(j)) {
					count ++;
				}
			}
			
			if( str.indexOf(ch) == i ) {
				System.out.println(ch+"- "+count);
			}
		}
	}
}
