package hackerrankprobs;

import java.util.Scanner;

public class checkrevstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String n = sc.nextLine();
		int i = 0;
		if (s.length() != n.length()) {
			System.out.println("false");
			return;
		}
		if (checkrev(s, n, i)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	public static Boolean checkrev(String s, String n, int i) {
		if (i == s.length()) {
			return true;
		}
		int temp = s.charAt(i);
		Boolean check = checkrev(s, n, i + 1);
		if (temp != n.charAt(s.length() - 1 - i)) {
			return false;
		}
		if (check) {
			return true;
		} else {
			return false;
		}
	}

}
