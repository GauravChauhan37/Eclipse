package Backtracking;

import java.util.Scanner;

public class diceroll {
	public static void rollcombos(int n, String ans) {
//		System.out.println("current vals" + "  " + " -->" + "  " + ans); // jtu
		if (n == 0) {
			System.out.println(ans);
			return;
		}
		for (int dice = 1; dice <= 6; dice++) {
			String inter = ans + dice;
			rollcombos(n - 1, inter);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		rollcombos(n, "");
	}
}
