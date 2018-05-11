package dppractice;

public class countMazePathMemo {
	static int counter = 0;

	private static int countMazePath(int[][] mat, int srow, int scol, boolean[][] visited, int[][] qb) {
		if (srow == mat.length - 1 && scol == mat[0].length - 1) {
			return 1;
		}
		if (qb[srow][scol] != 0) {
			return qb[srow][scol];
		}
		int noOfPaths = 0;
		if (mat[srow][scol] != 0 && visited[srow][scol] == false) {
			if (srow + 1 < mat.length) {
				visited[srow][scol] = true;
				noOfPaths += countMazePath(mat, srow + 1, scol, visited, qb);
				visited[srow][scol] = false;
			}
			if (scol + 1 < mat[0].length) {
				visited[srow][scol] = true;
				noOfPaths += countMazePath(mat, srow, scol + 1, visited, qb);
				visited[srow][scol] = false;
			}

		}
		System.out.println(++counter);
		qb[srow][scol] = noOfPaths;
		return noOfPaths;
	}

	public static void main(String[] args) {
		int[][] mat = { { 1, 1, 0, 1 }, { 1, 1, 1, 1 }, { 1, 0, 1, 0 }, { 0, 0, 1, 1 } };
		boolean[][] visited = new boolean[mat.length][mat[0].length];
		int[][] qb = new int[mat.length][mat[0].length];
		System.out.println("noofPaths are"+" "+countMazePath(mat, 0, 0, visited, qb));

	}

}
