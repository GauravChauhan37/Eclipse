package JUNE15;


public class kReverse extends linkedList {
	public void kReverse(int k) {
//		linkedList ll = new linkedList();   //not reqd
		linkedList prev = new linkedList();
		linkedList curr = new linkedList();
		while (this.size != 0) {
			for (int i = 0; i < k; i++) {
				curr.addFirst(this.removeAtFirst());
			}
			if (prev.size == 0) {
				prev = curr;
				curr = new linkedList();
			} else {
				prev.tail.next = curr.head;
				prev.tail = curr.tail;
				prev.size += curr.size;
				curr = new linkedList();
			}
		}
	
		this.size = prev.size;
		this.head = prev.head;
		this.tail = prev.tail;
	}

	public static void main(String[] args) {
		kReverse ll = new kReverse();
		ll.addFirst(10);
		ll.addFirst(20);
		ll.addFirst(30);
		ll.addFirst(40);
		ll.addFirst(50);
		ll.addFirst(60);
		ll.display();
		ll.kReverse(3);
		ll.display();
	}
}
