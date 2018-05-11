package Strings;

import java.util.Scanner;

public class substring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int start = s.charAt(0);
		int end = s.charAt(s.length() - 1);
		for (start = 0; start < s.length() ; start++) {
			for (end = start; end <= s.length(); end++) {
				System.out.print(s.substring(start, end)+" ");
			}
		}
	}

}
