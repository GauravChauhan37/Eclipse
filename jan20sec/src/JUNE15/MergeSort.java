package JUNE15;

import JUNE15.linkedList.Node;

public class MergeSort extends linkedList {
	static MergeSort m = new MergeSort();

	public Node midd(linkedList list) {
		Node slow = list.head;
		Node fast = list.head;
		while (true) {
			fast = fast.next;
			if (fast == null) {
				return slow;
			}
			fast = fast.next;
			if (fast == null) {
				return slow;
			}
			slow = slow.next;
		}
	}

	public static linkedList mergeSort(linkedList list) {
		Node mid = m.midd(list);
		if (list.head == list.tail) {
			return list;
		}
		linkedList first = new linkedList();
		first.head = list.head;
		first.tail = mid;		
		linkedList scnd = new linkedList();
		scnd.head = mid.next;
		first.tail.next =null;
		scnd.tail = list.tail;
		first = mergeSort(first);
		scnd = mergeSort(scnd);
		linkedList third = merge(first, scnd);
		third.size = list.size;
		return third;
	}

	public static linkedList merge(linkedList first, linkedList scnd) {
		linkedList list = new linkedList();
		Node fNode = first.head;
		Node sNode = scnd.head;
		while (fNode != null && sNode != null) {
			if (fNode.data < sNode.data) {
				list.addLast(fNode.data);
				fNode = fNode.next;
			} else {
				list.addLast(sNode.data);
				sNode = sNode.next;
			}
		}
		if (fNode != null) {
			while (fNode != null) {
				list.addLast(fNode.data);
				fNode = fNode.next;
			}
		}
		if (sNode != null) {
			while (sNode != null) {
				list.addLast(sNode.data);
				sNode = sNode.next;
			}
		}
		return list;
	}

	public static void main(String[] args) {
		MergeSort m1 = new MergeSort();
		m1.addLast(10);
		m1.addLast(30);
		m1.addLast(10112);
		m1.addLast(1110);
		m1.addLast(1012);
		m1.addLast(1);
		m1.addLast(12);
		m1.addLast(0);
		m1.addLast(9090);
		m1.addLast(11);
		linkedList ans = m.mergeSort(m1);
		ans.display();
	}
}
