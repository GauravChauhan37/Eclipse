package hackerrankprobs;

import java.util.Scanner;

public class replacehiwithpep {
	public static void main(String[] args) {
		int i;
		String s;
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder("");
		s = sc.next();
		i = sc.nextInt();

		StringBuilder a = removeHi(s, false, sb, 0);

		System.out.println(a.charAt(i));
		System.out.println(a);

	}

	public static StringBuilder removeHi(String s, boolean c, StringBuilder sb, int index) {

		if (index + 1 >= s.length()) {
			if ((s.charAt(s.length() - 2) == 'h' && s.charAt(s.length() - 1) == 'i')) {
				return sb;
			} else {
				sb.append(s.charAt(s.length() - 1));
				return sb;
			}

		}
		if (s.charAt(index) == 'h' && s.charAt(index + 1) == 'i') {
			sb.append("pep");
			c = true;
			return removeHi(s, c, sb, index + 1);
		} else if (s.charAt(index) == 'i' && c == true) {
			c = false;
			return removeHi(s, c, sb, index + 1);
		} else {
			sb.append(s.charAt(index));
			return removeHi(s, false, sb, index + 1);
		}
	}

}
