package hackerrankprobs;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class passwordstrengthchecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count = s.length();
		int r = 6 - count;
		boolean check = checklength(s, count);
		if (check) {
			boolean e = checkelse(s);
			if (e) {
				System.out.println("password accepted");
			}
		} else {
			System.out.println("add more alph" + " " + r); // 6 -count
		}
	}

	public static Boolean checklength(String s, int r) {
		for (int i = 0; i < 6; i++) {
			r--;
		}
		if (r < 0) {
			return false;
		} else {
			return true;
		}
	}

	public static Boolean checkelse(String s) {
		int flag = 0;
		for (int i = 0; i < s.length(); i++) { // checkfordigits
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("add a digit");
		}
		flag = 0;
		for (int j = 0; j < s.length(); j++) { // checkforlowercase
			if (s.charAt(j) >= 'a' && s.charAt(j) <= 'z') {
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("add a lowercase alphabet");
		}
		flag = 0;
		for (int j = 0; j < s.length(); j++) { // check for uppercase
			if (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') {
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("add a uppercase alphabet");
		}
		flag = 0;
		for (int j = 0; j < s.length(); j++) { // check for specialcharacter
			if (s.charAt(j) >= '!' && s.charAt(j) <= '/') {
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println("add a special character");
		}
		if (flag == 0) {
			return false;
		} else {
			return true;
		}
	}

}
