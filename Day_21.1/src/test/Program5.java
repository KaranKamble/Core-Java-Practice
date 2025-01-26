package test;

@FunctionalInterface
interface Complex{
	
	void print();
}


public class Program5 {
	public static void main(String[] args) {
		class Test implements Complex{

			@Override
			public void print() {
				System.out.println("Hello");
			}
			
		};
		Complex c = new Test();
		c.print();
		
		
		
	}
}
