package GraphsRevise;

import java.util.ArrayList;

public class GenericHeap<T extends Comparable<T>> {
	private ArrayList<T> list = new ArrayList<>();

	GenericHeap() { // default

	}

	GenericHeap(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			add(arr[i]);
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			downHeapify(i);
		}
	}

	private void add(T t) {
		list.add(t);
		upHeapify(list.size()-1);
	}

	private void upHeapify(int i) {	
		
	}

	private void downHeapify(int i) {
		
	}
}
