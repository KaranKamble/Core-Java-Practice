package test;


class Prototype{
	 
	
	public Prototype() {
		System.out.println("Prototype.Prototype() called");
	}
}

class Singleton{
	private static final Singleton singleton;
	
	static {
		singleton = new Singleton();
	}
	
	private Singleton() {
		System.out.println("Singleton.Singleton() called");
	}
	
	public static Singleton getSingleton() {
		return singleton;
	}
	
}
public class Program {
	
	public static void main(String[] args) {
		Singleton.getSingleton();
		Singleton.getSingleton();
		Singleton.getSingleton();
	}

	public static void main1(String[] args) {
		System.out.println("In Main()");
		Prototype prototype1 = new Prototype();
		Prototype prototype2 = new Prototype();
		Prototype prototype3 = new Prototype();
		
	}
}
