package Strings;

import java.util.Scanner;

public class removeduplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		rdup(s);
	}

	public static void rdup(String s) {
		StringBuilder a = new StringBuilder();
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) != s.charAt(i + 1)) {
				char ch = s.charAt(i);
				a.append(ch);
			}
		}
		a.append(s.charAt(s.length()-1));
		System.out.println(a);
	}

}
