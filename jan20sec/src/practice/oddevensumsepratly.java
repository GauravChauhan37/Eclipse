package practice;

import java.util.Scanner;

public class oddevensumsepratly { 

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		long c;
		if (num > 0) {
			c = num;
		} else {
			c = -num;
		}
		long count = 0;
		while (c > 0) {
			c = c / 10;
			count++;
		}
		// even
		long sumeven = 0;
		if (num > 0) {
			for (long i = 1; i <= count; i += 2) {
				long div = (long) Math.pow(10, count - i);
				long rem = num / div;
				rem = rem % 10;
				sumeven = sumeven + rem;
			}
		} else {
			for (long i = 2; i <= count; i += 2) {
				long div = (long) Math.pow(10, count - i);
				long rem = num / div;
				rem = rem % 10;
				sumeven = sumeven + rem;
			}
		}

		// odd
		long sumodd = 0;
		if (num > 0) {
			for (long i = 2; i <= count; i += 2) {
				long div = (long) Math.pow(10, count - i);
				long rem = num / div;
				rem = rem % 10;
				sumodd = sumodd + rem;
			}
		} else {
			for (long i = 1; i <= count; i += 2) {
				long div = (long) Math.pow(10, count - i);
				long rem = num / div;
				rem = rem % 10;
				sumodd = sumodd + rem;
			}
		}
		System.out.println(sumodd + " " + sumeven);
	}

}
