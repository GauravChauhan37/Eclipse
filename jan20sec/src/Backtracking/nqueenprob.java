package Backtracking;

public class nqueenprob {
	public static boolean isSafe(int[][] maze, int row, int col) {
		for (int i = row, j = col; i < maze.length && j < maze[0].length; i++, j++) {
			if (maze[i][j] == 1)
				return false;
		}
		for (int i = row, j = col; i >= 0 || j >= 0; i--, j--) {
			if (maze[i][j] == 1)
				return false;
		}
		for (int i = row; i < maze.length; i++) {
			if (maze[i][col] == 1) {
				return false;
			}
		}
		for (int i = col; i < maze[0].length; i++) {
			if (maze[row][i] == 1) {
				return false;
			}
		}
		return true;
	}

	public static void solve(int[][] maze, int i, int j) {
		if (i >= maze.length) {
			return;
		}
		if (j >= maze[0].length) {
			solve(maze, i + 1, 0);
			return;
		}
		if (isSafe(maze, i, j)) {
			maze[i][j] = 1;
		}
		solve(maze, i, j + 1);
	}

	public static void main(String[] args) {
		int[][] maze = new int[4][4];
		solve(maze, 0, 0);
		for (int row = 0; row < maze.length; row++) {
			for (int col = 0; col < maze[0].length; col++) {
				System.out.print(maze[row][col] + "  ");
			}
			System.out.println();
		}
	}
}
