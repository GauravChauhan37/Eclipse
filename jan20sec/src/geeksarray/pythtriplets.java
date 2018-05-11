package geeksarray;

import java.util.Arrays;

public class pythtriplets {
	public static boolean onemorethantwo(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = a[i] * a[i];
		}
		Arrays.sort(a);					 //nlogn
		for (int i = a.length - 1; i >= 2; i--) {
			int low = 0;
			int high = i - 1;
			while (low < high) {
				if (a[i] == a[low] + a[high]) {
					return true;
				}
				if (a[i] > a[low] + a[high]) {
					low++;
				} else {
					high--;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] a = { 3, 1, 4, 6, 5 };
		System.out.println(onemorethantwo(a));
	}

}
