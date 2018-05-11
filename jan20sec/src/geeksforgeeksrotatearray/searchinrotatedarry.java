package geeksforgeeksrotatearray;

import recursion.binarysearch;

//O(logn)
public class searchinrotatedarry {
	public static void main(String[] args) {
		int a[] = { 3, 4, 5, 6, 7, 1, 2 }; 
		int key = 2; // element to find
		int pivot = findpivot(a);
		int index = binarysearch.bs(a, 0, pivot - 1, key);
		int index1 = binarysearch.bs(a, pivot, a.length, key);
		if (index != -1) {
			System.out.println(index);
		} else if (index1 != -1) {
			System.out.println(index1);
		} else {
			System.out.println("element not found");
		}
	}

	public static int findpivot(int[] a) {
		int pivot = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				return i + 1;
			}
		}
		return pivot; // in case if array is not rotated
	}

}
