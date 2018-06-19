package JUNE15;

public class seprateOddAndEven extends linkedList {
	public void seprate(linkedList list) {
		linkedList even = new linkedList();
		linkedList odd = new linkedList();
		while (list != null) {
			int temp = list.removeAtFirst();
			if (temp % 2 == 0) {
				even.addLast(temp);
			} else {
				odd.addLast(temp);
			}
		}
		even.tail = odd.tail;
		list = even;
		list.head = even.head;
		list.tail = even.tail;
		list.display();
	}

	public static void main(String[] args) {
		seprateOddAndEven m1 = new seprateOddAndEven();
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
		m1.seprate(m1);
	}

}
