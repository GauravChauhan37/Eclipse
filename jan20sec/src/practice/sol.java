package practice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class sol {

	static int diagonalDifference(int[][] a) {
		int primary = 0;
		int sec = 0;
		for (int i = 0, j = 0; i < a.length; i++, j++) {
			primary = primary + a[i][j];
		}
		for (int i = a.length - 1, j = a[0].length - 1; i >= 0; i--, j--) {
			sec = sec + a[i][j];
		}
		int ans = primary - sec;
		return ans;
	}

	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(scan.nextLine().trim());

		int[][] a = new int[n][n];

		for (int aRowItr = 0; aRowItr < n; aRowItr++) {
			String[] aRowItems = scan.nextLine().split(" ");

			for (int aColumnItr = 0; aColumnItr < n; aColumnItr++) {
				int aItem = Integer.parseInt(aRowItems[aColumnItr].trim());
				a[aRowItr][aColumnItr] = aItem;
			}
		}

		int result = diagonalDifference(a);

		bw.write(String.valueOf(result));
		bw.newLine();

		bw.close();
	}
}
