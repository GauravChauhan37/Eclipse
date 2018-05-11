package timenspacecomp;

import java.util.Arrays;
import java.util.Scanner;

public class hasDups {
	public static boolean finddups(int[] a) {
		Arrays.sort(a);
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] == a[i + 1]) {
				return true;
			}
		}
		return false;
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
			System.out.println(finddups(arr));
			not--;
		}
	}

}
