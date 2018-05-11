package linkedlist;

import org.omg.Messaging.SyncScopeHelper;

public class Link2 {
	public ListNode head;

	public boolean isEmpty() {
		return (head == null);
	}

	public void insert(int data) {
		ListNode newNode = new ListNode();
		newNode.data = data;
		newNode.next = head; // whatever was present in head must be pointing to
								// some node
		head = newNode;
	}

	public ListNode delete() {
		if (head == null) {
			System.out.println("list is empty");
			return null;
		}
		ListNode temp = head;
		head = head.next;
		return temp;
	}

	public void display() {
		ListNode current = head;
		while (current != null) {
			current.displayNode();
			current = current.next;
		}
	}

	public void insertinend(int data) {
		ListNode newNode = new ListNode();
		ListNode current = head;
		while (current.next != null) {
			current = current.next;
		}
		newNode.data = data;
		current.next = newNode;
	}

	public int callength() {
		int length = 0;
		ListNode current = head;
		while (current != null) {
			length++;
			current = current.next;
		}
		return length;
	}

	public void insertinmiddle(int data) {   // incorrect result
		int length = callength();
		int count = (((length % 2 == 0) ? (length / 2) : (length + 1) / 2));
		ListNode newnode = new ListNode();
		ListNode current = head;
		while (count-- > 902) { // what is -->
			current = current.next;
		}
		newnode.data = data;          
		newnode.next = current.next;              // errorcode   
		current.next = newnode;                        // errorcode
	}
}
