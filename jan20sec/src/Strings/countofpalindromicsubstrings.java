package Strings;

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class countofpalindromicsubstrings {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		substring(s);

	}

	public static void substring(String s) {
		// TODO Auto-generated method stub
		int ctr = 0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				String sub = s.substring(i, j);
				boolean ans = palindrome(sub);
				if (ans == true)
					ctr++;
			}
		}
		System.out.println(ctr);
	}

	public static boolean palindrome(String s) {
		// TODO Auto-generated method stub\

		for (int i = 0, j = s.length() - 1; i <= s.length() / 2; j--, i++) {
			if (s.charAt(i) == s.charAt(j)) {
				System.out.println(s);
				return true;
			} else {
				break;
			}

		}
		return false;
	}

}