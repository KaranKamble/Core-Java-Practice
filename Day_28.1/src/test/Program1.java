package test;


interface Addition{
	
	void add( int a, int b, int c );
}
public class Program1 {

	public static void main(String[] args) {
		Addition addition = ( a, b, c ) -> {
			System.out.println("Addition : "+(a+b+c));
		};
		
		addition.add(10, 20, 30);
	}
}
