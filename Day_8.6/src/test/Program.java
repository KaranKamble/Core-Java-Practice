package test;

import java.util.Date;

class Box<T> {
	private T obj;

	public void setObj(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		return obj;
	}
}

public class Program {

	public static void main(String[] args) {
	//	Box box1 = new Box();			// Raw Type
		
		Box<Object> box2 = new Box();	//type Inference 
		
		Box<String> box3 = new Box();
		Box<Date> bo4 = new Box<Date>();
		
		Box<Integer> box = new Box<Integer>();
		
		box.setObj(10);
		System.out.println(box.getObj());
		box.setObj(null);
		System.out.println(box.getObj());
		
	}

}
