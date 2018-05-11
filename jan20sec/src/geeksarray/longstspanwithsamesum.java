package geeksarray;

import java.util.Arrays;

public class longstspanwithsamesum {
	// O(n)
	public static void lonspam(int[] a, int[] b) {
		int sum1 = 0, sum2 = 0;
		int max = 0;
		int[] diff = new int[a.length + b.length];
		Arrays.fill(diff, -1);
		for (int i = 0; i < a.length; i++) {
			sum1 = sum1 + a[i];
			sum2 = sum2 + b[i];
			int curdiff = sum1 - sum2;
			int diffindex = a.length + curdiff;
			if (curdiff == 0) {
				max = i + 1;
			} else if (diff[diffindex] == -1) {
				diff[diffindex] = i;
			} else {
				int len = i - diff[diffindex];
				if (len > max) {
					max = len;
				}
			}
		}
		System.out.println(max);
	}

	// nsq
	public static void longestspam(int[] a, int[] b) {
		int asum = 0, bsum = 0;
		int len = 0, max = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				asum = asum + a[j];
				bsum = bsum + b[j];
				if (asum == bsum) {
					len = j - i + 1;
					if (len > max) {
						max = len;
					}
				}
			}
			asum = 0;
			bsum = 0;
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		int[] a = { 0, 1, 0, 1, 1, 1, 1 };
		int[] b = { 1, 1, 1, 1, 1, 0, 1 };

		// longestspam(a, b);
		lonspam(a, b);
	}
}