package practice;

import java.util.ArrayList;

public class permutations {

	public static void main(String[] args) {
	//	String s = "abcd";
		//System.out.println("\n" + perm(s));
		//System.out.println();
		//permwithtree(new StringBuilder("abc"), new StringBuilder());
		//System.out.println();
		permwithtree2("abc", "");
	}

	public static ArrayList<String> perm(String s) {
		if (s.length() == 0) {
			ArrayList<String> br = new ArrayList<String>();
			br.add("");
			return br;
		}
		char temp = s.charAt(0);
		String rest = s.substring(1);
		ArrayList<String> rresult = perm(rest);
		ArrayList<String> mresult = new ArrayList<String>();
		for (String rstr : rresult) {
		//	System.out.println(rstr); // jtu //it is picking strings from
										// arraylist one by one
			for (int i = 0; i <= rstr.length(); i++) { // by picking that string
														// in rstr, we are
														// inserting
				// character in temp at diff positions in rstr
				StringBuilder sb = new StringBuilder(rstr);
				sb.insert(i, temp);
				// finally storing it in mresult
				mresult.add(sb.toString());
			}
		}
		return mresult;
	}

	public static void permwithtree(StringBuilder ques, StringBuilder ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		char temp = ques.charAt(0);
		String rest = ques.substring(1);
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			ques.deleteCharAt(i);
			ans.append(ch);
			permwithtree(ques, ans);
			ans.deleteCharAt(ans.length() - 1);
			ques.insert(i, ch);
		}
	}

	public static void permwithtree2(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		char temp = ques.charAt(0);
		String rest = ques.substring(1);
		for (int i = 0; i <= ans.length(); i++) {
			StringBuilder sb = new StringBuilder(ans);
			sb.insert(i, temp);
			permwithtree2(rest, sb.toString());
		}
	}
}
