package practice;

import java.util.Scanner;

public class sumofatwoarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(maxarray(a));
	}

	public static int maxarray(int a[]) {
		int temp = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > temp) {
				temp = a[i];
			}
		}
		return temp;
	}

}
