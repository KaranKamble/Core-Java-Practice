package test;
import static java.lang.Math.*;

abstract class Shape {
	protected double area;
	public abstract double calculateArea( double radius );

}

public class Program {
	public static void main(String[] args) {
		Shape shape = new Shape() {

			
			public double calculateArea( double radius ) {
				return PI * pow(radius, 2);
			}
		};
		
		System.out.println(shape.calculateArea(12));
		
	}
}
