package recursion;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int first = 0;
		int last = a.length - 1;
		if (isPalindrome(a, first, last)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	public static boolean isPalindrome(int[] a, int first, int last) {
		if (first >= last) {
			return true;
		}
		if (a[first] != a[last]) {
			return false;
		} else {
			first++;
			last--;
		}
		isPalindrome(a, first, last);
		return true;
	}
}
