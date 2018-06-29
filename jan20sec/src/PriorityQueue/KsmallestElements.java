package PriorityQueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class KsmallestElements {

	public static void main(String[] args) {
		int[] arr = { 5, 4, 70, 9, 10, 1, 50 };
		int k = 3;
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for (int i = 0; i < k; i++) {
			pq.add(arr[i]);
		}
		for (int i = k; i < arr.length; i++) { // tc-->   O(nlogK) 
			if (arr[i] < pq.peek()) {
				pq.remove();
				pq.add(arr[i]);
			}
		}
		while (pq.size() != 0) {
			System.out.print(pq.remove() + " ");
		}
	}
}
