package geeks4geeksbacktracking;

public class longestpossroute {
	static int omax = Integer.MIN_VALUE;

	public static void findLongestPath(int[][] mat, int srow, int scol, int drow, int dcol, int max,
			boolean[][] visited) {
		if (srow == drow && scol == dcol) {
			if (omax < max) {
				omax = max;
				return;
			}
		}
		if (srow+1 < mat.length ) {
			if (mat[srow+1][scol] != 0 && visited[srow+1][scol] == false) {
				visited[srow+1][scol] = true;
				findLongestPath(mat, srow + 1, scol, drow, dcol, max + 1, visited);
				visited[srow+1][scol] = false;
			}
		}
		if (scol+1 < mat[0].length) {
			if (mat[srow][scol+1] != 0 && visited[srow][scol+1] == false) {
				visited[srow][scol+1] = true;
				findLongestPath(mat, srow, scol + 1, drow, dcol, max + 1, visited);
				visited[srow][scol+1] = false;
			}
		}
		if (srow-1 >= 0) {
			if (mat[srow-1][scol] != 0 && visited[srow-1][scol] == false) {
				visited[srow-1][scol] = true;
				findLongestPath(mat, srow - 1, scol, drow, dcol, max + 1, visited);
				visited[srow-1][scol] = false;
			}
		}
		if (scol-1 >= 0) {
			if (mat[srow][scol-1] != 0 && visited[srow][scol-1] == false) {
				visited[srow][scol-1] = true;
				findLongestPath(mat, srow, scol - 1, drow, dcol, max + 1, visited);
				visited[srow][scol-1] = false;
			}
		}
	}

	public static void main(String[] args) {
		int[][] mat = { { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 1, 1, 0, 1, 1, 0, 1 },
				{ 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 } };
		boolean[][] visited = new boolean[mat.length][mat[0].length];
		findLongestPath(mat, 0, 0, 1, 7, 0, visited);
		System.out.println(omax);
	}
}
