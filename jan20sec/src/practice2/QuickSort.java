package practice2;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = { 10, -5, 60, 1, 4, 88, 9, 1000, 0 };
		QuickSort(arr, 0, arr.length - 1);
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static void QuickSort(int[] arr, int low, int high) {
		if (high <= low) {
			return;
		}
		int pivot = arr[high];
		int pivotIdx = partition(arr, low, high, pivot);
		QuickSort(arr, low, pivotIdx - 1);
		QuickSort(arr, pivotIdx + 1, high);
	}

	private static int partition(int[] arr, int low, int high, int pivot) {
		int parIdx = -1;
		int Itr = 0;
		while (Itr < high) {
			if (arr[Itr] > arr[high]) {
				
			} else {
				parIdx++;
				int temp = arr[parIdx];
				arr[parIdx] = arr[Itr];
				arr[Itr] = temp;
			}
			Itr++;
		}
		int temp = arr[parIdx + 1];
		arr[parIdx + 1] = arr[high];
		arr[high] = temp;
		return parIdx + 1;
	}

}
