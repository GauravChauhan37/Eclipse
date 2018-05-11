package hackerrankprobs;

import java.util.ArrayList;
import java.util.Scanner;

public class nokiakeypad {
	static String[] codes = { "", "abc", "def", "ghi", "jkl", "mno", "pqr", "stu", "vw", "wxyz", "." };

	public static void keypads(String ques, String ans) {
		if (ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		int temp = ques.charAt(0);
		String rest = ques.substring(1);
		String sc = codes[temp - '0'];
		for (int i = 0; i < sc.length(); i++) {
			char next = sc.charAt(i);
			keypads(rest, ans + next);
		}
	}

	public static ArrayList<String> getss(String s) {
		if (s.length() == 0) {
			ArrayList<String> br = new ArrayList<String>();
			br.add("");
			return br;
		}
		int temp = s.charAt(0);
		String rest = s.substring(1);
		ArrayList<String> rresult = getss(rest);
		ArrayList<String> mresult = new ArrayList<String>();
		for (String rstr : rresult) {
			for (int i = 0; i < codes[temp - '0'].length(); i++) {
				mresult.add(codes[temp - '0'].charAt(i)+rstr);
			}
		}
		return mresult;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		ArrayList<String> kill = getss(s);
		System.out.println(kill.size());
		System.out.println(kill);
		keypads(s, "");
	}

}
