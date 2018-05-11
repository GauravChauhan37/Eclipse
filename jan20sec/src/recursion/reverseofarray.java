package recursion;

import java.util.Scanner;

public class reverseofarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int index = sc.nextInt();
		int start = 0;
		int last = a.length - 1;
		int [] c =reverse(a, start, last);
		for (int i = 0; i < n; i++) {
			System.out.print(c[i]+" ");
		}
		System.out.println();
		System.out.print(c[index]);
	}

	public static int[] reverse(int[] a, int start, int last) {
		if (start >= last) {
			return a;
		}
		int temp = a[start];
		a[start] = a[last];
		a[last] = temp;
		reverse(a, ++start, --last);
		return a;
	}
}
