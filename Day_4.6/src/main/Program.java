package main;

enum Color{
	RED,BLUE,GREEN
}
public class Program {

	public static void main1(String[] args) {
		Color color = Color.BLUE;
		System.out.println(color.ordinal());
		System.out.println(color.name());	
	}
	
	public static void main(String[] args) {
		Color colors[] = Color.values();
		
		for( int i = 0; i < colors.length; i++ ) {
			System.out.println(colors[i].name());
			System.out.println(colors[i].ordinal());
		}
		System.out.println();
		
		for( Color color : colors) {
			System.out.println(color.ordinal());
			System.out.println(color.name());
		}
	}

}
