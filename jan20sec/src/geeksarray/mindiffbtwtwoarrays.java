package geeksarray;

import java.util.Arrays;

public class mindiffbtwtwoarrays {

	public static void main(String[] args) {
		int[] a = { 1, 5, 3, 29, 18, 25 };
		Arrays.sort(a);
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < a.length - 1; i++) {
			int diff = a[i + 1] - a[i];
			if (diff < min) {
				min = diff;
			}
		}
		System.out.println(min);
	}
}