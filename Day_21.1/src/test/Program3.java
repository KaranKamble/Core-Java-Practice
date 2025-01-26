package test;

import static java.lang.Math.*;

abstract class Shape{
	protected double area;
	
	public abstract void calculateArea( int radius );
	
	public double getArea() {
		return area;
	}
}
public class Program3 {
	public static void main(String[] args) {

		Shape s = new Shape() {
			
			
			public void calculateArea( int radius ) {
				this.area = PI * pow(radius, 2);
			}
			
			
		};
		s.calculateArea(10);
		System.out.println(s.getArea());
		
		
		
		
	}
}
