package recursion;

import java.util.ArrayList;

public class permutation {

	public static void main(String[] args) {
		String s = "abc";
		ArrayList<String> ss = getss(s);
		System.out.println(ss);
	}

	public static ArrayList<String> getss(String s) {
		if (s.length() == 0) {
			ArrayList<String> br = new ArrayList<String>();
			br.add("");
			return br;
		}
		char temp = s.charAt(0);
		String rest = s.substring(1);
		ArrayList<String> rresult = getss(rest);
		ArrayList<String> mresult = new ArrayList<String>();
		for (String rstr : rresult) {
			for (int i = 0; i <= rstr.length(); i++) {
				StringBuilder p = new StringBuilder(rstr);
				p.insert(i, temp);
				System.out.println(p); // jtu
				mresult.add(p.toString());
			}
		}
		return mresult;
	}
}
