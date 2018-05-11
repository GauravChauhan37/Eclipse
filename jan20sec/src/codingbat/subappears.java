package codingbat;

import java.util.Scanner;

public class subappears {
	// testcase --> catdogcat
	// cat
	// 2
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String sn = sc.nextLine();
		int n = sc.nextInt();
		System.out.println(check(s, sn, n));
	}

	public static Boolean check(String s, String sn, int n) {
		if (n <= 0) {
			return true;
		}
		if (s.length() < 3) {
			return false;
		}
		String first = s.substring(0, 3);
		if (first.equals(sn)) {
			s = s.substring(3);
			return check(s, sn, --n);
		} else {
			s = s.substring(1);
			return check(s, sn, n);
		}
	}
}
