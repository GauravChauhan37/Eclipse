package recursion;

import java.util.Scanner;

public class palindromestring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int first = 0;
		int last = s.length() - 1;
		if (isPalindrome(s, first, last)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	public static boolean isPalindrome(String s, int first, int last) {
		if (first >= last) {
			return true;
		}
		if (s.charAt(first) != s.charAt(last)) {
			return false;
		} else {
			first++;
			last--;
		}
		isPalindrome(s, first, last);
		return true;
	}
}