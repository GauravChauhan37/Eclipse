package june16;

import java.util.LinkedList;

import JUNE15.linkedList;

public class IsPalindrome extends linkedList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		linkedList ll = new linkedList();
		ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);
		ll.addLast(40);
		ll.addLast(50);
		ll.addLast(60);
		ll.addLast(70);
//		ll.addLast(80);
		// System.out.println(ll.isPalindrome(ll));
		// ll.fold(ll);
		System.out.println(ll.mid(ll));
		System.out.println(ll.findKthElement(ll, 3));
		ll.display();

		ll.display();
	}
}
