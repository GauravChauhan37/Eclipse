package hackerrankprobs;

import java.util.Scanner;

public class replacehileavehit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int i = sc.nextInt();
		StringBuilder a = new StringBuilder("");
		StringBuilder c = replacehi(s, 0, a, false);
		System.out.println(c.charAt(i));
		System.out.println(c);

	}

	public static StringBuilder replacehi(String s, int i, StringBuilder a, Boolean flag) {
		if (i + 2 >= s.length()) {
			if (s.charAt(s.length() - 2) == 'h' && s.charAt(s.length() - 1) == 'i') {
				a.append("pep");
				return a;
			} else {
				a.append(s.charAt(s.length() - 2));
				a.append(s.charAt(s.length() - 1));
				return a;
			}
		}
		if (s.charAt(i) == 'h' && s.charAt(i + 1) == 'i' && s.charAt(i + 2) != 't') {
			a.append("pep");
			flag = true;
			replacehi(s, i + 1, a, flag);
		} else if ((s.charAt(i) == 'i' && s.charAt(i + 1) != 't' && flag == true)) {

			flag = false;
			replacehi(s, i + 1, a, flag);
		} else {
			a.append(s.charAt(i));
			replacehi(s, i + 1, a, flag);
		}
		return a;
	}
}
