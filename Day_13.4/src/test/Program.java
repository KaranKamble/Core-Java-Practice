package test;

@FunctionalInterface
interface IMath {

	int factorial(int number);
}

public class Program {

	public static void main(String[] args) {
		IMath m = number -> {
			int fact = 1;
			for (int count = 1; count <= number; count++) {
				fact = fact * count;
			}

			return fact;
		};
		
		System.out.println(m.factorial(5));
		
	}

}
