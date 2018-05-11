package Strings;

import java.util.Scanner;

public class togglechars {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringBuilder a = new StringBuilder();
		char c;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				c = (char) (s.charAt(i) + 'a' - 'A');
				a.append(c);
			} else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				c = (char) (s.charAt(i) + 'A' - 'a');
				a.append(c);
			}
		}
		System.out.println(a);
	}
}
