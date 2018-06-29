package PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianPriorityQueue {
	PriorityQueue<Integer> larger = new PriorityQueue<>();
	PriorityQueue<Integer> smaller = new PriorityQueue<>(Collections.reverseOrder());
	int size = 0;

	public void add(int val) {
		if (larger.size() != 0 && larger.peek() < val) {
			larger.add(val);
		} else if (smaller.size() != 0 && smaller.peek() > val) {
			smaller.add(val);
		} else {
			smaller.add(val);
		}
		size++;
		if (larger.size() - smaller.size() > 1) {
			int rem = larger.remove();
			smaller.add(rem);
		} else if (smaller.size() - larger.size() > 1) {
			int rem = smaller.remove();
			larger.add(rem);
		}
	}

	public void peek() {
		if (size == 0) {
			System.out.println(-1);
			return;
		}
		if (larger.size() > smaller.size()) {
			System.out.println(larger.peek());
		} else {
			System.out.println(smaller.peek());
		}
	}

	public void remove() {
		if (size == 0) {
			System.out.println(-1);
			return;
		}
		if (larger.size() > smaller.size()) {
			System.out.println(larger.remove());
		} else {
			System.out.println(smaller.remove());
		}
		size--;
	}

	public static void main(String args[]) {
		MedianPriorityQueue m = new MedianPriorityQueue();
		m.add(5);
		m.add(10);
		m.add(15);
		m.add(20);
		m.add(25);
		m.add(30);
		m.remove();
		m.remove();
		m.remove();
		m.remove();
		m.remove();
		m.remove();
		m.remove();
		m.peek();

	}
}
