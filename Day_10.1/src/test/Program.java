package test;

class Node {
	int element;
	Node next;

	public Node(int element) {
		this.element = element;
	}
}

class LinkedList {
	private Node head;
	private Node tail;

	public void addNode(int element) {
		Node newNode = new Node(element);
		if (this.head == null)
			this.head = newNode;
		else
			this.tail.next = newNode;
		this.tail = newNode;
	}

	public void printNode() {
		Node trav = this.head;

		while (trav != null) {
			System.out.println(trav.element);
			trav = trav.next;
		}
	}

}

public class Program {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addNode(11);
		list.addNode(12);
		list.addNode(13);

		list.printNode();
	}
}
