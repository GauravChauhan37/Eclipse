package hackerrankprobs;

import java.util.Scanner;

public class distinctperms {
	static int count = 0;

	public static void count(String s, String ans) {
		if (s.length() == 0) {
			count++;
			return;
		}

		boolean[] dups = new boolean[26];
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (dups[ch - 'a'] == false) {
				dups[ch - 'a'] = true;
				String first = s.substring(0, i);
				String scnd = s.substring(i + 1);
				count(first + scnd, ans + ch);
			}
		}
	}

	public static void perm(String s, String ans) {
		if (s.length() == 0) {
			System.out.println(ans);
			return;
		}

		boolean[] dups = new boolean[26];
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (dups[ch - 'a'] == false) {
				dups[ch - 'a'] = true;
				String first = s.substring(0, i);
				String scnd = s.substring(i + 1);
				perm(first + scnd, ans + ch);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		count(s, "");
		System.out.println(count);
		perm(s, "");
	}

}
