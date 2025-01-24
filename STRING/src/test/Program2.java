package test;

public class Program2 {
	public static void main(String[] args) {

		String str = "Software Services";

		for (int i = 0; i < str.length(); i++) {
			char current = str.charAt(i);
			boolean repeated = false;
			
			for (int j = 0; j < str.length(); j++) {
				if ( i != j && current == str.charAt(j)) {
					repeated = true;
					break;
				}
			}
			
			if( !repeated ) {
				System.out.println("First Non Repeated char is : "+current);
				//return;
			}

		}

	}
}
