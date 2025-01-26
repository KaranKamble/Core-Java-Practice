package test;

@FunctionalInterface
interface Printable{
	
	void print( String msg );
}
public class Program {

	public static void main(String[] args) {
	//	Printable p = ( String msg ) -> System.out.println(msg);
	//	Printable p = ( message ) -> System.out.println(message);
		Printable p = message -> System.out.println(message);
		
		
		p.print("Hello I am Lambda Expression");
	}
}
