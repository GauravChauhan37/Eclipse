package codingbat;

import java.util.Scanner;

public class subcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String sn = sc.nextLine();
		System.out.println(count(s, sn));
	}

	public static int count(String s, String sn) {
		int c = 0;
		if (s.length() < 3) {
			return c;
		}
		String first = s.substring(0, 3);
		if (first.equals(sn)) {
			c++;
			s = s.substring(3);
		} else {
			s = s.substring(1);
		}
		c = c + count(s, sn);
		return c;
	}
}
