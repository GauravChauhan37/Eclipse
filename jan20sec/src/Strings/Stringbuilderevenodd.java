package Strings;

import java.util.Scanner;

public class Stringbuilderevenodd {

	public static void main(String[] args) {
		// even -1
		// odd +1
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		evenodd(s);
	}

	public static void evenodd(String s) {
		StringBuilder a = new StringBuilder(s);
		for (int i = 0, j = 1; i < a.length() - 1; i += 2, j += 2) {
			char ch = a.charAt(i);
			ch = (char) (ch + 1);
			a.setCharAt(i, ch);
			char c = a.charAt(j);
			c = (char) (c - 1);
			a.setCharAt(j, c);
		}
		if (a.length() % 2 != 0) {
			char ch = a.charAt(a.length() - 1);
			if (a.length() - 1 % 2 == 0) {
				ch = (char) (ch - 1);
			} else {
				ch = (char) (ch + 1);
			}
			a.setCharAt(a.length() - 1, ch);
		}
		System.out.print(a);
	}
}
