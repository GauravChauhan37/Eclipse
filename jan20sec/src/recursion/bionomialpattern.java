package recursion;

import java.util.Scanner;

public class bionomialpattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int col = 0;
		int count = 1;
		pattern(n, row, col, count);
	}

	public static void pattern(int n, int row, int col, int count) {
		if (n + 1 == row) {
			return;
		}
		if (col < row) {
			System.out.print(count + " ");
			pattern(n, row, col + 1, count + 1);
		} else if (col == row) {
			System.out.println();
			pattern(n, row + 1, col = 0, count = 1);
		}
	}
}