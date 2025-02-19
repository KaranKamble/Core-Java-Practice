package test;

import java.lang.Thread.State;


public class Program {
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Inside finalize()");
	}
	
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		
		System.out.println(thread.getName());
		System.out.println(thread.getPriority());
		System.out.println(thread.getState());
		
		Program p1 = new Program();
		Program p2 = new Program();
		
		p1 = null;
		p2 = null;
		
	//	System.out.println("Callaing garbage");
		System.gc();
	}

	public static void main1(String[] args) {
		State[] states = State.values();
		for( State state : states ) {
			System.out.printf("%-5d%-12s\n", state.ordinal(),state.name());
		}
	}
}
