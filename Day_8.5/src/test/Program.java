package test;

import java.util.Date;

class Box {
	private Object obj;

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public Object getObj() {
		return obj;
	}
}

public class Program {

	public static void main(String[] args) {
		Box box = new Box();
		box.setObj(10);
		System.out.println(box.getObj());
		box.setObj(null);
		System.out.println(box.getObj());
		box.setObj(new Date());
		System.out.println(box.getObj());

	}

}
