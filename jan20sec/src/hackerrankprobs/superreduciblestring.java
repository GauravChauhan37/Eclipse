package hackerrankprobs;

import java.util.Scanner;

public class superreduciblestring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringBuilder p = new StringBuilder(s);
		reducible(p);
	}

	public static void reducible(StringBuilder p) {
		for (int i = 1; i < p.length(); i++) {
			if (p.charAt(i - 1) == p.charAt(i)) {
				p.delete(i - 1, i + 1);
				i = 0;
			}
		}
		if (p.length() == 0) {
			System.out.println("Empty String");
		} else {
			System.out.println(p);
		}
	}
}
