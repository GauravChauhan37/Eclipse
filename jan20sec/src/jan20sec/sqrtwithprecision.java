package jan20sec;

import java.util.Scanner;

public class sqrtwithprecision {

	public static void main(String[] args) {
		int num = 27;
		int p = 2;
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
		System.out.print(Math.round(sqrt * mult) / mult);
	}
}
