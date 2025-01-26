package test;

import java.lang.reflect.Field;

class Complex{
	private int img;
	private int real;
	
	public Complex() {
		this.img = 10;
		this.real = 20;
	}

	@Override
	public String toString() {
		return "Complex [img=" + img + ", real=" + real + "]";
	}
	
	
}
public class Program {

	public static void main(String[] args) throws Exception {
		Complex complex = new Complex();
		System.out.println(complex);
		Class<?> c = complex.getClass();
		
		Field field = null;
		field = c.getDeclaredField("img");
		field.setAccessible(true);
		field.setInt(complex, 44);
		
		field = c.getDeclaredField("real");
		field.setAccessible(true);
		field.setInt(complex, 55);
		
		System.out.println(complex);
	}
}
