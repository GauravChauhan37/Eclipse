package recursion;

import java.util.ArrayList;

public class keypad {

	public static void main(String[] args) {
		String s = "501";
		ArrayList<String> ss = getss(s);
		System.out.println(ss);
	}

	static String[] codes = { "abc", "de", "fgh", "ijkl", "m", "nop", "qrs", "tuv", "wxyz", "." };

	public static ArrayList<String> getss(String s) {
		if (s.length() == 0) {
			ArrayList<String> br = new ArrayList<String>();
			br.add("");
			return br;
		}
		int temp = s.charAt(0);
		String rest = s.substring(1);
		ArrayList<String> rresult = getss(rest);
		ArrayList<String> mresult = new ArrayList<String>();
		for (String rstr : rresult) {
			for (int i = 0; i < codes[temp - '0'].length(); i++) {
				mresult.add(rstr + codes[temp - '0'].charAt(i));
			}
		}
		return mresult;
	}
}