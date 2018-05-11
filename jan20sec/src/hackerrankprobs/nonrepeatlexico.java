package hackerrankprobs;

import java.util.Arrays;
import java.util.Scanner;

public class nonrepeatlexico {
	static int count = 0;

	public static void per(String ques, String ans) {
		if (ques.length() == 0) {
			count++;
			return;
		}
		boolean[] check = new boolean[26];
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			if (check[ch - '0'] == false) {
				check[ch - '0'] = true;
				String first = ques.substring(0, i);
				String scnd = ques.substring(i + 1);
				per(first + scnd, ans + ch);
			}
		}
	}

	public static void perm(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		boolean[] check = new boolean[26];
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			if (check[ch - '0'] == false) {
				check[ch - '0'] = true;
				String first = ques.substring(0, i);
				String scnd = ques.substring(i + 1);
				perm(first + scnd, ans + ch);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char tempArray[] = s.toCharArray();
		Arrays.sort(tempArray);
		String r = new String(tempArray);
		per(r,"");
		System.out.println(count);
		perm(r, "");
	}

}
