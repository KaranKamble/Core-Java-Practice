package test;

public class Program {
	public static void main(String[] args) {

		class Complex {
			private int img;
			private int real;

			@Override
			public String toString() {
				return "Img : " + this.img + ", Real : " + this.real;
			}
		}
		
		Complex cp = new Complex();
		String str = cp.toString();
		System.out.println(str);
		//OR
		
		System.out.println(cp);
	}

}
