package Backtracking;

import java.util.ArrayList;
import java.util.Scanner;

public class permutateastring {
	public static void permute(String s, String ans) {
		if (s.length() == 0) {
			System.out.println(ans);
			return;
		}
		char first = s.charAt(0);
		String rest = s.substring(1);
		for (int i = 0; i <= ans.length(); i++) {
			StringBuilder sb = new StringBuilder(ans);
			sb.insert(i, first);
			permute(rest, sb.toString());
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		permute(s, "");
	}

}
