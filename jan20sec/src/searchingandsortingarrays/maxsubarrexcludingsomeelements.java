package searchingandsortingarrays;

import java.util.Arrays;

public class maxsubarrexcludingsomeelements {
	// Maximum Subarray Sum Excluding Certain Elements
	public static boolean binarysearch(int[] a, int start, int end, int f) {
		int mid = 0;
		mid = (start + end) / 2;
		if (a[mid] == f) {
			return true;
		} else {
			while (start < end) {
				if (f > a[mid]) {
					start = mid + 1;
					mid = (start + end) / 2;
				} else if (f < a[mid]) {
					end = mid - 1;
					mid = (start + end) / 2;
				} else {
					return true;
				}
			}
		}
		return false;
	}

	public static void findmax(int[] a, int[] b) {
		int sum = 0;
		int osum = 0;
		for (int i = 0; i < a.length; i++) {
			if (binarysearch(b, 0, b.length, a[i]) == false) {
				if (a[i] + sum > a[i])
					sum = sum + a[i];
				else
					sum = a[i];
			} else {
				if (osum < sum)
					osum = sum;
				sum = 0;
			}
		}
		if (osum < sum)
			osum = sum;
		System.out.println(osum);
	}

	public static void main(String[] args) {
		int[] a = { 3, 4, 5, -4, 6 };
		int[] b = { 1, 8, 5 };
		Arrays.sort(a);
		Arrays.sort(b);
		findmax(a, b);
	}

}
