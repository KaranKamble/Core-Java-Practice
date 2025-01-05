package test;

class Outer{
	private int num1;
	private static int num2;
	
	public Outer() {
		this.num1 = 10;
		Outer.num2 = 20;
	}
	
	class Inner{
		private int num3;
		private static int num4;
		
		public Inner() {
			this.num3 = 30;
			Inner.num4 = 40;
		}
	}
	
	public void print() {
		System.out.println("Num1  : "+this.num1);
		System.out.println("Num2  : "+Outer.num2);
		
		Inner inner = new Inner();
		System.out.println("Num3  : "+inner.num3);
		System.out.println("Num4  : "+Inner.num4);
	}
}

public class Program {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.print();
	}

}
