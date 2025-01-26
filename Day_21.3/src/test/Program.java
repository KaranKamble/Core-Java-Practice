package test;

@FunctionalInterface
interface IMath{
	
	void addition( int num1, int num2  );
}
public class Program {

	public static void main(String[] args) {
		IMath math = ( number1 , number2 ) -> {
			int result = number1 + number2;
			System.out.println("Addition : "+result);
		};
		math.addition(10, 10);
	}
}
