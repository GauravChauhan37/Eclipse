package geeks4geeksbacktracking;

public class knighttourprob {
	static int inc = 1;

	public static Boolean isSafe(int[][] maze, int rowmove, int colmove) {
		// how to find current pos of knight at maze
		// we will send the updated(current + moves) values to the function
		if (rowmove < 0 || colmove < 0 || rowmove >= maze.length || colmove >= maze[0].length)
			return false; // this was bound check

		// now look for the visited places
		// as it it initialised to 0 , then if change anything the values wont
		// be zero anymore. //just check if the value we want to visit is zero
		if (maze[rowmove][colmove] != 0) {
			return false;
		}
		return true;
	}

	public static void move(int[][] maze, int[] rowmove, int[] colmove, int crow, int ccol) {
		maze[crow][ccol] = inc; // start
		inc++;
		for (int val = 0; val < 8; val++) { // to change vals of row & col move
			// now add val to current pos of knight
			int rval = rowmove[val] + crow;
			int cval = colmove[val] + ccol;
			if (isSafe(maze, rval, cval)) { // if safe then
				// maze[rval][cval] = ++inc; // incremented values in current
				// pos.
				move(maze, rowmove, colmove, rval, cval); // if
				// true go check for in new places
			}
		}
	}

	public static void main(String[] args) {
		int[][] maze = new int[8][8]; // all initialized to zero
		int[] rowmove = { 2, 1, 2, -1, -2, -2, 1, -1 };
		int[] colmove = { 1, 2, -1, +2, +1, -1, -2, -2 };
		String visited = ""; // everytime we visit a sq, we update this
		move(maze, rowmove, colmove, 0, 0);
		// display new maze
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[0].length; j++) {
				System.out.print(maze[i][j] + "  ");
			}
			System.out.println();
		}
	}

}
