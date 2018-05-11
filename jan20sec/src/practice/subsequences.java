package practice;

import java.util.ArrayList;

public class subsequences {
	// with array list and with trees
	public static void main(String[] args) {
		String a = "abc";
		System.out.println(getss(a));
		getsswithtree("abc", "");
	}

	public static ArrayList<String> getss(String a) {
		if (a.length() == 0) {
			ArrayList<String> br = new ArrayList<String>();
			br.add("");
			return br;
		}
		char temp = a.charAt(0);
		String rest = a.substring(1);
		ArrayList<String> rresult = getss(rest);
		ArrayList<String> mresult = new ArrayList<String>();
		for (String s : rresult) {
			mresult.add(s);
			mresult.add(temp + s);
		}
		return mresult;
	}

	public static void getsswithtree(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		char temp = ques.charAt(0);
		String rest = ques.substring(1);
		getsswithtree(rest, ans);
		getsswithtree(rest, ans + temp);
	}
}