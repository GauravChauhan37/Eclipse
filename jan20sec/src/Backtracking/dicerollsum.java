package Backtracking;

import java.util.Scanner;

public class dicerollsum {

	public static void printcombo(int n, int targetSum, String ans, int asf) {
		if (n == 0) {
			System.out.println(ans);
			return;
		}
		for (int dice = 1; dice <= 6; dice++) {
			if (asf + dice + n - 1 <= targetSum && asf + dice + 6 * (n - 1) >= targetSum) {
				printcombo(n - 1, targetSum, ans + dice, asf + dice);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int target = sc.nextInt();
		sc.close();
		printcombo(n, target, "", 0);
	}

}
