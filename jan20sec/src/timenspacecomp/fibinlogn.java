package timenspacecomp;

import java.util.Scanner;

public class fibinlogn {
	static int count = 0;

	public static void findFib(long n) {
		long first = 0;
		n--;
		long scnd = 1;
		n--;
		if (n == 0) {
			System.out.println(scnd);
			return;
		}
		long temp = 0;
		for (int i = 0; i * i <= n; i++) {
			System.out.println(++count);
			temp = temp + first + scnd;
			first = first + scnd;
			scnd = temp;
		}
		System.out.println(temp);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long not = sc.nextInt();
		while (not != 0) {
			long n = sc.nextLong();
			findFib(n);
			not--;
		}
		sc.close();
	}

}
