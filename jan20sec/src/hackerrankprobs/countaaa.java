package hackerrankprobs;

import java.util.Scanner;

public class countaaa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		StringBuilder a = new StringBuilder("");
		System.out.println(count2(s, 0, 0));
		System.out.println(count(s, 0, 0));

	}

	public static int count2(String s, int i, int c) { // overlap
		if (i + 2 >= s.length()) {
			return c;
		}
		if(s.charAt(i) == 'a'  && s.charAt(i+1) == 'a' && s.charAt(i+2) == 'a'){
			c++;
		}
		return count2(s,i+1,c);
	}

	public static int count(String s, int i, int c) {
		if (i + 3 > s.length()) {
			return c;
		}
		String g = s.substring(i, i + 3);
		if (g.charAt(0) == 'a' && g.charAt(1) == 'a' && g.charAt(2) == 'a') {
			c++;
			return count(s, i + 3, c);
		} else {
			return count(s, i + 1, c);
		}
	}
}
