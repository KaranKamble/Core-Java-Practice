package test;

interface Printable{
	void print();
}
public class Program {
	public static void main(String[] args) {
		Printable p = new Printable() {
			
			@Override
			public void print() {
				System.out.println("Hello this is Method local Anonymous inner class");
			}
		};
		
		p.print();
	}
}
