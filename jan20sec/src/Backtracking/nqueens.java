package Backtracking;

public class nqueens {
	static int count = 0;

	public static boolean isqueenSafe(boolean[][] board, int rno, int cno) {
		int[][] dirs = { { -1, 0 }, { -1, 1 }, { 0, 1 }, { 1, 1 }, { 1, 0 }, { 1, -1 }, { 0, -1 }, { -1, -1 } };
		for (int dir = 0; dir < dirs.length; dir++) {
			int radius = 1;
			while (true) {
				int rdash = rno + radius * dirs[dir][0];
				int cdash = cno + radius * dirs[dir][1];
				if (rdash < 0 || rdash >= board.length) {
					break;
				}
				if (cdash < 0 || cdash >= board[0].length) {
					break;
				}
				if (board[rdash][cdash] == true) {
					return false;
				}
				radius++;
			}
		}
		return true;
	}

	public static boolean isBoardValid(boolean[][] board) {
		for (int i = 0; i < board.length * board[0].length; i++) {
			int rno = i / board.length;
			int cno = i % board.length;
			if (board[rno][cno] == true) {
				if ((isqueenSafe(board, rno, cno) == false)) {
					return false;
				}
			}
		}
		return true;
	}

	public static void nqueensreactive(boolean[][] board, int bno, int qno, String psf, int lqpb) {
		if (qno == 0) {
			count++;
			if (isBoardValid(board)) {
				System.out.println(psf + "    " + count);
			}
			return;
		}
		for (int i = lqpb + 1; i < board.length * board[0].length; i++) {
			int rno = i / board.length;
			int cno = i % board[0].length;
			if (board[rno][cno] == false) {
				board[rno][cno] = true;
				nqueensreactive(board, bno, qno - 1, psf + " " + i, i);
				board[rno][cno] = false;
			}
		}
	}

	public static void nqueensproactive(boolean[][] board, int bno, int qno, String psf, int lqpb) {
		if (qno == 0) {
			System.out.println(psf);
			return;
		}
		for (int i = lqpb + 1; i < board.length * board[0].length; i++) {
			int rno = i / board.length;
			int cno = i % board[0].length;
			if (board[rno][cno] == false && isqueenSafe(board, rno, cno)) {
				board[rno][cno] = true;
				nqueensproactive(board, bno, qno - 1, psf + " " + i, i);
				board[rno][cno] = false;
			}
		}
	}

	public static void main(String[] args) {
		boolean[][] board = new boolean[4][4];
		int qno = board.length;
		// nqueensreactive(board, 0, qno, "", -1);
		nqueensproactive(board, 0, qno, "", -1);
	}
}
