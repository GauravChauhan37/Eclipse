package timenspacecomp;

import java.util.Scanner;

public class Zigzag_array {
	public static void zigzag(int[] a) {
		int i = 0;
		boolean flash = false;
		while (i < a.length - 1) {
			if (a[i] > a[i + 1] && flash == false) {
				int temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;
				i++;
			} else if (a[i] < a[i + 1] && flash == true) {
				int temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;
				i++;
			} else {
				i++;
			}
			flash = !flash;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int as = sc.nextInt();
		int[] a = new int[as];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		zigzag(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

}
