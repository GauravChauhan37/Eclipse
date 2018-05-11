package recursion;

import java.util.Scanner;

public class printpatternusingrec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int col = 0;
		pattern(n, row, col);
	}

	public static void pattern(int n, int row, int col) {
		if (n + 1 == row) {
			return;
		}
		if (col < row) {
			System.out.print("*" + " ");
			pattern(n, row, col + 1);
		} else if (col == row) {
			System.out.println();
			pattern(n, row + 1, col = 0);
		}
	}
}
