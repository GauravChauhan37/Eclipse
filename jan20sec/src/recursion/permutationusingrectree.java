package recursion;

public class permutationusingrectree {

	public static void main(String[] args) {
		String s = "abc";
		getss(s, "");
	}

	public static void getss(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		char temp = ques.charAt(0);
		String rest = ques.substring(1);
		for (int i = 0; i <= ans.length(); i++) {
			StringBuilder bs = new StringBuilder(ans);
			bs.insert(i, temp);
			getss(rest, bs.toString());
		}
	}
}
