package hackerrankprobs;

import java.util.Scanner;

public class twincount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuilder a = new StringBuilder("");
		System.out.println(count(s, 0, 0));
	}

	public static int count(String s, int i, int c) {
		if (i + 3 >= s.length()) {
			return c;
		}
		String g = s.substring(i, i + 3);
		if (g.charAt(0) == g.charAt(2) && g.charAt(0) != g.charAt(1)) {
			c++;
			return count(s, i + 3, c);
		} else {
			return count(s, i + 1, c);
		}
	}
}
