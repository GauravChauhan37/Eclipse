package Strings;

import java.util.Scanner;

public class Subsequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		subsequences(s);

	}

	public static void subsequences(String s) {

		int[] rems;
		rems = new int[s.length()];
		for (int i = 0; i < (1 << s.length()); i++) {
			int temp = i;
			int r = rems.length - 1;
			for (int j = 0; j < rems.length; j++) {

				int rem = temp % 2;
				temp = temp / 2;

				rems[(rems.length) - 1 - j] = rem;

			}

			for (int k = 0; k < s.length(); k++) {

				if (rems[k] == 1) {

					System.out.print(s.charAt(k));
				} else {
					System.out.print("");
				}
			}

			System.out.println();
		}

	}

}
