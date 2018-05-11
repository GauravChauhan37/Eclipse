package recursion;

import java.util.Scanner;

public class findelementandreturnfirstelement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int data = sc.nextInt();
		int first = 0;
		int index = finddata(a, data, first);
		System.out.println(index);
	}

	public static int finddata(int[] a, int data, int first) {
		int index;
		if (first == a.length) {
			return -1;
		}
		if (a[first] == data) {
			return first;
		}
		index = finddata(a, data, first + 1);
		if (index != -1) {
			return index;
		} else {
			return -1;
		}
	}
}
