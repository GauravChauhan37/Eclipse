package codingbat;

import java.util.Scanner;

public class counthiwithoutx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int h = count(s);
		System.out.println(h);
	}

	public static int count(String s) {
		int c = 0;
		if (s.length() <= 2) {
			if (s.charAt(0) == 'h' && s.charAt(1) == 'i') {
				c++;
				return c;
			} else {
				return c;
			}
		}
		if (s.charAt(0) == 'h' && s.charAt(1) == 'i' && s.charAt(2) != 'x') {
			c++;
		}
		return c = c + count(s.substring(1));
	}
}
