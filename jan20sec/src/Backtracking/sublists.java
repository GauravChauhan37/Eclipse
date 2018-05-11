package Backtracking;

public class sublists {

	public static void main(String[] args) {
		sublist("jbms", "");
	}

	public static void sublist(String ques, String ans) {
		if (ques.equals("")) {
			System.out.println(ans);
			return;
		}
		char temp = ques.charAt(0);
		ques = ques.substring(1);
		sublist(ques, ans);
		sublist(ques, ans + temp);
	}
}
