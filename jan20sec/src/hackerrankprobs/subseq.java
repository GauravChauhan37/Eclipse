package hackerrankprobs;

import java.util.ArrayList;
import java.util.Scanner;

public class subseq {
	public static int count(String s, int count) {
		if (s.length() % 2 != 0)
			count = s.length() * s.length() - 1;
		if (s.length() % 2 == 0)
			count = s.length() * s.length();
		return count;
	}

	public static ArrayList<String> getsub(String s) {
		if (s.length() == 0) {
			ArrayList<String> br = new ArrayList<String>();
			br.add("");
			return br;
		}
		char ch = s.charAt(0);
		String rest = s.substring(1);
		ArrayList<String> rresult = getsub(rest);
		ArrayList<String> mresult = new ArrayList<String>();
		for (String rstr : rresult) {
			mresult.add(rstr);
			mresult.add(rstr + ch);
		}
		return mresult;
	}

	public static void sswithstring(String s, String ans) {
		if (s.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = s.charAt(0);
		s = s.substring(1);
		sswithstring(s, ans);
		sswithstring(s, ans + ch);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		System.out.println(count(s, 0));
		ArrayList<String> al = getsub(s);
		System.out.println(al);
		sswithstring(s, "");
	}

}
