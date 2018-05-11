package Strings;

import java.util.Scanner;

public class mostfreqoccuringchar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		// mostocc
		most(s);
	}

	public static void most(String s) {
		int count = 0;
		char maxelement = ' '; 
		int maxcount = 0;
		char element = ' ';
		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
					element = s.charAt(i);
				}
				if (count > maxcount) {
					maxcount = count;
					maxelement = element;
				}
			}
			count = 0;
		}
		System.out.println(maxelement + " " + maxcount);
	}
}
