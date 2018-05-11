package sort;

import java.util.Scanner;

public class bubblesort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int m = a.length - 1;
		int c = a.length - 1;
		bs(a, m, c);
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j] + " ");
		}
	}

	public static void bs(int[] a, int m, int c) {
		if (m < 0) {
			return;
		}
		if (c <= 0) {
			return;
		}
		if (a[c - 1] >= a[c]) {
			int temp = a[c - 1];
			a[c - 1] = a[c];
			a[c] = temp;
		}
		bs(a, m, c - 1);
		bs(a, m - 1, c);
	}

}
