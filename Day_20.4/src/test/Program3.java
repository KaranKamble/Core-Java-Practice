package test;


abstract class A{
	
	abstract void print();
}

class B extends A{

	@Override
	protected void print()throws RuntimeException {
		for( int i = 0; i < 11; i ++ ) {
			System.out.println(i);
			try {
			Thread.sleep(200);
			}catch( Exception ex ) {
				throw new RuntimeException();
			}
		}
		
	}
	
}
public class Program3 {
	
	public static void main(String[] args) {
		A a = new B();
		a.print();
	}
}
