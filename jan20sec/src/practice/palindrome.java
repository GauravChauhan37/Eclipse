package practice;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String g = sc.nextLine();
		String s = g.toLowerCase();

		boolean ans = isPalindrome(s);
		if (ans) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	public static boolean isPalindrome(String s) {
		String reverse = rev(s);
		if (s.equals(reverse)) {
			return true;
		} else {
			return false;
		}
	}

	public static String rev(String s) {
		String reverse = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
		}
		return reverse;

	}
}