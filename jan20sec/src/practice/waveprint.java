package practice;

import java.util.Scanner;

public class waveprint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] a = new int[row][col];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		waveprintrow(a);
		System.out.println();
		waveprintcol(a);

	}

	public static void waveprintcol(int[][] a) {
		int col = 0, row = 0;
		int dir = 0;
		while (col < a[0].length) {
			if (dir % 2 == 0) {
				while (row < a.length) {
					System.out.print(a[row][col] + " ");
					row++;
				}
			} else {
				row--;
				while (row >= 0) {
					System.out.print(a[row][col] + " ");
					if (row > 0) {
						row--;
					} else {
						break;
					}
				}
			}
			dir++;
			col++;
		}
	}

	public static void waveprintrow(int[][] a) {
		int dir = 0;
		int row = 0;
		int col = 0;
		while (row < a.length) {
			if (dir % 2 == 0) {
				while (col < a[0].length) {
					System.out.print(a[row][col] + " ");
					col++;
				}

			} else {
				col--;
				while (col >= 0) {
					System.out.print(a[row][col] + " ");
					if (col > 0) {
						col--;
					} else {
						break;
					}
				}
			}
			dir++;
			row++;
		}
	}
}