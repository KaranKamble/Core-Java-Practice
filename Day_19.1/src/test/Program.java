package test;

class Singleton {
	private static Singleton s1;

	private Singleton() {
		System.out.println("Singleton.Singleton()");
	}

	public static synchronized Singleton getInstance() {
		if( s1 == null )
			return new Singleton();
		return s1;
	}
}

public class Program {

	public static void main(String[] args) {

		
		
//		Singleton s1 = Singleton.getInstance();
//		Singleton s2 = Singleton.getInstance();
//		
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());

		Runnable task = () -> {
			Singleton singleton = Singleton.getInstance();
			System.out.println(singleton);
		};

		// Create two threads that will try to get the Singleton instance
		Thread thread1 = new Thread(task);
		Thread thread2 = new Thread(task);

		// Start both threads
		thread1.start();
		thread2.start();

		// Wait for both threads to finish
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	
}
