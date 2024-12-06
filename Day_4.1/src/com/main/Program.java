package com.main;

public class Program {

	/* Method overloading */
	
	
//	public int addition(int a, int b) {
//		return a + b;
//	}
//	public int addition(int a, int b, int c) {
//		return a + b + c;
//	}

	
	
//	public float addition(float a, int b) {
//		return a + b;
//	}
//	public float addition(int a, float b) {
//		return a + b;
//	}
	
	
	
	public int addition(int a, int b) {
		return a + b;
	}
	public float addition(int a, float b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		Program p = new Program();
//		System.out.println(p.addition(10, 20));
//		System.out.println(p.addition(10, 20, 30));
		
//		System.out.println(p.addition(10.3f,20));
//		System.out.println(p.addition(10,30.5f));
		
		System.out.println(p.addition(10,10));
		System.out.println(p.addition(20,10.5f));
		
	}

	
}
