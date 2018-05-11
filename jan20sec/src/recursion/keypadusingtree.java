package recursion;

import java.util.ArrayList;

public class keypadusingtree {

	public static void main(String[] args) {
		String s = "501";
		getss(s, "");
	}

	static String[] codes = { "abc", "de", "fgh", "ijkl", "m", "nop", "qrs", "tuv", "wxyz", "." };

	public static void getss(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		int temp = ques.charAt(0);
		String rest = ques.substring(1);
		String sc = codes[temp - '0'];
		for (int i = 0; i < sc.length(); i++) {
			char next = sc.charAt(i);
			getss(rest, ans + next);
		}

	}
}
