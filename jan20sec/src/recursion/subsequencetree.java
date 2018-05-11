package recursion;

import java.util.ArrayList;

public class subsequencetree {

	public static void main(String[] args) {
		String s = "abc";
		getss(s, "");

	}

	public static void getss(String s, String a) {
		if (s.length() == 0) {
			System.out.println(a);
			return;
		}
		char ques = s.charAt(0);
		String rest = s.substring(1);
		getss(rest, a);
		getss(rest, a + ques);
	}
}
