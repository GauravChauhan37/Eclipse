package june16;

import JUNE15.linkedList;

public class recursiveDataReverse extends linkedList {
	
	public static void main(String[] args) {
		linkedList r = new linkedList();
		r.addFirst(10);
		r.addFirst(20);
		r.addFirst(30);
		r.addFirst(40);
		r.display();
		r.reverseData();
		r.display();
	}
}
