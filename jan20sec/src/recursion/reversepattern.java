package recursion;

import java.util.Scanner;

public class reversepattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 0;
		int col = 0;
		pattern(n, row, col);
	}

	public static void pattern(int n, int row, int col) {
		if (n + 1 == row) {
			return;
		}
		if (col < n - row) {
			System.out.print("*" + " ");
			col++;
		} else {
			System.out.println();
			row++;
			col = 0;
		}
		pattern(n, row, col);
	}
}
