package JUNE15;

// assumption  --> list will be sorted
public class duplicatesRemove extends linkedList {
	public void remove() { // removal by actually removing nodes
		linkedList curr = new linkedList();
		while (this.size != 0) {
			int temp = this.removeAtFirst();
			if (curr.size == 0) {
				curr.addLast(temp);
			} else {
				if (temp != curr.tail.data) {
					curr.addLast(temp);
				}
			}
		}
		this.head = curr.head;
		this.tail = curr.tail;
		this.size = curr.size;
	}

	public void removeDups() { // removing by changing pointers
		// more preffered
		int counter = 0;
		Node first = head; // pointer at the original value
		Node scnd = head; // pointer checking values which are duplicates
		while (scnd != null) {
			while (scnd.next != null && scnd.next.data == scnd.data) {
				scnd = scnd.next;
			}
			first.next = scnd.next;
			counter++;
 
			scnd = scnd.next;
			if (scnd == null) {
			this.tail = first;
			} else {
				first = first.next;
			}
		}
		this.size = counter;
		this.tail = first;
	}

	public static void main(String[] args) {
		duplicatesRemove dr = new duplicatesRemove();
		dr.addLast(10);
		dr.addLast(10);
		dr.addLast(20);
		dr.addLast(20);
		dr.addLast(30);
		dr.addLast(30);
		dr.display();
		// dr.remove();
		dr.removeDups();
		dr.display();
		dr.addLast(100);
		dr.display();
	}
}
