package recursion;

import java.util.Scanner;

public class sumofdigitsinstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int sum = 0;
		int n = 0;
		int finalsum = calcsum(s, sum, n);
		System.out.println(finalsum);
	}

	public static int calcsum(String s, int sum, int n) {
		if (n == s.length()) {
			return sum;
		}
		int temp = Integer.parseInt(s.substring(n, n + 1));
		int total = calcsum(s, sum, n + 1);
		sum = total + temp;
		return sum;
	}

}
