package Backtracking;

public class sudoku {
	public static boolean isSafe(int[][] maze, int srow, int scol, int frow, int fcol, int vtc) {
		for (int i = 0; i < maze.length; i++) {
			if (maze[i][scol] == vtc) {
				return false;
			}
		}
		for (int i = 0; i < maze[0].length; i++) {
			if (maze[srow][i] == vtc) {
				return false;
			}
		}

		int sr = -1, sc = -1;

		if (srow < 3) {
			sr = 0;
		} else if (srow < 6) {
			sr = 3;
		} else {
			sr = 6;
		}

		if (scol < 3) {
			sc = 0;
		} else if (scol < 6) {
			sc = 3;
		} else {
			sc = 6;
		}

		for (int i = sr; i < sr + 3; i++) {
			for (int j = sc; j < sc + 3; j++) {
				if (maze[i][j] == vtc)
					return false;
			}
		}
		return true;
	}

	public static void solvesud(int[][] maze, int row, int col, int frow, int fcol) {
		if (row == frow) {
			for (int i = 0; i < maze.length; i++) {
				for (int j = 0; j < maze[0].length; j++) {
					System.out.print(maze[i][j] + " ");
				}
				System.out.println();
			}
			return;
		}

		if (col == fcol) {
			solvesud(maze, row + 1, 0, frow, fcol);
			return;
		}

		if (maze[row][col] != 0) {
			solvesud(maze, row, col + 1, frow, fcol);
		} else {
			for (int value = 1; value <= 9; value++) {
				if (isSafe(maze, row, col, frow, fcol, value)) {
					maze[row][col] = value;
					solvesud(maze, row, col + 1, frow, fcol);
					maze[row][col] = 0;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[][] maze = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 }, { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
				{ 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };
		solvesud(maze, 0, 0, 9, 9);
		// solvesud(maze, 0, 0);

	}
}