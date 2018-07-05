package hashmap;

public class GenericLinkedList<T> {
	private class Node {
		T data;
		Node next;
	}

	// data hiding
	private Node head;
	private Node tail;
	private int size;

	public void addLast(T data) {
		if (this.size == 0) {
			this.handleAddWhenSize0(data);
		} else {
			// create node
			Node node = new Node();
			// set data
			node.data = data;
			// connect
			tail.next = node;
			// update summary
			tail = node;
			size++;
		}
	}

	// abstraction
	private void handleAddWhenSize0(T data) {
		// create node
		Node node = new Node();
		// set data
		node.data = data;
		// update summary
		head = node;
		tail = node;
		size++;

	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void display() {
		for (Node node = this.head; node != null; node = node.next) {
			System.out.print(node.data + " -> ");
		}
		System.out.println(".");
	}

	public void addFirst(T data) {
		if (this.size == 0) {
			this.handleAddWhenSize0(data);
		} else {
			Node node = new Node();
			node.data = data;
			node.next = head;
			head = node;
			size++;
		}
	}

	public T getFirst() {
		if (this.size == 0) {
			System.out.println("List is empty");
			return null;
		}
		return head.data;
	}

	public T getLast() {
		if (this.size == 0) {
			System.out.println("List is empty");
			return null;
		}
		return tail.data;
	}

	public T getAt(int idx) {
		if (this.size == 0) {
			System.out.println("List is empty");
			return null;
		} else if (idx < 0 || idx >= this.size) {
			System.out.println("Index out of bound");
			return null;
		}

		Node rv = head;

		for (int i = 0; i < idx; i++) {
			rv = rv.next;
		}

		return rv.data;
	}

	// abstraction
	private Node getNodeAt(int idx) {
		if (this.size == 0) {
			System.out.println("List is empty");
			return null;
		} else if (idx < 0 || idx >= this.size) {
			System.out.println("Index out of bound");
			return null;
		}

		Node rv = head;

		for (int i = 0; i < idx; i++) {
			rv = rv.next;
		}

		return rv;
	}

	public void addAt(T data, int idx) {
		if (idx < 0 || idx > size) {
			System.out.println("Index out of bounds");
			return;
		} else if (idx == 0) {
			this.addFirst(data);
		} else if (idx == size) {
			this.addLast(data);
		} else {
			Node nm1 = this.getNodeAt(idx - 1);
			Node np1 = nm1.next;

			Node node = new Node();
			node.data = data;

			nm1.next = node;
			node.next = np1;
			size++;
		}
	}

	public T removeFirst() {
		if (this.size == 0) {
			System.out.println("List is empty");
			return null;
		} else if (this.size == 1) {
			return this.handleRemoveWhenSizeis1();
		}

		Node first = head;
		Node second = first.next;

		head = second;
		size--;

		return first.data;
	}

	public T removeLast() {
		if (this.size == 0) {
			System.out.println("List is empty");
			return null;
		} else if (this.size == 1) {
			return this.handleRemoveWhenSizeis1();
		}

		Node last = tail;
		Node secondLast = this.getNodeAt(size - 2);

		tail = secondLast;
		secondLast.next = null;
		size--;

		return last.data;
	}

	private T handleRemoveWhenSizeis1() {
		Node node = head;

		head = tail = null;
		size = 0;

		return node.data;
	}

	public T removeAt(int idx) {
		if (this.size == 0) {
			System.out.println("List is empty");
			return null;
		} else if (idx < 0 || idx >= this.size) {
			System.out.println("Index out of bound");
			return null;
		} else if (idx == 0) {
			return removeFirst();
		} else if (idx == size - 1) {
			return removeLast();
		} else {
			Node nm1 = getNodeAt(idx - 1);
			Node n = nm1.next;
			Node np1 = n.next;

			nm1.next = np1;
			size--;

			return n.data;
		}
	}
}
