package jan20sec;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		Scanner b = new Scanner(System.in);
		System.out.println("Enter the num");
		int n = b.nextInt();

		int i, j, k;
		for (i = 1; i <= (n / 2) + 1; i++) {
			for (j = i; j <= (n / 2) + 1; j++) {
				System.out.print("*");
			}
			for (k = 1; k < (i * 2); k++) {
				System.out.print(" ");
			}
			for (j = i; j <= (n / 2) + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = n / 2; i >= 1; i--) {
			for (j = (n / 2) + 1; j >= i; j--) {
				System.out.print("*");
			}
			for (k = 1; k < (i * 2); k++) {
				System.out.print(" ");
			}
			for (j = (n / 2) + 1; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
