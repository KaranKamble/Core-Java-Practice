package test;

public class Program3 {
	public static void main(String[] args) {
		// Remove duplicate element
		
		String str = "banaasn";
		String modified = "";
		
		for( int i = 0; i < str.length(); i++ ) {
			char current = str.charAt(i);
			
			if( modified.indexOf(current) == -1 ) {
				modified = modified + str.charAt(i);
			}
		}
		
		System.out.println(modified);
	}
}
