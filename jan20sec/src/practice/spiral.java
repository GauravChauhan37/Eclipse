package practice;

import java.io.*;
import java.util.*;

public class spiral {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int mat[][] = new int[row][col];
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		int rmax = mat.length - 1;
		int cmax = mat[0].length - 1;
		int total = mat.length * mat[0].length;
		int rmin = 0, cmin = 0;
		clockwise(mat, rmin, rmax, cmin, cmax, total);
		System.out.println();
		anticlockwise(mat, rmin, rmax, cmin, cmax, total);
	}

	public static void clockwise(int[][] mat, int rmin, int rmax, int cmin, int cmax, int total) {

		int counter = 1;

		while (counter <= total) {
			for (int i = cmin; counter <= total && i <= cmax; i++) {

				System.out.print(mat[rmin][i] + " ");
				counter++;
			}
			rmin++;

			for (int j = rmin; counter <= total && j <= rmax; j++) {

				System.out.print(mat[j][cmax] + " ");
				counter++;
			}
			cmax--;

			for (int i = cmax; counter <= total && i >= cmin; i--) {

				System.out.print(mat[rmax][i] + " ");
				counter++;
			}
			rmax--;

			for (int j = rmax; counter <= total && j >= rmin; j--) {

				System.out.print(mat[j][cmin] + " ");
				counter++;
			}
			cmin++;

		}
	}

	public static void anticlockwise(int[][] mat, int rmin, int rmax, int cmin, int cmax, int total) {
		int counter = 1;

		while (counter <= total) {
			for (int i = rmin; counter <= total && i <= rmax; i++) {
				System.out.print(mat[i][cmin] + " ");
				counter++;
			}
			cmin++;
			for (int j = cmin; counter <= total && j <= cmax; j++) {
				System.out.print(mat[rmax][j] + " ");
				counter++;
			}
			rmax--;
			for (int i = rmax; counter <= total && i >= rmin; i--) {
				System.out.print(mat[i][cmax] + " ");
				counter++;
			}
			cmax--;
			for (int j = cmax; counter <= total && j >= cmin; j--) {
				System.out.print(mat[rmin][j] + " ");
				counter++;
			}
			rmin++;
		}
	}

}