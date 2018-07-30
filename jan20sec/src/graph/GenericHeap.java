package graph;

import java.util.ArrayList;

public class GenericHeap<T extends Comparable<T>> { // extends cz to enable
													// other
	// interfaces to get implemented on this class. We want it must implements
	// comparable and so it has to extend Comparable
	private ArrayList<T> list = new ArrayList<>();
	private boolean max; // is it minheap or maxHeap
	// if max is false or not passed --> minheap
	// if max is true --> maxheap

	public GenericHeap() { // default

	}

	GenericHeap(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			add(arr[i]);
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			downHeapify(i);
		}
	}

	GenericHeap(boolean max) {
		this.max = max;
	}

	public void add(T data) {
		list.add(data);
		upHeapify(list.size() - 1);
	}

	private void upHeapify(int ci) {
		if (ci == 0) {
			return;
		}
		int pi = (ci - 1) / 2;
		if (myCompareTo(pi, ci) > 0) {
			swap(pi, ci);
			upHeapify(pi);
		}
	}

	private void swap(int i, int j) {
		T ith = list.get(i);
		T jth = list.get(j);
		list.set(i, jth);
		list.set(j, ith);
	}

	public T peek() {
		return list.get(0);
	}

	public T remove() {
		swap(0, list.size() - 1); // swap first and last
		T rem = list.remove(list.size() - 1); // remove last
		downHeapify(0);
		return rem;
	}

	public void downHeapify(int pi) {
		int left = (2 * pi) + 1;
		int right = (2 * pi) + 2;
		int min = pi;
		if (left < list.size() && myCompareTo(min, left) > 0) {
			min = left;
		}
		if (right < list.size() && myCompareTo(min, right) > 0) {
			min = right;
		}
		if (min != pi) {
			swap(min, pi);
			downHeapify(min);
		}
	}

	public void display() {
		System.out.println(list);
	}

	public int size() {
		return list.size();
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	public int myCompareTo(int i, int j) {
		if (max == false) {
			return list.get(i).compareTo(list.get(j));
		} else {
			return list.get(j).compareTo(list.get(i));
		}
	}

	public void updateHeap(T value) {
		int idx = 0;
		for (int i = 0; i < list.size(); i++) {
			if (value==list.get(i)) {
				idx = i;
				break;
			}
		}
		upHeapify(idx);
		downHeapify(idx);
	}
}
