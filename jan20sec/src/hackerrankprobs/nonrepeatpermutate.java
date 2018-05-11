package hackerrankprobs;

import java.util.Scanner;

public class nonrepeatpermutate {
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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		gets(new StringBuilder(s), new StringBuilder(""));
	}

}
