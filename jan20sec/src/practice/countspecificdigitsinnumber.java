package practice;

import java.util.Scanner;

public class countspecificdigitsinnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		long r = sc.nextLong();
		long c = num;
		long count = 0;
		while (c > 0) {
			c = c / 10;
			count++;
		}
		long sum = 0;
		for (long i = 1; i <= count; i++) {
			long div = (long) Math.pow(10, count - i);
			long rem = num / div;
			rem = rem % 10;
			if (r == rem) {
				sum++;
			}
		}
		System.out.println(sum);
	}

}
