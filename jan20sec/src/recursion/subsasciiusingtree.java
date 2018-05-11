package recursion;

public class subsasciiusingtree {

	public static void main(String[] args) {
		String s = "ab";
		getss(s, "");

	}

	public static void getss(String s, String a) {
		if (s.length() == 0) {
			System.out.println(a);
			return;
		}
		char ques = s.charAt(0);
		int temp = (int) (ques);
		String rest = s.substring(1);
		getss(rest, a);
		getss(rest, a + temp);
		getss(rest, a + ques);
	}
}
