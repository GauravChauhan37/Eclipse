package recursion;

import java.util.Scanner;

public class returnallindexes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int data = sc.nextInt();
		int index =sc.nextInt();
		int first = 0;
		int count = 0;
		int[] any = finddata(a, data, first, count);
		for (int i = 0; i < any.length; i++) {
			if(i == index)
			System.out.println(any[i]);
		}
	}

	public static int[] finddata(int[] a, int data, int first, int count) {
		if (first == a.length) {
			int[] b = new int[count];
			return b;
		}
		if (a[first] == data) {
			count++;
		}
		int[] c = finddata(a, data, first + 1, count);
		if (a[first] == data) {
			c[count - 1] = first;
		}
		return c;
	}
}
