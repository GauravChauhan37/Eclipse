package geeks4geeksbacktracking;

public class landmine {
	static int omin = Integer.MAX_VALUE;

	public static void markunsafe(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] == 0) {
					if (i + 1 < a.length) {
						a[i + 1][j] = 2;
					}
					if (j + 1 < a[0].length) {
						a[i][j + 1] = 2;
					}
					if (i - 1 >= 0) {
						a[i - 1][j] = 2;
					}
					if (j - 1 >= 0) {
						a[i][j - 1] = 2;
					}
				}
			}
		}
	}

	public static void findminpath(int[][] a, int srow, int scol, int drow, int dcol, boolean[][] visited, int cmin) {
		if (srow == drow && scol == dcol) {
			if (cmin < omin) {
				omin = cmin;
			}
			return;
		}
		if (isInvalid(a, srow, scol, visited) == true) {
			return;
		}
		visited[srow][scol] = true;
		findminpath(a, srow + 1, scol, drow, dcol, visited, cmin + 1);
		findminpath(a, srow, scol + 1, drow, dcol, visited, cmin + 1);
		findminpath(a, srow - 1, scol, drow, dcol, visited, cmin + 1);
		findminpath(a, srow, scol - 1, drow, dcol, visited, cmin + 1);
		visited[srow][scol] = false;
	}

	public static boolean isInvalid(int[][] maze, int sr, int sc, boolean[][] visited) {
		if (sr < 0) {
			return true;
		} else if (sc < 0) {
			return true;
		} else if (sr == maze.length) {
			return true;
		} else if (sc == maze[0].length) {
			return true;
		} else if (maze[sr][sc] == 0 || maze[sr][sc] == 2) {
			return true;
		} else if (visited[sr][sc] == true) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int[][] a = { { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 0, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 0, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 0, 1, 1, 1, 1, 1, 1, 0, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 0, 1, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 0, 1, 1, 1, 1, 1, 1 } };
		markunsafe(a);
		boolean[][] visited = new boolean[a.length][a[0].length];
		findminpath(a, 4, 0, 9, 9, visited, 0);
		System.out.println(omin);
	}

}
