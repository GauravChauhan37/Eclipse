package sort;

public class quickSort {
	public static int partition(int[] arr, int start, int end) {
		int pivot = arr[start];
		int i = start;
		int j = end;
		while (i < j) {
			while (i < j && (arr[--j] >= pivot))
				; // empty loop
			if (i < j) {
				arr[i] = arr[j];
			}
			while (i < j && (arr[++i] <= pivot))
				;
			if (i < j) {
				arr[j] = arr[i];
			}
		}
		arr[j] = pivot;
		return j;
	}

	private static void quickSort(int[] arr, int start, int end) {
		if (end - start < 2) {
			return;
		}
		int pivotIndex = partition(arr, start, end);
		for (int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();
		quickSort(arr, start, pivotIndex);
		quickSort(arr, pivotIndex + 1, end);
	}

	public static void main(String[] args) {
		int[] arr = { 8, 7, 6, 5, 4, 3, 2, 1 };
		quickSort(arr, 0, arr.length);
		for (int val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();
	}
}
