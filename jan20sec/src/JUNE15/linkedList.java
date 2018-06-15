package JUNE15;

public class linkedList {
	static class Node {
		int data;
		Node next;
	}

	// data hiding
	private Node head;
	private Node tail;
	private int size;

	public void addLast(int data) {
		if (size == 0) {
			// data hiding
			addWhenSizeIsEqualToZero(data);
		} else {
			// space alloc
			Node n = new Node();
			// data fill
			n.data = data;
			// connect to next
			tail.next = n;
			// update
			tail = n;
			size++;
		}
	}

	private void addWhenSizeIsEqualToZero(int data) {
		// space alloc
		Node n = new Node();
		// data fill
		n.data = data;
		// update
		head = n;
		tail = n;
		size++;
	}

	public void display() {
		for (Node n = head; n != null; n = n.next) {
			System.out.print(n.data + " ");
		}
		System.out.println();
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void addFirst(int data) {
		Node n = new Node();
		n.data = data;
		n.next = head;
		if (size == 0) {
			tail = n;
		}
		head = n;
		size++;
	}

	public void addAtIndex(int data, int idx) {
		Node n = new Node();
		int i = 1;
		n.data = data;
		if (idx < 0 && idx >= size) {
			System.out.println("Index Out of Bound");
			return;
		} else if (idx == 0) {
			addFirst(data);
			return;
		} else if (idx == size - 1) {
			addLast(data);
			return;
		} else if (size == 0) {
			System.out.println("EmptyList");
			return;
		}
		Node p;
		for (p = head; i < idx; p = p.next, i++) {

		}
		n.next = p.next;
		p.next = n;
		size++;
	}

	public int getAtIndex(int idx) {
		if (size == 0) {
			System.out.println("list empty");
			return -1;
		} else if (idx < 0 || idx >= size) {
			System.out.println("Index OutOfBound");
			return -1;
		}
		Node n = getNodeAt(idx);
		return n.data;
	}

	public int getAtFirst() {
		if (size == 0) {
			System.out.println("list is Empty");
			return -1;
		} else {
			return head.data;
		}
	}

	public int getAtLast() {
		if (size == 0) {
			System.out.println("list is Empty");
			return -1;
		} else {
			return tail.data;
		}
	}

	private Node getNodeAt(int idx) { // private cz user dnot need not to from
										// where you are
		// pulling out that node . this is the example of abstraction
		if (size == 0) {
			System.out.println("list empty");
			return null;
		} else if (idx < 0 || idx >= size) {
			System.out.println("Index OutOfBound");
			return null;
		}
		Node n;
		int i = 0;
		for (n = head; i < idx; i++, n = n.next) {

		}
		return n;
	}

	public int removeAtFirst() {
		Node first = head;
		if (size == 0) {
			System.out.println("List us Empty");
			return -1;
		} else if (size == 1) {
			return removeWhenSizeIsOne();
		} else {
			head = head.next;
			size--;
		}
		return first.data;
	}

	public int removeAtLast() {
		int last = tail.data;
		if (size == 0) {
			System.out.println("List us Empty");
			return -1;
		} else if (size == 1) {
			return removeWhenSizeIsOne();
		} else {
			Node scndLst = getNodeAt(size - 2);
			tail = scndLst;
			tail.next = null;
			size--;
		}
		return last;
	}

	public int removeAtIndex(int idx) {
		if (size == 0) {
			System.out.println("List us Empty");
			return -1;
		} else if (idx < 0 || idx >= size) {
			System.out.println("Index OutOfBound");
			return -1;
		} else if (idx == 0) {
			return removeAtFirst();
		} else if (idx == size - 1) {
			return removeAtLast();
		}
		Node pre = getNodeAt(idx - 1);
		Node mid = pre.next;
		Node post = mid.next;
		pre.next = post;
		return mid.data;
	}

	private int removeWhenSizeIsOne() {
		Node n = head;
		head = null;
		tail = null;
		size--;
		return n.data;
	}
}
