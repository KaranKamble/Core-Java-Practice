package test;

class Complex {
	private static int count;

	public Complex() {
		count ++;
	}
	
	public static int getCount() {
		return Complex.count;
	}
}

public class Program2 {

	public static void main(String[] args) {
		Complex c1 = new Complex();
		Complex c2 = new Complex();
		Complex c3 = new Complex();
		
		System.out.println("Total count of Object : "+Complex.getCount());
	}

}
