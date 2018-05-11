package dppractice;

import static java.lang.Math.min;

public class mazsizesqsubmatrixofall1memo {
	static int max = Integer.MIN_VALUE;
	static int counter = 0;

	private static int calSubMatrix(int[][] mat, int sr, int sc, int[][] qb) {
		if (sr == mat.length - 1 || sc == mat[0].length - 1) {
			return mat[sr][sc];
		}
		if (qb[sr][sc] != 0) {
			return qb[sr][sc];
		}
		int ans = 0;
		if (mat[sr][sc] == 0) {
			return 0;
		} else {
			ans = 1 + min(calSubMatrix(mat, sr + 1, sc, qb),
					min(calSubMatrix(mat, sr, sc + 1, qb), calSubMatrix(mat, sr + 1, sc + 1, qb)));
			if (ans > max)
				max = ans;
		}
		qb[sr][sc] = ans;
		System.out.println(++counter);
		return ans;
	}

	public static void main(String[] args) {
		int[][] mat = { { 1, 0, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1 },
				{ 0, 0, 1, 1, 1, 0 } };
		int[][] qb = new int[mat.length][mat[0].length];
		calSubMatrix(mat, 0, 0, qb);
		System.out.println(max);
	}

}
