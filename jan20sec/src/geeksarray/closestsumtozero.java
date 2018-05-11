package geeksarray;

import java.util.Arrays;

public class closestsumtozero {
	public static void closestsum(int[] arr) {
		Arrays.sort(arr);
		int low = 0;
		int high = arr.length - 1;
		int omin = Integer.MAX_VALUE;
		int sum = 0;
		while (low < high) {
			sum = arr[low] + arr[high];
			if (sum < 1) {
				low++;
			}
			if (sum >= 1) {
				high--;
			}
			if (sum == 0) {
				System.out.println(0);
				return;
			}
			if (sum < Math.abs(omin))
				omin = sum;
		}
		System.out.println(omin);
	}

	public static void main(String[] args) {
		int[] a = { 70, 98, 2, 7, 0, -50, 1 };
		closestsum(a);
	}

}
