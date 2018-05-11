package Backtracking;

import java.util.Scanner;

public class printDecimaltillln {
	public static void printDecimal(int n, String prefix) {
		System.out.println("current digit is"+"  "+"--->"+"  "+prefix);    //jtu
		if (n == 0)
			System.out.println(prefix);
		else {
			for (int i = 0; i <= 9; i++) {
				printDecimal(n - 1, prefix + i);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printDecimal(n, "");
		sc.close();
	}

}
