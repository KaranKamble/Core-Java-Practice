package test;

class Box<T extends Number> {
	private T obj;

	public void setObj(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		return this.obj;
	}

}

public class Program {
	public static void main(String[] args) {
		// Box<Object> box1 = new Box<>(); NOT OK
		Box<Integer> box2 = new Box<>();
		// Box<String> box3 = new Box<>(); NOT OK
		Box<Float> box4 = new Box<>();
		Box<Double> box5 = new Box<>();
	}
}
