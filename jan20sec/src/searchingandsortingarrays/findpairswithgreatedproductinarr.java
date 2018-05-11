package searchingandsortingarrays;

import java.util.Arrays;
import java.util.HashSet;

public class findpairswithgreatedproductinarr {

	public static void main(String[] args) {
		int[] arr = { 10, 2, 3, 4, 6, };
		HashSet<Integer> map = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			map.add(arr[i]);
		}
		Arrays.sort(arr);
		// 2 3 4 6 10
		for (int i = arr.length - 1; i >= 0; i--) {
			for (int j = 0; j < i && arr[j] * arr[j] <= arr[i]; j++) {
				if (arr[i] % arr[j] == 0) { // to check if is a[i] is divisble
											// by a[j]
					int result = arr[i] / arr[j];
					if (result != arr[j] && map.contains(result) == true) {
						System.out.println(arr[i]);
						return;
					}
				}
			}
		}
		System.out.println(-1);
	}

}
