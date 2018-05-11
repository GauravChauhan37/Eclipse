package practice;

import java.io.*;
import java.util.*;

public class rotatenum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long r = sc.nextLong();
		long num = sc.nextLong();
		long count = 0, c = num;
		while (c > 0) {
			c = c / 10;
			count++;
		}
		if (r > 0) {
			System.out.println(leftrotate(r, num, count));
		} else {
			System.out.println(rightrotate(r, num, count));
		}
	}

	public static long leftrotate(long r, long num, long count) {
		long s;
		if (count - r > 0) { // countisnumofdigitsingivennum
			s = count - r;
		} else {
			long t;
			while (r > count) {
				r= r % count;
			}
			s = count - r;

		}

		long div = (long) (Math.pow(10, s));
		long rem = num / div;
		num = num % div;
		num = num * (long) (Math.pow(10, r));
		num += rem;
		return num;
	}

	public static long rightrotate(long r, long num, long count) {
		r = -r;
		long div = (long) (Math.pow(10, r));
		long mul = (long) (Math.pow(10, count - r));
		long rem = num / div;
		num = num % div;
		num = num * mul;
		num += rem;
		return num;
	}
}
