package Strings;

import java.util.Scanner;

public class gapbtwtwochars {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		find(s);

	}

	public static void find(String s) {
		StringBuilder a = new StringBuilder();
		for (int i = 0; i < s.length() - 1; i++) {
			char ch = s.charAt(i);
			char chp = s.charAt(i + 1);
			int res = chp - ch;
			a.append(ch);
			a.append(res);
		}
		a.append(s.charAt(s.length() - 1));
		System.out.print(a);
	}

}
