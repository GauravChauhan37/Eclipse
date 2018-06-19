package JUNE15;

public class mergeTwoSortedLists extends linkedList {
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
		mergeTwoSortedLists m = new mergeTwoSortedLists();
		m.addLast(10);
		m.addLast(20);
		m.addLast(30);
		m.addLast(40);
		m.addLast(50);
		mergeTwoSortedLists m2 = new mergeTwoSortedLists();
		m2.addLast(11);
		m2.addLast(12);
		m2.addLast(13);
		m2.addLast(400);
		m2.addLast(500);

		linkedList list = merge(m, m2);
		list.display();
	}
}
