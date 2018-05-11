package hackerrankprobs;

import java.util.Scanner;

public class makeastringalternate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		alterit(s);
	}

	public static void alterit(String s) {
		char ch = ' ';
		StringBuilder a = new StringBuilder(s);
		for (int i = 0; i < a.length() - 1; i++) {
			if (a.charAt(i) == a.charAt(i + 1)) {
				ch = a.charAt(i);
			}
			for (int j = 0; j < a.length(); j++) {
				if (a.charAt(j) == ch) {
					a.deleteCharAt(j);
				}
			}
		}
		System.out.println(a);
	}

}
