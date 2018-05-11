package geeks4geeksbacktracking;

import java.util.Arrays;

public class twoinsofarrayinspecificway {
	public static boolean fill(int[] res, int curr) {
		if (curr == 0) {
			return true;
		}
		for (int i = 0; i < res.length - curr - 1; i++) {
			if (res[i] == 0 && res[i + curr + 1] == 0) {
				res[i] = curr;
				res[i + curr + 1] = curr;
				boolean ans = fill(res, curr - 1);
				if (ans) {
					return true;
				} else {
					res[i] = 0;
					res[i + curr + 1] = 0;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int n = 7;
		int[] res = new int[n * 2];
		Arrays.fill(res, 0);
		fill(res, n);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + "  ");
		}
	}

}
