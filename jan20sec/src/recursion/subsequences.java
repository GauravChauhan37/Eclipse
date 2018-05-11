package recursion;

import java.util.ArrayList;

public class subsequences {

	public static void main(String[] args) {
		ArrayList<String> ss = getss("ab");
		System.out.println(ss);

	}

	public static ArrayList<String> getss(String s) {
		if (s.length() == 0) {
			ArrayList<String> br = new ArrayList<String>();
			br.add("");
			return br;
		}
		char ch = s.charAt(0);
		int next = (int) ch;
		String ros = s.substring(1);
		ArrayList<String> rresult = getss(ros);
		ArrayList<String> mresult = new ArrayList<String>();
		for (String r : rresult) {
			mresult.add(r);
			mresult.add(next + r);
			mresult.add(ch + r);
		}
		return mresult;
	}
}
