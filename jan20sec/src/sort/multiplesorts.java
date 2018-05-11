package sort;

import java.util.Scanner;

public class multiplesorts {
	public static void ss(int[] a, int n, int index) {
		if (index == n)
			return;
		int k = findmin(a, index, n - 1);
		if (k != index) {
			int temp = a[k];
			a[k] = a[index];
			a[index] = temp;
		}
		ss(a, n, index + 1);
	}

	public static int findmin(int[] a, int i, int j) {
		if (i == j) { // if they both are equal return i
			return i;
		}
		int k = findmin(a, i + 1, j); // inc i and call again
		return (a[i] < a[k]) ? i : k; // this will return min of k and i to
										// upper call
	}

	public static void reverseis(int[] a, int first, int last) {
		if (first == a.length - 1) {
			return;
		}
		if (first == last) {
			return;
		}
		if (a[first] < a[last]) {
			int temp = a[first];
			a[first] = a[last];
			a[last] = temp;
		}
		reverseis(a, first, --last);
		reverseis(a, first + 1, a.length - 1);
	}

	public static void bubble(int[] a, int first, int last) {
		if (first == last) {
			return;
		}
		if (first == a.length - 1) {
			return;
		}
		if (a[first] > a[last]) {
			int temp = a[first];
			a[first] = a[last];
			a[last] = temp;
		}
		bubble(a, first, --last);
		bubble(a, first + 1, a.length - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a1 = new int[n];
		for (int i = 0; i < a1.length; i++) { // bubblesort inc
			a1[i] = sc.nextInt();
		}
		int[] a2 = new int[n];
		for (int i = 0; i < a2.length; i++) { // rev insertion sort
			a2[i] = sc.nextInt();
		}
		int[] a3 = new int[n];
		for (int i = 0; i < a3.length; i++) { // selection inc
			a3[i] = sc.nextInt();
		}
		sc.close();
		bubble(a1, 0, a1.length - 1);
		for (int i = 0; i < a1.length; i++) {
			System.out.print(a1[i] + " ");
		}
		System.out.println();
		reverseis(a2, 0, a2.length - 1);
		for (int i = 0; i < a2.length; i++) {
			System.out.print(a2[i] + " ");
		}
		System.out.println();
		ss(a3, a3.length, 0);
		for (int i = 0; i < a3.length; i++) {
			System.out.print(a3[i] + " ");
		}
	}

}
