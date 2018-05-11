package timenspacecomp;

import java.util.Arrays;

public class seiveoferatosthenese {

	public static void main(String[] args) {
		int n = 30;
		boolean[] b = new boolean[n + 1];
		Arrays.fill(b, true);
		b[0] = false;
		b[1] = false;
		for (int i = 2; i * i <= n; i++) {
			if (b[i] == true) {
				for (int j = i * i; j < b.length; j += i) {
					b[j] = false;
				}
			}
		}
		for (int i = 0; i < b.length; i++) {
			if (b[i] == true) {
				System.out.println(i);
			}
		}
	}

}
