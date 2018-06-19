package JUNE15;

import JUNE15.linkedList.Node;

public class reverseLLpointerIterative extends linkedList {

	public void reverse() {
		Node prev = head;
		Node curr = head.next;
		while (curr != null) {
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		Node temp = head;
		head = tail;
		tail = temp;
		tail.next = null;
	}

	public static void main(String[] args) {
		// linkedList list = new linkedList();
		// list.addLast(10);
		// list.addLast(20);
		// list.addLast(30);
		// list.addLast(40);
		// list.display();
		reverseLLpointerIterative rev = new reverseLLpointerIterative();
		rev.addLast(10);
		rev.addLast(20);
		rev.addLast(30);
		rev.addLast(40);
		rev.display();
		rev.reverse();
		// list.display();
		rev.display();
	}
}
