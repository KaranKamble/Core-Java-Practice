package test;

import java.lang.Thread.State;

class Task implements Runnable{
	private Thread thread;
	
	@Override
	public void run() {
		System.out.println("Inside run()");
		this.thread = new Thread();
		
	}
	
}

public class Program {
	
	public static void main(String[] args) {
		
		Runnable target = new Task();
		Thread thread = new Thread(target);
		thread.start();
	}
	
	public static void main3(String[] args) {
		Thread thread = new Thread("Thread#1");
		
		Thread th = Thread.currentThread();
		System.out.println(thread.getName());
	}
	
	public static void main2(String[] args) {
		
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName()+" "+ thread.isDaemon());
	}

	public static void main1(String[] args) {
		State[] states = State.values();
		for( State state : states ) {
			System.out.println(state.name());
		}
	}
}
