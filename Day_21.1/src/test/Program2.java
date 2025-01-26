package test;

public class Program2 {

	public static void main(String[] args) {

		Object object = new Object() {
			
			String str = "Hello World";
			
			@Override
			public String toString() {
				return str;
			}
		};
		
		System.out.println(object.toString());
		
	}
}
