package practice;

import java.util.ArrayList;

public class keypad {

	public static void main(String[] args) {
		String s = "501";
		System.out.println(keypadd(s));
		keypaddwithtrees(s, "");
	}

	static String[] codes = { "abc", "de", "fgh", "ijkl", "m", "nop", "qrs", "tuv", "wxyz", "." };

	public static ArrayList<String> keypadd(String s) {
		if (s.length() == 0) {
			ArrayList<String> br = new ArrayList<String>();
			br.add("");
			return br;
		}
		char temp = s.charAt(0);
		String rest = s.substring(1);
		ArrayList<String> rresult = keypadd(rest);
		ArrayList<String> mresult = new ArrayList<String>();
		for (String h : rresult) {
			String ch = codes[temp - '0'];
			for (int i = 0; i < ch.length(); i++) {
				mresult.add(h + ch.charAt(i));
			}
		}

		return mresult;
	}

	public static void keypaddwithtrees(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		char temp = ques.charAt(0);
		String rest = ques.substring(1);
		String code = codes[temp - '0'];
		for (int i = 0; i < code.length(); i++) {
			char ch = code.charAt(i);
			keypaddwithtrees(rest, ans + ch);
		}
	}
}
