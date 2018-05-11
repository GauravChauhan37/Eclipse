package dp;

public class palincut {

	private static boolean isPalin(String asf) {
		for (int i = 0, j = asf.length() - 1; i < j; i++, j--) {
			if (asf.charAt(i) != asf.charAt(j)) {
				return false;
			}
		}
		return true;
	}

	public static int countCuts(String s) {
		if (isPalin(s)) {
			return 0;
		}
		int ocut = Integer.MAX_VALUE;
		for (int i = 1; i <= s.length() - 1; i++) {
			String firstHalf = s.substring(0, i);
			int cut1 = countCuts(firstHalf);
			int cut2 = countCuts(s.substring(i));
			int cut = cut1 + cut2 + 1;
			ocut = Math.min(cut, ocut);
		}
		return ocut;
	}

	public static boolean[][] palidromicSub(String s, boolean[][] isPl) {
		for (int gap = 0; gap < s.length(); gap++) {
			int si = gap;
			int ei = gap + si;
			while (ei <= s.length() - 1) {
				if (si == ei) {
					isPl[si][ei] = true;
				} else if (si + 1 == ei) {
					isPl[si][ei] = s.charAt(si) == s.charAt(ei);
				} else {
					isPl[si][ei] = s.charAt(si) == s.charAt(ei) && isPl[si++][ei--] == true;
				}
			}
		}
		return isPl;
	}

	public static int countCutsmemo(String s, int si, int ei, int[][] qb, boolean plssmat[][]) {
		if (plssmat[si][ei] == true) {
			return 0;
		}
		if (qb[si][ei] != 0) {
			return qb[si][ei];
		}
		int min = Integer.MAX_VALUE;
		for (int i = si; i < ei; i++) {
			int c1 = countCutsmemo(s, si, i, qb, plssmat);
			int c2 = countCutsmemo(s, i + 1, ei, qb, plssmat);
			int omin = c1 + c2 + 1;
			min = Math.min(omin, min);
		}
		qb[si][ei] = min;
		return min;
	}

	public static void main(String[] args) {
		String s = "abccbc";
		// System.out.println(countCuts(s));
		int[][] qb = new int[s.length()][s.length()];
		boolean[][] isPl = new boolean[s.length()][s.length()];
		boolean[][] ans = palidromicSub(s, isPl);
		System.out.println(countCutsmemo(s, 0, s.length() - 1, qb, ans));
	}

}
