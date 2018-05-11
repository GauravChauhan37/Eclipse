package hackerrankprobs;

import java.util.Scanner;

public class printinparanthesis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringBuilder a = new StringBuilder("");
		StringBuilder c = pp(s, a);
		System.out.println(c);
	}

	public static StringBuilder pp(String s, StringBuilder a) {
		Boolean flag = false;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				flag = true;
				while (flag) {
					a.append(s.charAt(i));
					i++;
					if (s.charAt(i-1) == ')') {
						flag = false;
					}
				}
			}
		}
		return a;
	}
}
