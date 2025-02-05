package test;

class Task1 extends Thread{
	
	@Override
	public void run() {
		System.out.println(this.getState());
	}

}
public class Program3 {
	
	public static void main(String[] args) {
		
	}
	
	public static void main2(String[] args){
		 Thread th = new Task1();
		 System.out.println(th.getState());
		 
		 th.start();
		 
	}
}
