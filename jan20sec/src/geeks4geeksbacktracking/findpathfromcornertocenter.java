package geeks4geeksbacktracking;

public class findpathfromcornertocenter {
	public static void findpath(int[][] maze, int srow, int scol, int drow, int dcol, String asf, boolean[][] visited) {
		if (srow == drow && scol == dcol) {
			System.out.println(asf);
		}
		if (srow + maze[srow][scol] < maze.length) {
			if (visited[srow + maze[srow][scol]][scol] == false) {
				visited[srow + maze[srow][scol]][scol] = true;
				findpath(maze, srow + maze[srow][scol], scol, drow, dcol,
						asf + "(" + srow + " " + scol + " " + ")" + "-->", visited);
				visited[srow + maze[srow][scol]][scol] = false;
			}
		}
		if (scol + maze[srow][scol] < maze[0].length) {
			if (visited[srow][scol + maze[srow][scol]] == false) {
				visited[srow][scol + maze[srow][scol]] = true;
				findpath(maze, srow, scol + maze[srow][scol], drow, dcol,
						asf + "(" + srow + " " + scol + " " + ")" + "-->", visited);
				visited[srow][scol + maze[srow][scol]] = false;
			}
		}
		if (srow - maze[srow][scol] >= 0) {
			if (visited[srow - maze[srow][scol]][scol] == false) {
				visited[srow - maze[srow][scol]][scol] = true;
				findpath(maze, srow - maze[srow][scol], scol, drow, dcol,
						asf + "(" + srow + " " + scol + " " + ")" + "-->", visited);
				visited[srow - maze[srow][scol]][scol] = false;
			}
		}
		if (scol - maze[srow][scol] >= 0) {
			if (visited[srow][scol - maze[srow][scol]]) {
				visited[srow][scol - maze[srow][scol]] = true;
				findpath(maze, srow, scol - maze[srow][scol], drow, dcol,
						asf + "(" + srow + " " + scol + " " + ")" + "-->", visited);
				visited[srow][scol - maze[srow][scol]] = false;
			}
		}
	}

	public static void main(String[] args) {
		int[][] maze = { { 3, 5, 4, 4, 7, 3, 4, 6, 3 }, { 6, 7, 5, 6, 6, 2, 6, 6, 2 }, { 3, 3, 4, 3, 2, 5, 4, 7, 2 },
				{ 6, 5, 5, 1, 2, 3, 6, 5, 6 }, { 3, 3, 4, 3, 0, 1, 4, 3, 4 }, { 3, 5, 4, 3, 2, 2, 3, 3, 5 },
				{ 3, 5, 4, 3, 2, 6, 4, 4, 3 }, { 3, 5, 1, 3, 7, 5, 3, 6, 4 }, { 6, 2, 4, 3, 4, 5, 4, 5, 1 } };
		boolean[][] visited = new boolean[maze.length][maze[0].length];
		findpath(maze, 0, 0, 5, 5, "", visited);
	}
}
