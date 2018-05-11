package dppractice;

public class countMazePathTabulated {
	public static void countMazePaths(int[][] mat) {
		int[][] qb = new int[mat.length][mat[0].length];
		for (int j = qb[0].length - 1; j >= 0; j--) {
			for (int i = qb.length - 1; i >= 0; i--) {
				if (mat[i][j] != 0) {
					if (i == qb.length - 1) {
						qb[i][j] = mat[i][j];
					} else if (j == mat[0].length - 1 && i != qb.length - 1) {
						qb[i][j] = qb[i + 1][j];
					} else {
						qb[i][j] = qb[i][j + 1] + qb[i + 1][j];
					}
				}
			}
		}
		System.out.println(qb[0][0]);
	}

	public static void main(String[] args) {
		int[][] mat = { { 1, 1, 0, 1 }, { 1, 1, 1, 1 }, { 1, 0, 1, 0 }, { 0, 0, 1, 1 } };
		countMazePaths(mat);
	}

}
