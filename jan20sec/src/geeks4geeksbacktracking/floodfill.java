package geeks4geeksbacktracking;

public class floodfill {
	public static void main(String[] args) {
		int maze[][] = { { 1, 0, 1, 1 }, { 1, 1, 1, 1 }, { 1, 0, 1, 1 }, { 1, 1, 0, 1 }, };
		boolean visited[][] = new boolean[maze.length][maze[0].length];
		findpathreactive(0, 0, maze, "", visited);
	}

	public static void findpath(int srow, int scol, int dr, int dc, int[][] maze, String psf, boolean[][] visited) {
		if (srow == dr && scol == dc) {
			System.out.println(psf);
			return;
		}
		if (srow < dr) {
			if (visited[srow + 1][scol] == false && maze[srow + 1][scol] != 0) {
				visited[srow + 1][scol] = true;
				findpath(srow + 1, scol, dr, dc, maze, psf + "down" + " ", visited);
				visited[srow + 1][scol] = false;
			}
		}

		if (srow > 0) {
			if (visited[srow - 1][scol] == false && maze[srow - 1][scol] != 0) {
				visited[srow - 1][scol] = true;
				findpath(srow - 1, scol, dr, dc, maze, psf + "up" + " ", visited);
				visited[srow - 1][scol] = false;
			}
		}
		if (scol < dc) {
			if (visited[srow][scol + 1] == false && maze[srow][scol + 1] != 0) {
				visited[srow][scol + 1] = true;
				findpath(srow, scol + 1, dr, dc, maze, psf + "right" + " ", visited);
				visited[srow][scol + 1] = false;
			}
		}
		if (scol > 0) {
			if (visited[srow][scol - 1] == false && maze[srow][scol - 1] != 0) {
				visited[srow][scol - 1] = true;
				findpath(srow, scol - 1, dr, dc, maze, psf + "right" + " ", visited);
				visited[srow][scol - 1] = false;
			}
		}
	}

	public static void findpathreactive(int srow, int scol, int[][] maze, String psf, boolean[][] visited) {
		if (srow == maze.length - 1 && scol == maze[0].length - 1) {
			System.out.println(psf);
			return;
		}
		if (check(maze, srow, scol, visited)) {
			return;
		}
		visited[srow][scol] = true;
		findpathreactive(srow, scol - 1, maze, psf + "left" + " ", visited);
		findpathreactive(srow + 1, scol, maze, psf + "down" + " ", visited);
		findpathreactive(srow, scol + 1, maze, psf + "right" + " ", visited);
		findpathreactive(srow - 1, scol, maze, psf + "up" + " ", visited);
		visited[srow][scol] = false;
	}

	public static boolean check(int[][] maze, int srow, int scol, boolean[][] visited) {
		if (srow >= maze.length)
			return true;
		if (scol >= maze[0].length)
			return true;
		if (srow < 0)
			return true;
		if (scol < 0)
			return true;
		if (maze[srow][scol] == 0)
			return true;
		if (visited[srow][scol] == true)
			return true;

		return false;
	}
}