package codingbat;

import java.util.Scanner;

public class countpairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int finalc = countp(s);
		System.out.println(finalc);
	}

	public static int countp(String s) {
		int c = 0;
		if (s.length() <= 3) {
			if ((s.charAt(0) == s.charAt(2)) && (s.charAt(0) != s.charAt(1))) {
				c++;
				return c;
			} else {
				return c;
			}
		}
		String first = s.substring(0, 3);
		s = s.substring(1);
		if (first.charAt(0) == first.charAt(2) && first.charAt(0) != first.charAt(1)) {
			c++;
		}
		c = c + countp(s);
		return c;
	}
}
