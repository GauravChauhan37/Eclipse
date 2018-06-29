package PriorityQueue;

import java.util.PriorityQueue;

public class NearlySortedArray {

	public static void main(String[] args) {
		int[] arr = { 11, 3, 7, 15, 25, 20, 55, 66, 30 };
		int k = 2;
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int i;
		for (i = 0; i <= k; i++) {
			pq.add(arr[i]);
		}
		while (pq.size() != 0) {
			System.out.print(pq.remove() + " ");
			if (i < arr.length) {
				pq.add(arr[i]);
			}
			i++;
		}
	}
}
