package hackerrankprobs;

import java.util.Scanner;

public class balancedparenthesis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(check(s, 0, s.length() - 1));
	}

	public static Boolean check(String s, int first, int last) {
		if (first >= last) {
			return false;
		}
		Boolean ans = isMatchingPair(s.charAt(first), s.charAt(last));
		check(s, ++first, --last);
		if (ans) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isMatchingPair(char character1, char character2) {
		if (character1 == '(' && character2 == ')')
			return true;
		else if (character1 == '{' && character2 == '}')
			return true;
		else if (character1 == '[' && character2 == ']')
			return true;
		else
			return false;
	}
}