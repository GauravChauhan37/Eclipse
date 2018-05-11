package hackerrankprobs;

import java.util.ArrayList;
import java.util.Scanner;

public class permutstring {
	public static int fact(int n) {
		if (n == 0) {
			return 1;
		}
		int something = n * fact(n - 1);
		return something;
	}

	public static void gets(StringBuilder ques, StringBuilder ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			ques.deleteCharAt(i);
			ans.append(ch);
			gets(ques, ans);
			ans.deleteCharAt(ans.length() - 1);
			ques.insert(i, ch);
		}
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
				mresult.add(p.toString());
			}
		}
		return mresult;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		System.out.println(fact(s.length()));
		ArrayList<String> mresult = getss(s);
		System.out.println(mresult);
		gets(new StringBuilder(s), new StringBuilder(""));

	}
}
