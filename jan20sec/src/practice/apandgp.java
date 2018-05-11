package practice;

import java.util.Scanner;

public class apandgp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); // firstnum
		int d = sc.nextInt(); // common diff
		int g = sc.nextInt(); // common ratio
		int n = sc.nextInt(); // no of elements
		System.out.print(aplast(a, d, n) + " " + gplast(a, g, n) + " " + agplast(a, d, g, n) + " " + apsum(a, d, n)
				+ " " + gpsum(a, g, n) + " " + agpsum(a, d, g, n));
	}

	public static int aplast(int a, int d, int n) {
		int lastnum = 0;
		lastnum = a + (n - 1) * d;
		return lastnum;
	}

	public static int apsum(int a, int d, int n) {
		int sum = 0;
		// sum = (n / 2) * (2 * a + (n - 1) * d);
		sum = ((a + aplast(a, d, n)) * n) / 2;
		return sum;
	}

	public static int gplast(int a, int r, int n) {
		// arn-1
		int last = 0;
		last = (int) (a * Math.pow(r, n - 1));
		return last;
	}

	public static int gpsum(int a, int r, int n) {
		int sum = 0;
		sum = (int) (a * (Math.pow(r, n) - 1) / (r - 1));
		return sum;
	}

	public static int agplast(int a, int d, int r, int n) {
		int last = 0;
		last = (int) ((a + (n - 1) * d) * (Math.pow(r, n - 1)));
		return last;
	}

	public static int agpsum(int a, int d, int r, int n) {
		// sum = (int) ((int) ((a-(a+(n-1)*d)*Math.pow(r, n)) / r-1) +
		// ((d*r)*(1-Math.pow(r, n-1))/(Math.pow(r-1, 2))));
		int sum = 0;
		for (int i = 1; i <= n; i++)
			sum += ((a + (i - 1) * d) * (Math.pow(r, i - 1)));
		return sum;
	}

}