package timenspacecomp;

import java.util.Scanner;

public class equipoint {
	public static int findep(int[] a) {
		int sum1 = a[0];
		int sum2 = a[a.length - 1];
		int i = 0, j = a.length - 1;
		while (i <= j) {
			if (sum1 == sum2 && i+2>=j) {
				return i + 1;
			} else {
				j--;
				i++;
				sum1 += a[i];
				sum2 += a[j];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int as = sc.nextInt();
		int[] a = new int[as];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		System.out.println(findep(a));
	}

}
