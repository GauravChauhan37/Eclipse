package heap;

public class HeapSort {
	public static void downHeapify(int[] arr, int ep, int pi) {
		int left = (2 * pi) + 1;
		int right = (2 * pi) + 2;
		int min = pi;
		if (left < ep && arr[min] > arr[left]) {
			min = left;
		}
		if (right < ep && arr[min] > arr[left]) {
			min = right;
		}
		if (min != pi) {
			swap(arr, min, pi);
			downHeapify(arr, ep, min);
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[j];
		arr[j] = arr[i];
		arr[i] = temp;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 1, 20, 4, 6, 100, 6 };
		heapSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static void heapSort(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) { // O(n) --> downheapify on
													// deepest level will do
													// zero amount of work
			downHeapify(arr, arr.length, i);
		}
		for (int i = arr.length - 1; i > 0; i--) {
			swap(arr, i, 0);
			downHeapify(arr, i, 0);
		}
	}
}
