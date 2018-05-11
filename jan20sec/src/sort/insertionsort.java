package sort;

import java.util.Scanner;

public class insertionsort {

	public static void is(int[] a, int m) {
		if (m == a.length - 1) {
			return;
		}
		if (a[m] > a[m + 1]) {
			swap(a, m);
		}
		is(a, m + 1);
	}

	public static void swap(int[] a, int h) {
		if (h < 0) {
			return;
		}
		if (a[h] > a[h + 1]) {
			int temp = a[h];
			a[h] = a[h + 1];
			a[h + 1] = temp;
		}
		swap(a, h - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int m = 0;
		is(a, m);
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + " ");
		}
	}
}
