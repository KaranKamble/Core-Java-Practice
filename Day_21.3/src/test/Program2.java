package test;

@FunctionalInterface
interface IMath1{
	
	int addition( int num1, int num2  );
}
public class Program2 {
	
	public static void main(String[] args) {
		IMath1 math = ( num1, num2 ) -> num1 + num2 ;
		
		System.out.println(math.addition(11,11));
	}

	public static void main1(String[] args) {
		IMath1 math = ( number1 , number2 ) -> {
			int result = number1 + number2;
			System.out.println("Addition is : "+result);
			return result;
		};
		math.addition(10, 10);
	}
}
