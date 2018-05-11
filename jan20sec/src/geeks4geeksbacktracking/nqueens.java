package geeks4geeksbacktracking;

public class nqueens {
	public static boolean isSafe(int[][] maze, int row, int col) {
		for (int i = row; i < maze.length; i++) {
			if (maze[i][col] == 1)
				return false;
		}
		for (int i = col; i < maze[0].length; i++) {
			if (maze[row][i] == 1)
				return false;
		}
		for (int i = row, j = col; i < maze.length; i++, j++) {
			if (maze[i][j] == 1)
				return false;
		}
		return true;
	}

	public static void placenqueens(int[][] maze, int row, int col) {
		if (row == maze.length) {
			return;
		}
		if (isSafe(maze, row, col)) {
			maze[row][col] = 1;
			placenqueens(maze, row + 1, 0);
		}
	}

	public static void main(String[] args) {
		int[][] maze = new int[4][4];
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[0].length; j++) {
				System.out.print(maze[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println();
		placenqueens(maze, 0, 0);
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[0].length; j++) {
				System.out.print(maze[i][j] + "  ");
			}
			System.out.println();
		}
	}

}
