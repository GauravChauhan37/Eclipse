package searchingandsortingarrays;

// better approach heap sort --> not done yet
public class sortanearlysortedarray {
	public static void sortArr(int[] arr, int k) {
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}

	public static void main(String[] args) {
		int k = 3;
		int arr[] = { 2, 6, 3, 12, 56, 8 };
		sortArr(arr, k);
		for (Integer val : arr) {
			System.out.print(val + " ");
		}
		System.out.println();
	}
}
