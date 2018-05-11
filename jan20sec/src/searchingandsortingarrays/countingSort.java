package searchingandsortingarrays;

public class countingSort {
	public static void sort(int[] arr) {
		int[] count = new int[10];
		for (int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
		}
		for (int i = 0; i < count.length;) {
			if (count[i] != 0) {
				System.out.print(i + " ");
				count[i]--;
			} else {
				i++;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 4, 1, 2, 7, 5, 2 };
		sort(arr);
	}

}
