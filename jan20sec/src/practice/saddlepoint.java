package practice;

import java.util.Scanner;

public class saddlepoint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int t = sc.nextInt();
		int[][] a = new int[r][t];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < a.length; i++) { // outer loop for row run
			// find min in row
			int minr = a[i][0];
			int col_in = 0;
			for (int j = 0; j < a[0].length; j++) {
				if (minr > a[i][j]) {
					minr = a[i][j];
					col_in = j;
				}
			}

			// find max in col
			int maxc = a[0][col_in];
			for (int k = 0; k < a.length; k++) {
				if (maxc < a[k][col_in]) {
					maxc = a[k][col_in];
				}
			}
			// if they are same then sop saddle
			if (minr == maxc) {
				System.out.println(minr);
				return;
			}
		}
		System.out.println("No Such Point Exist");
	}
}
