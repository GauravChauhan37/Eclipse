package heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class MergeKSortedArrays {
	static class Pair implements Comparable<Pair> {
		int element;
		int idx; // data index
		int lidx; // list index

		Pair(int element, int idx, int lidx) {
			this.element = element;
			this.idx = idx;
			this.lidx = lidx;
		}

		@Override
		public int compareTo(Pair o) {
			return this.element - o.element;
		}
	}

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
		lists.add(new ArrayList<>(Arrays.asList(10, 15, 20, 25)));
		lists.add(new ArrayList<>(Arrays.asList(5, 7, 12, 18, 22)));
		lists.add(new ArrayList<>(Arrays.asList(3, 14, 19, 23, 34)));
		lists.add(new ArrayList<>(Arrays.asList(11, 17, 21)));
		GenericHeap<Pair> pq = new GenericHeap<Pair>();
		int li = 0;
		while (li < lists.size()) {
			pq.add(new Pair(lists.get(li).get(0), 0, li));
			li++;
		}
		while (pq.size() != 0) {
			Pair removed = pq.remove();
			System.out.print(removed.element + " ");
			removed.idx = removed.idx + 1;
			if (removed.idx < lists.get(removed.lidx).size()) {
				removed.element = lists.get(removed.lidx).get(removed.idx);
				pq.add(removed);
			}
		}
	}
}
