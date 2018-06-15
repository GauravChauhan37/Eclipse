package JUNE15;

import practice.dice;

public class client {

	public static void main(String[] args) {
		// linkedList list = new linkedList();
		// list.addLast(10);
		// list.addLast(20);
		// list.addLast(30);
		// list.addLast(40);
		// list.addLast(50);
		// list.display();
		// System.out.println(list.size());
		// System.out.println(list.isEmpty());
		// list.addFirst(5);
		// list.display();
		// System.out.println("**********");
		// list.addAtIndex(20000, 6);
		// list.display();
		// System.out.println(list.getAtIndex(2));
		// System.out.println(list.getAtFirst());
		// System.out.println(list.getAtLast());
		// System.out.println("*******************");
		// System.out.println(list.removeAtFirst());
		// list.display();
		// System.out.println(list.removeAtLast());
		// list.display();
		// System.out.println(list.removeAtIndex(3));
		// list.display();
		System.out.println("TestCase");
		linkedList lt = new linkedList();
		lt.addFirst(10);
		lt.display();
		lt.removeAtFirst();
		lt.display();
		lt.addLast(10);
		lt.display();
		lt.removeAtLast();
		lt.display();
		lt.addFirst(10);
		lt.addFirst(20);
		lt.addFirst(30);
		lt.addFirst(40);
		lt.display();
		lt.addAtIndex(50, 2);
		lt.display();
		lt.removeAtFirst();
		lt.display();
		System.out.println(lt.getAtLast());
		System.out.println(lt.size());
		lt.removeAtLast();
		lt.display();
		lt.addAtIndex(80,3);
		lt.display();
		lt.removeAtIndex(2);
		lt.display();
	}
}
