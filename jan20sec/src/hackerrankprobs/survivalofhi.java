package hackerrankprobs;

import java.util.Scanner;

public class survivalofhi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int index = sc.nextInt();
		int c = 0, n = 0;
		System.out.println(count(s, c, n));
		StringBuilder g = new StringBuilder(s);
		remove(g, n = 0);
			System.out.println(g.charAt(index));
			System.out.println(g);
	}

	public static int count(String s, int c, int n) {
		if (n == s.length() - 1) {
			return c;
		}
		if (s.charAt(n) == 'h' && s.charAt(n + 1) == 'i') {
			c++;
		}
		int p = count(s, c, n + 1);
		return p;
	}

	public static void remove(StringBuilder s, int n) {
		if (n >= s.length() - 1) {
			return;
		}
		if (s.length() == 2) {
			if (s.charAt(n) == 'h' && s.charAt(n + 1) == 'i') {
				s.delete(n, n + 2);
				return;
			}
		}
		if (s.charAt(n) == 'h' && s.charAt(n + 1) == 'i') {
			s.delete(n, n + 2);
			remove(s, n);
		} else {
			remove(s, n + 1);
		}
	}
}
