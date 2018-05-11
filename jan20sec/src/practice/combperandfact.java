package practice;

import java.util.Scanner;

public class combperandfact {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();

		System.out.println(fact(n));
		System.out.println(fact(n) / fact(n - r));
		System.out.println(fact(n) / (fact(n - r) * fact(r)));

	}

	public static int fact(int n) {
		int i, factorial = 1;
		for (i = n; i >= 1; i--) {
			factorial = factorial * i;
		}
		return factorial;

	}
}