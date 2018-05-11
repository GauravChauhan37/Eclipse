package timenspacecomp;

import java.util.Scanner;

public class findminmax {
	public static void findminmax(int[] a) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.print(max + ",");
		System.out.print(" " + min);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int not = sc.nextInt();
		while (not != 0) {
			int as = sc.nextInt();
			int[] arr = new int[as];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			findminmax(arr);
			System.out.println();
			not--;
		}
	}

}
