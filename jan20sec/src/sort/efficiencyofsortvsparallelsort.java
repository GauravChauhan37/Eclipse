package sort;

import java.util.Arrays;

public class efficiencyofsortvsparallelsort {
	// until 5 digit num both are performing almost same
	// for 6th digit sort is better
	// for 7th digit para sort in better
	// for 8th digit para sort is far better than sort
	public static void main(String[] args) {
		int n = 40000000;
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			int itemToBeFilled = (int) (n * Math.random());
			arr[i] = itemToBeFilled;
		}
		long start = System.currentTimeMillis();
		Arrays.sort(arr);
		// Arrays.parallelSort(arr);
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}

}
