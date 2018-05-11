package geeksarray;

import java.util.Scanner;

public class printarrinspiralform {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int a[][] = new int[row][col];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		spi(a);
	}

	public static void spi(int a[][]) {
		int counter = 0;
		int length = a.length * a[0].length;
		int minrow = 0;
		int maxrow = a.length - 1;
		int mincol = 0;
		int maxcol = a[0].length - 1;
		while (counter <= length) {

			for (int i = minrow; counter <= length && i <= maxrow; i++) {
				System.out.print(a[i][mincol] + " ");
				counter++;
			}
			mincol++;
			for (int j = mincol; counter <= length && j <= maxcol; j++) {
				System.out.print(a[maxrow][j] + " ");
				counter++;
			}
			if (maxrow > 0) {
				maxrow--;
			} else {
				break;
			}
			for (int k = maxrow; counter <= length && k >= minrow; k--) {
				System.out.print(a[k][maxcol] + " ");
				counter++;
			}
			if (maxcol > 0) {
				maxcol--;
			} else {
				break;
			}
			for (int l = maxcol; counter <= length && l >= mincol; l--) {
				System.out.print(a[minrow][l] + " ");
				counter++;
			}
			minrow++;

		}

	}
}
