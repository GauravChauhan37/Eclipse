package timenspacecomp;

import java.util.Scanner;

public class sort01 {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int[] a = new int[sc.nextInt()];
			for (int i = 0; i < a.length; i++) {
				a[i] = sc.nextInt();
			}
		int i = 0, j = a.length - 1;
		while (i <= j) {
			if (a[i] == 0) {
				i++;
			} else if (a[j] == 1) {
				j--;
			} else {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
		}
		for (int k = 0; k < a.length; k++) {
			System.out.print(a[k] + " ");
		}
	}

}
