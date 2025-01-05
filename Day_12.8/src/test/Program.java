package test;

public class Program {
	public static void main(String[] args) {

		Object object = new Object() {

			@Override
			public String toString() {
				return "Hello World";
			}
		};
		
		System.out.println(object);
	}

}
