package Backtracking;

public class coinchange {
	public static void coinperm(int[] a, int target, String s) {
		if (target == 0) {
			System.out.println(s);
			return;
		}
		for (int i = 0; i < a.length; i++) {
			if (target > 0)
				coinperm(a, target - a[i], s + a[i] + " ");
		}
	}

	public static void coincomb(int[] a, int target, String s, int lp) {
		if (target == 0) {
			System.out.println(s);
			return;
		}
		for (int i = lp; i < a.length; i++) {
			if (target > 0)
				coincomb(a, target - a[i], s + a[i] + " ", i);
		}
	}

	public static void main(String[] args) {
		int[] a = { 2, 3, 5, 6 };
		// coinperm(a, 10, "");
		coincomb(a, 10, "", 0);
	}

}
