package timenspacecomp;

import java.util.Scanner;

public class Max_sum_increasing_subsequence {
	public static void findsubs(int[] a) {
		int[] cost = new int[a.length];
		// String[] path = new String[a.length];
		cost[0] = a[0];
		for (int i = 1; i < a.length; i++) {
			for (int j = 0; j < i; j++) {
				if (a[j] < a[i]) {
					if (cost[j] > cost[i]) {
						cost[i] = cost[j];
					}
				}
			}
			cost[i] = cost[i] + a[i];
		}
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < cost.length; i++) {
			if (a[i] > max) {
				max = cost[i];
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int as = sc.nextInt();
		int[] a = new int[as];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		findsubs(a);
	}

}
