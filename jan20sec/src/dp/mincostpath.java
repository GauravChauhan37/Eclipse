package dp;

public class mincostpath {
	static int min = Integer.MAX_VALUE;

	public static void mincostpath1(int[][] a, int srow, int scol, int cost) {
		if (srow == a.length - 1 && scol == a[0].length - 1) {
			cost = cost + a[a.length - 1][a[0].length - 1];
			if (cost < min) {
				min = cost;
			}
		}
		if (srow + 1 < a.length) {
			mincostpath1(a, srow + 1, scol, cost + a[srow][scol]);
		}
		if (scol + 1 < a[0].length) {
			mincostpath1(a, srow, scol + 1, cost + a[srow][scol]);
		}
	}

	public static int mincostpath(int[][] a, int srow, int scol, int qb[][]) {
		if (srow == a.length - 1 && scol == a[0].length - 1) {
			int val = a[a.length - 1][a[0].length - 1];
			return val;
		}
		if (qb[srow][scol] != 0) {
			return qb[srow][scol];
		}
		int minr = Integer.MAX_VALUE;
		int minc = Integer.MAX_VALUE;
		if (srow + 1 < a.length) {
			minr = mincostpath(a, srow + 1, scol, qb);
		}
		if (scol + 1 < a[0].length) {
			minc = mincostpath(a, srow, scol + 1, qb);
		}
		int mycost = Math.min(minr, minc) + a[srow][scol];
		qb[srow][scol] = mycost;
		return mycost;
	}

	public static void mincostpath(int[][] a) {
		int[][] ans = new int[a.length][a[0].length];
		String[][] path = new String[a.length][a[0].length];
		for (int i = a.length - 1; i >= 0; i--) {
			for (int j = a[0].length - 1; j >= 0; j--) {
				if (i == a.length - 1 && j == a[0].length - 1) {
					ans[i][j] = a[i][j];
					path[i][j] = "";
				} else if (i == a.length - 1) {
					ans[i][j] = a[i][j] + ans[i][j + 1];
					path[i][j] = "H" + path[i][j + 1];
				} else if (j == a[0].length - 1) {
					ans[i][j] = a[i][j] + ans[i + 1][j];
					path[i][j] = "V" + path[i + 1][j];
				} else {
					if (ans[i + 1][j] < ans[i][j + 1]) {
						ans[i][j] = a[i][j] + ans[i + 1][j];
						path[i][j] = "V" + path[i + 1][j];
					} else {
						ans[i][j] = a[i][j] + ans[i][j + 1];
						path[i][j] = "H" + path[i][j + 1];
					}
				}
			}
		}
		System.out.println(ans[0][0]);
		System.out.println(path[0][0]);
	}

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 1 }, { 2, 0, 5, 2, }, { 7, 1, 1, 1 }, { 0, 0, 4, 2 }, };
		int[][] qb = new int[a.length + 1][a[0].length + 1];
		// System.out.println(mincostpath(a, 0, 0, qb));
		mincostpath(a);
	}

}
