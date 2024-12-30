package test;

interface Pair<K, V> {

	K getKey();
	V getValue();
}

class Dictionary<K, V> implements Pair<K, V> {
	private K key;
	private V value;

	public Dictionary() {
	}
	
	

	public Dictionary(K key, V value) {
		this.key = key;
		this.value = value;
	}



	public void setKey(K key) {
		this.key = key;
	}

	@Override
	public K getKey() {
		return this.key;
	}
	
	public void setvalue( V value ) {
		this.value = value;
	}
	
	@Override
	public V getValue() {
		return this.value;
	}
}

public class Program {

	public static void main(String[] args) {
		Dictionary<Integer, String> pair = new Dictionary<>(10,"Raj");
//		pair.setKey(1);
//		pair.setvalue("Satya");
		
		System.out.println(pair.getKey());
		System.out.println(pair.getValue());
		

	}

}
