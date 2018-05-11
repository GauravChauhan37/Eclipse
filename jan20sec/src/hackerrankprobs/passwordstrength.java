package hackerrankprobs;

import java.util.Scanner;

public class passwordstrength {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		int count = s.length();
		checkelse(s);
	}

	public static void checkelse(String s) {
		int flag = 0;
		int count = 0;
		for (int i = 0; i < s.length(); i++) { // checkfordigits
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			count++;
		}
		flag = 0;
		for (int j = 0; j < s.length(); j++) { // checkforlowercase
			if (s.charAt(j) >= 'a' && s.charAt(j) <= 'z') {
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			count++;
		}
		flag = 0;
		for (int j = 0; j < s.length(); j++) { // check for uppercase
			if (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z') {
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			count++;
		}
		flag = 0;
		for (int j = 0; j < s.length(); j++) { // check for specialcharacter
			if (s.charAt(j) >= '!' && s.charAt(j) <= '/') {
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			count++;
		}
		if ((count + s.length()) < 6) {
			count = count + 6 - (count + s.length());
		}
		System.out.println(count);
	}

}
