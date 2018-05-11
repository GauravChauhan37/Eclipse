package timenspacecomp;

import java.util.Scanner;

public class powerlogn {
	public static int power(int a, int b) {
		int total;
		if (b == 0)
			return 1;
		total = power(a, b / 2);

		if (b % 2 == 0)
			return total * total;
		else {
			return a * total * total;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int not = sc.nextInt();
		while (not != 0) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(power(a, b));
			not--;
		}
	}
}
