package recursion;

import java.util.Scanner;

public class inverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int index = 0;
		inverse(a, index);
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}
	}

	public static void inverse(int[] a, int index) {
		if (index == a.length) {
			return;
		}
		int temp = a[index];
		inverse(a, index + 1);
		a[temp]  = index;

	}
}
