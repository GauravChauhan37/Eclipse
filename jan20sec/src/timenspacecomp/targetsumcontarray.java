package timenspacecomp;

import java.util.Scanner;

public class targetsumcontarray {
	public static void findsubarr(int[] a, int targetSum) {
		int start = 0;
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
			while (sum > targetSum && start <= i - 1) {
				sum = sum - a[start];
				start++;
			}
			if (sum == targetSum) {
				for (int j = start; j <= i; j++) {
					System.out.print(a[j] + " ");
				}
				return;
			}
		}
		System.out.println("Not found");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int as = sc.nextInt();
		int targetSum = sc.nextInt();
		int[] a = new int[as];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		findsubarr(a, targetSum);
	}

}
