package recursion;

import java.util.Scanner;

public class printbinomialpattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int col = 0;
		int count = 1;
		floydd(n, row, col, count);

	}

	public static void floydd(int n, int row, int col, int count) {
		if (row > n) {
			return;
		}
		if (row > col) {
			System.out.print(count);
			count++;
			floydd(n, row, col + 1, count);
		} else if (row == col) {
			System.out.println();
			floydd(n, row + 1, col = 0, count);
		}
	}

}
