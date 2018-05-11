package hackerrankprobs;

import java.util.Scanner;

public class printallposscodes {
	public static void print(String s, String ans) {
		if (s.length() == 0) {
			System.out.println(ans);
			return;
		}
		String sub1 = s.substring(0, 1);
		char ch = (char) (Integer.parseInt(sub1) + 'a' - 1);
		print(s.substring(1), ans+ch+" ");
		if (s.length() >= 2) {
			String s1 = s.substring(0, 2);
			if (Integer.parseInt(s1) <= 26 && Integer.parseInt(s1) >= 10) {
				char ch2 = (char) (Integer.parseInt(s1) + 'a' - 1);
				s = s.substring(2);
				print(s, ans + ch2 + " ");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		print(s, "");
	}

}
