package practice;

import java.util.Scanner;

public class pattern1 {

	public static void main(String[] args) {
		int val = 1;
		int temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter");
		int n = sc.nextInt();
		for (int i = 1; i <= n / 2 + 1; i++) {
			for (int j = i; j <= n / 2; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k < i * 2; k++) {
				System.out.print(val + " ");
				val++;
			}
			System.out.println();
		}
	}
}