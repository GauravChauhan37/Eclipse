package practice;

import java.util.Scanner;

public class seg0and1 {
	public static void segg(int[] a) {
		int start = 0;
		int end = a.length - 1;
		while (start <= end) {
			if (a[start] == 0) {
				start++;
			} else if (a[end] == 1) {
				end--;
			} else {
				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;
				start++;
				end--;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int not = sc.nextInt();
		while (not != 0) {
			int as = sc.nextInt();
			int[] a = new int[as];
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}
			segg(a);
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
			not--;
		}
	}

}
