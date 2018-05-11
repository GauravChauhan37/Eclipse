package searchingandsortingarrays;

public class mergearrayofdiiffsizes {
	// target tc = O(m+n)
	// Merge an array of size n into another array of size m+n
	public static void moveToEnd(int a[], int size) {
		int i;
		int j = size - 1;
		for (i = size - 1; i >= 0; i--) {
			if (a[i] != -1) {
				a[j] = a[i];
				j--;
			}
		}
	}

	private static void merge(int[] a, int[] b, int m, int n) {
		int i = n;
		int j = 0;
		int k = 0;
		while (k < a.length) {
			if (i < a.length && a[i] < b[j]) {
				a[k] = a[i];
				i++;
				k++;
			} else {
				a[k] = b[j];
				k++;
				j++;
			}
		}
	}

	public static void main(String[] args) {
		int mPlusN[] = { 2, 8, -1, -1, -1, 13, -1, 15, 20 };
		// 2 5 7 8 9 13 15 20 25 --> exp output
		int N[] = { 5, 7, 9, 25 };
		int n = N.length;
		int m = mPlusN.length;
		moveToEnd(mPlusN, m);
		merge(mPlusN, N, m, n);
		for (int val : mPlusN) {
			System.out.print(val + " ");
		}
		System.out.println();
	}
}
