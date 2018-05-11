package practice;

import java.util.Scanner;

public class addnoftwomatrices {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] a = new int[row][col];
		int[][] b = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		add(a, b);
	}

	public static void add(int[][] a, int[][] b) {
		int[][] c = new int[a.length][a.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		int i=0, j=0;
		int trace=0;
		while(i<a.length){
		 trace = trace +c[i][j];
		 i++;
		 j++;
	}
		System.out.println(trace);
}
}