package sort;

import java.util.Scanner;

public class ssiterative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int min = 0;
		int[] c = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			min = a[i];
			for (int j = i; j < a.length - 1; j++) {
				// find min
				if (a[j + 1] < min) {
					min = a[j + 1];
					// swap the var used for min
					int temp = a[j + 1];
					a[j + 1] = a[i];
					a[i] = temp;
				}
			}
			c[i] = min;

		}
		for (int k = 0; k < a.length; k++) {
			System.out.print(c[k]+" ");
		}
	}

}
