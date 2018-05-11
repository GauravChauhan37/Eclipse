package Backtracking;

public class knighttourclass {
	static int count = 0;

	public static boolean isknightsafe(boolean[][] board, int rno, int cno) {
		int[][] dirs = { { 2, 1 }, { 1, 2 }, { 2, -1 }, { -1, 2 }, { -2, 1 }, { -2, -1 }, { 1, -2 }, { -1, -2 }, };
		for (int dir = 0; dir < dirs.length; dir++) {
			int rdash = rno + dirs[dir][0];
			int cdash = cno + dirs[dir][1];
			if (rdash < 0 || rdash >= board.length) {
				continue;
			}
			if (cdash < 0 || cdash >= board[0].length) {
				continue;
			}
			if (board[rdash][cdash] == true) {
				return false;
			}
		}
		return true;
	}

	public static void move(boolean[][] board, int bno, int qno, String psf, int lqpb) {
		if (qno == board.length) {
			count++;
			System.out.println(psf + "    " + count);
			return;
		}
		for (int i = lqpb + 1; i < board.length * board[0].length; i++) {
			int rno = i / board.length;
			int cno = i % board[0].length;
			if (board[rno][cno] == false && isknightsafe(board, rno, cno)) {
				board[rno][cno] = true;
				move(board, bno, qno + 1, psf + " " + i, i);
				board[rno][cno] = false;
			}
		}
	}

	public static void main(String[] args) {
		boolean[][] maze = new boolean[3][3];
		move(maze, 0, 0, "", -1);
	}
}
