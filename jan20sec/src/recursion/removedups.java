package recursion;

import java.util.Scanner;

public class removedups {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuilder a = new StringBuilder();
		int i = 0;
		int index = sc.nextInt();
		StringBuilder b = rdups(s, a, i);
		b.append(s.charAt(s.length() - 1));
		System.out.println(b.charAt(index));
		System.out.println(b);
	}

	public static StringBuilder rdups(String s, StringBuilder a, int i) {
		if (i == s.length() - 1) {
			return a;
		}
		if (s.charAt(i) != s.charAt(i + 1)) {
			a.append(s.charAt(i));
		}
		rdups(s, a, i + 1);
		return a;
	}
}
