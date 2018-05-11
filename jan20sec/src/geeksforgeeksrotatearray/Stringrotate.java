package geeksforgeeksrotatearray;

import java.util.Scanner;

public class Stringrotate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(checkrotate(s));
	}

	public static int checkrotate(String s) {
		String b = s + s;
		for (int i = 1; i <= s.length(); i++) {
			String c = b.substring(i, i + s.length());
			if (s.equals(c))
				return i;
		}
		return -1;
	}
}
