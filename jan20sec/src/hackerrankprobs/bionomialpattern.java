package hackerrankprobs;

import java.util.Scanner;

public class bionomialpattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int coeff = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				coeff = coeff + (i - j + 1) / j;
				System.out.print(coeff + " ");
			}
			System.out.println();
		}
	}
}
