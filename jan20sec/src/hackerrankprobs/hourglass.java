package hackerrankprobs;

import java.util.Scanner;

public class hourglass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] a = new int[row][col];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j] = sc.nextInt();
			}
		} // input
		hourglass(a);
	}

	public static void hourglass(int[][] a) {
		int sum = 0, maxsum = -9999; // -9999 cz as to also conisder -ve max sum
		// 0 wont work as maxsum cz -ve value will never go over zero
		for (int k = 0; k < a[0].length - 2; k++) { // trav through cols
			int middle = 1;
			for (int i = 0; i < a.length - 2; i++) {
				for (int j = i; j < i + 3; j++) {
					System.out.print(a[k][j] + " ");
					sum = sum + a[k][j];
				}
				System.out.println();
				System.out.print("  " + a[k + 1][middle]);
				sum = sum + a[k + 1][middle];
				System.out.println();
				for (int j = i; j < i + 3; j++) {
					System.out.print(a[k + 2][j] + " ");
					sum = sum + a[k + 2][j];
				}
				if (maxsum < sum) {
					maxsum = sum;
				}
				sum = 0;
				middle++;
				System.out.println();
			}
		}
		System.out.println("maxsum is " + " " + maxsum);
	}
}
