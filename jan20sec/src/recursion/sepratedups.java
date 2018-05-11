package recursion;

import java.util.Scanner;

public class sepratedups {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String d = sc.next();
		int i = 0;
		int index = sc.nextInt();
		StringBuilder b = new StringBuilder();
		StringBuilder s = new StringBuilder(d);
		StringBuilder c = sepratedups(s, b, i);
		c.append(s.charAt(s.length() - 1));
		System.out.println(b.charAt(index));
		System.out.println(b);
	}

	public static StringBuilder sepratedups(StringBuilder a, StringBuilder b, int i) {
		if (i == a.length() - 1) {
			return b;
		}
		if (a.charAt(i) != a.charAt(i + 1)) {
			b.append(a.charAt(i));
		} else {
			b.append(a.charAt(i));
			b.append('*');
		}
		sepratedups(a, b, i + 1);

		return b;
	}
}