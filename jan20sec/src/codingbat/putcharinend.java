package codingbat;

import java.util.Scanner;

public class putcharinend {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char ch = sc.next().charAt(0);
		int i = sc.nextInt();
		String h = reposition(s, ch);
		System.out.println(h.charAt(i));
		System.out.println(h);
	}

	public static String reposition(String s, char ch) {
		if (s.equals("")) {
			return s;
		}
		if (s.charAt(0) == ch) {
			return reposition(s.substring(1), ch)+ch;
		} else {
			return s.charAt(0) + reposition(s.substring(1), ch);
		}
	}
}
