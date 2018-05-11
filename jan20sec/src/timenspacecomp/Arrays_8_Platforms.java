package timenspacecomp;

import java.util.Scanner;

public class Arrays_8_Platforms {
	public static void platform(int[] arr, int[] dept) {
		int i = 1, j = 0;
		int pc = 1;
		int oc = 0;
		while (i < arr.length) {
			if (arr[i] < dept[j]) {
				pc++;
				i++;
			} else if (arr[i] == dept[i]) {
				pc--;
			} else {
				j += pc;
				if (oc < pc) {
					oc = pc;
					i++;
				}
				pc = 1;
			}
		}
		if (oc < pc) {
			oc = pc;
		}
		System.out.println(oc);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int as = sc.nextInt();
		int[] a = new int[as];
		int[] b = new int[as];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < b.length; i++) {
			b[i] = sc.nextInt();
		}
		sc.close();
		platform(a, b);
	}

}
