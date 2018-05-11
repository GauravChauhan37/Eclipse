package Backtracking;

public class perm {
	public static void persb2(StringBuilder ques, StringBuilder ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			ques.deleteCharAt(i);
			ans.append(ch);
			persb2(ques, ans);
			ans.deleteCharAt(ans.length() - 1);
			ques.insert(i, ch);
		}
	}

	public static void persb(StringBuilder ques, StringBuilder ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);
		ques.deleteCharAt(0);
		for (int i = 0; i <= ans.length(); i++) {
			ans.insert(i, ch);
			persb(ques, ans);
			ans.deleteCharAt(i);
		}
		ques.insert(0, ch);
	}

	public static void per(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = ques.charAt(0);
		ques = ques.substring(1);
		for (int i = 0; i <= ans.length(); i++) {
			String first = ans.substring(0, i);
			String rest = ans.substring(i);
			per(ques, first + ch + rest);
		}
	}

	public static void main(String[] args) {
		String s = "abc";
		// per(s, "");
		// persb(new StringBuilder(s), new StringBuilder());
		persb2(new StringBuilder(s), new StringBuilder());
	}

}
