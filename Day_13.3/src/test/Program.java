package test;

@FunctionalInterface
interface IMath {

	int addition(int num1, int num2);
}

public class Program {

	public static void main(String[] args) {
		IMath m = ( int num1, int num2 ) -> {
			return num1 + num2;
		};
		int result=  m.addition(2, 2);
		System.out.println("Addition is "+result);
	}

}
