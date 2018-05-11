package practice;

import java.util.Scanner;

public class srqtandsqrtwithprec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		double p = sc.nextDouble();
		System.out.println(sqrt(num, p) + " "+ sqrtwithprecision(num, p));

	}

	public static int sqrt(double num, double p) {
		double sqrt = 0;
		double inc = 0;
		for (int i = 0; i <= p; i++) {
			inc = Math.pow(10, -i);
			while (sqrt * sqrt <= num) {
				sqrt = sqrt + inc;
			}
			sqrt = sqrt - inc;
		}
		int ans = (int) sqrt;
		return ans;

	}

	public static double sqrtwithprecision(double num, double p) {
		double sqrt = 0;
		double inc = 0;
		for (int i = 0; i <= p; i++) {
			inc = Math.pow(10, -i);
			while (sqrt * sqrt <= num) {
				sqrt = sqrt + inc;
			}
			sqrt = sqrt - inc;
		}
		double mult = Math.pow(10, p);
		mult = Math.round(sqrt * mult) / mult;
		return mult;
	}
}
