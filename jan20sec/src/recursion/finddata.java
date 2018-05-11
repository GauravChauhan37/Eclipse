package recursion;

import java.util.Scanner;

public class finddata {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int data = sc.nextInt();
		int first = 0;

		boolean ans = find(a, data, first);
		if (ans) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

	public static boolean find(int[] a, int data, int first) {
		if (first == a.length) {
			return false;
		}
		if (a[first] == data) {
			return true;
		}
		boolean ans = find(a, data, ++first);
		if (ans == true) {
			return true;
		} else {
			return false;
		}
	}
}
