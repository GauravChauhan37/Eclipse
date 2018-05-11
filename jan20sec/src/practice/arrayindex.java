package practice;

import java.util.Scanner;

public class arrayindex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int find = sc.nextInt();
		for (int i = 0; i < n; i++) {
			if (a[i] == find) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);
	}

}
