package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class boardapth {
	public static ArrayList baordal(int source, int target, int dice) {
		// base
		ArrayList<String> rresult = baordal(source, target, dice);
		for (int i = 1; i <= dice; i++) {
			int inter = dice + i;
			if (inter <= target) {
				
				baordal(inter, target, dice);
			}
		}
		return rresult;
	}

	public static void boardpaths(int source, int target, int dice, String ans) {
		if (source == target) {
			System.out.println(ans);
			return;
		}
		for (int i = 1; i <= dice; i++) {
			int inter = source + i;
			if (inter <= target)
				boardpaths(inter, target, dice, ans + i);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		// count
//		boardal(0, n, m);
		boardpaths(0, n, m, "");
	}

}
