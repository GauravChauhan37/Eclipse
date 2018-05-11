package searchingandsortingarrays;

import java.util.Arrays;

public class findpairwithgivendiff {
	public static int binarySearch(int[] arr, int key, int low, int high) {
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == key) {
				return arr[mid];
			} else if (arr[mid] < key) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}

	public static void findPair(int[] arr, int diff) {
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			int first = arr[i];
			int scnd = binarySearch(arr, diff + first, 0, arr.length - 1);
			if (scnd != -1) {
				System.out.println(first + " " + scnd);
				return;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 5, 20, 3, 2, 50, 80 };
		int diff = 30;
		findPair(arr, diff);
	}

}
