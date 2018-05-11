package recursion;

import java.util.Scanner;

public class sortarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int b = 0;
		System.out.println(checksort(a, b));
	}

	public static boolean checksort(int[] a, int index) {
		if (index >= a.length - 1) {
			return true;
		}
		if (a[index] > a[index + 1]) {
			return false;
		}
		boolean check = checksort(a, index + 1);
		if (check == false) {
			return false;
		} else {
			return true;
		}
	}

}
