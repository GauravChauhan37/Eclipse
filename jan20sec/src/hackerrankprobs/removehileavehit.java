package hackerrankprobs;

import java.util.Scanner;

public class removehileavehit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int i = sc.nextInt();
		StringBuilder a = new StringBuilder("");
		System.out.println(count(s, 0, 0));
		StringBuilder c = removehi(s, 0, a, false);
		System.out.println(c.charAt(i));
		System.out.println(c);
	}

	public static int count(String s, int i, int c) {
		if (i + 2 >= s.length()) {
			if (s.charAt(s.length() - 2) == 'h' && s.charAt(s.length() - 1) == 'i') {
				c++;
				return c;
			} else {
				return c;
			}
		}
		if (s.charAt(i) == 'h' && s.charAt(i + 1) == 'i' && s.charAt(i + 2) != 't') {
			c++;
		}
		int ans = count(s, i + 1, c);
		return ans;
	}

	public static StringBuilder removehi(String s, int i, StringBuilder a, Boolean flag) {
		if (i + 2 >= s.length()) {
			if (s.charAt(s.length() - 2) == 'h' && s.charAt(s.length() - 1) == 'i') {
				return a;
			} else {
				a.append(s.charAt(s.length() - 2));
				a.append(s.charAt(s.length() - 1));
				return a;
			}
		}
		if (s.charAt(i) == 'h' && s.charAt(i + 1) == 'i' && s.charAt(i + 2) != 't') {
			flag = true;
			removehi(s, i + 1, a, flag);
		} else if (s.charAt(i) == 'i' && s.charAt(i + 1) != 't' && flag == true) {
			flag = false;
			removehi(s, i + 1, a, flag);
		} else {
			a.append(s.charAt(i));
			removehi(s, i + 1, a, flag);
		}
		return a;
	}
}