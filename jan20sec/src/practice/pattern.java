package practice;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		int val = 1;
		int temp;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n / 2 + 1; i++) {
			for (int j = i; j <= n / 2; j++) {
				System.out.print("  ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(val + " ");
				val++;
			}
			temp = val;
			val = i + 1;
			if (i == 1) {
				System.out.println();
				continue;
			} else {
				temp--;
				for (int k = 1; k < i; k++) {
					temp--;
					System.out.print(temp + " ");
				}
			}
			System.out.println();
		}
		val -= 2;
		for (int i = n / 2; i >= 1; i--) {
			for (int j = n/2; j >=i; j--) {
				System.out.print("  ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(val + " ");
				val++;
			}
			temp = val;
			val -=3;
			temp--;
			for (int k = 1; k < i; k++) {
				temp--;
				System.out.print(temp + " ");
			}
			System.out.println();
		}
	}
}
