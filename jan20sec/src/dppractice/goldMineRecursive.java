package dppractice;

public class goldMineRecursive {
	static int maxGold = Integer.MIN_VALUE;

	public static int goldDigger(int[][] mine, int sr, int sc) {
		if (sc >= mine[0].length - 1) {
			return mine[sr][sc];
		}
		int ans1 = 0, ans2 = 0, ans3 = 0, res = 0;
		if (sr > 0) {
			ans1 = goldDigger(mine, sr - 1, sc + 1);
		}

		if (sr < mine.length - 1) {
			ans2 = goldDigger(mine, sr + 1, sc + 1);

			ans3 = goldDigger(mine, sr, sc + 1);
			res = mine[sr][sc] + Math.max(ans1, Math.max(ans2, ans3));

		}
		return res;
	}

	public static void main(String[] args) {
		int[][] mine = { { 2, 6, 0, 5 }, { 0, 7, 5, 2 }, { 3, 0, 3, 7 }, { 8, 0, 2, 3 }, };
		for (int i = 0; i < mine.length; i++) {
			int rowmax = goldDigger(mine, i, 0);
			if (rowmax > maxGold)
				maxGold = rowmax;
		}
		System.out.println(maxGold);
	}

}
