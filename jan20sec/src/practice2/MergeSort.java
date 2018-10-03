package practice2;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = { 31, 5, 4, 41, 2, -3, 0 };
		int[] res = MergeSort(arr, 0, arr.length - 1);
		for (int i : res) {
			System.out.print(i+" ");
		}
	}

	public static int[] MergeSort(int[] arr, int low, int high) {
		if (low == high) {
			int[] a = { arr[low] };
			return a;
		}
		int mid = (low + high) / 2;
		int[] arr1 = MergeSort(arr, low, mid);
		int[] arr2 = MergeSort(arr, mid + 1, high);
		int[] SortedArr = Merge(arr1, arr2);
		return SortedArr;
	}

	private static int[] Merge(int[] first, int[] scnd) {
		int[] res = new int[first.length + scnd.length];
		int firstIndex = 0;
		int scndIndex = 0;
		int finalIndex = 0;
		while (firstIndex < first.length && scndIndex < scnd.length) {
			if(first[firstIndex] < scnd[scndIndex]) {
				res[finalIndex] = first[firstIndex];
				firstIndex++;
			}else {
				res[finalIndex] = scnd[scndIndex];
				scndIndex++;
			}
			finalIndex++;
		}
		while(firstIndex < first.length) {
			res[finalIndex] = first[firstIndex];
			finalIndex++;
			firstIndex++;
		}
		while(scndIndex < scnd.length) {
			res[finalIndex] = scnd[scndIndex];
			finalIndex++;
			scndIndex++;
		}
		return res;
	}
}
