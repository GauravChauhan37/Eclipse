package practice;

import java.util.Scanner;

public class mirrorinversefunction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			int some = sc.nextInt();
			a[i] = some;
		}
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			int some = sc.nextInt();
			b[i] = some;
		}
		inverse(a, b);
	}

	public static void inverse(int[] a, int[] b) {
		int[] rev = new int[b.length];
		for (int i = 0; i < a.length; i++) {
			rev[b[i]] = i;
		}
		boolean flag = false;
		for (int j = 0; j < a.length; j++) {
			if (rev[j] == a[j]) {
				flag = true;
			} else {
				flag = false;
			}
		}
		if (flag == true) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
