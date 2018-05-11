package Backtracking;

import java.util.Scanner;

public class printallBinarytilln {
	public static void printBinary(int n, String prefix) {
		if (n == 0)
			System.out.println(prefix);
		else {
			printBinary(n - 1, prefix + 0);
			printBinary(n - 1, prefix + 1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printBinary(n, "");
		sc.close();
	}
}
