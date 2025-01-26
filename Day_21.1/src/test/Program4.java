package test;


interface Printable{
	
	public void print( String str );
}

public class Program4 {
	public static void main(String[] args) {

		Printable p = new Printable() {
			
			@Override
			public void print( String msg ) {
				System.out.print(msg);
			}
		};
		
		p.print("Hey");
		
		
	}
}
