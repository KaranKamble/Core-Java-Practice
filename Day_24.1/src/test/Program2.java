package test;

class Complex{
	
	@Override
	protected void finalize() throws Throwable {
		Thread th = Thread.currentThread();
		
		System.out.println(th.getName());
		System.out.println(th.getPriority());
		System.out.println(th.getState());
	}
}
public class Program2 {
	
	public static void main(String[] args) {
		Complex complex = new Complex();
		complex = null;
		
		System.gc();
	}
	
	public static void main1(String[] args) {
		
		Thread th = Thread.currentThread();
		System.out.println(th);
		
		System.out.println(th.getId());
		System.out.println(th.getName());
		System.out.println(th.getPriority());
		System.out.println(th.getThreadGroup());
		
		
		System.out.println(th.getState());
		
	}
}
