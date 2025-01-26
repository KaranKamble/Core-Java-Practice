package test;

public class Program {

	public static void main(String[] args) {

		class Complex {
			private int img, real;
			
			public Complex() {
				this.img = 11;
				this.real =  22;
			}

			@Override
			public String toString() {
				return "Complex [img=" + img + ", real=" + real + "]";
			}
			
			
		}
		
		Complex  c = new Complex();
		System.out.println(c.toString());
	}
}
