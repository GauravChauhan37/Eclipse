package practice;

import java.util.Scanner;

public class recursivelinearsearch {

	public static void ls(int[] a, int item, int n) {
		if (n == a.length - 1) {
			System.out.println("item not found");
			return;
		}
		if (item == a[n]) {
			System.out.println("item is at index" + " " + n);
			return;
		}
		ls(a, item, n + 1);
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 2143, 12, 421, 3, 23, 124, 1, 25, 34, 2, 432, 45, 325, 32, 5 };
		Scanner sc = new Scanner(System.in);
		int item = sc.nextInt();
		int n = 0;
		ls(a, item, n);
	}
}