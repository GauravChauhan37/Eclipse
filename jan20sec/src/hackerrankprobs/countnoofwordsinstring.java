package hackerrankprobs;

import java.util.Scanner;

public class countnoofwordsinstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			count++;
		}
		count(s, count);
	}

	public static void count(String s, int count) {
		int counter = 1;
		for (int i = 0; i < count; i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				counter++;
			}
		}
		System.out.println(counter);
	}
}
