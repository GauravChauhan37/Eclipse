package Backtracking;

public class nqueenssubs {
	public static boolean isqueenSafe(boolean[][] board, int rno, int cno) {
		int[][] dirs = { { -1, 0 }, { -1, 1 }, { 0, 1 }, { 1, 1 }, { 1, 0 }, { 1, -1 }, { 0, -1 }, { -1, -1 } };
		for (int i = 0; i < dirs.length; i++) {
			int radius = 1;
			while (true) {
				int rdash = rno + radius * dirs[i][0];
				int cdash = cno + radius * dirs[i][1];
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

	public static void nqueenssubs(boolean[][] board, int qno, int bno, String psf) {
		if (qno == board.length) {
			System.out.println(psf);
			return;
		}
		if (bno < board.length * board.length) {
			nqueenssubs(board, qno, bno + 1, psf); // no
			int rno = bno / board.length;
			int cno = bno % board[0].length;
			if (board[rno][cno] == false && isqueenSafe(board, rno, cno)) {
				board[rno][cno] = true;
				nqueenssubs(board, qno + 1, bno + 1, psf + " " + bno); // yes
				board[rno][cno] = false;
			}
		}
	}

	public static void main(String[] args) {
		boolean[][] board = new boolean[4][4];
		nqueenssubs(board, 0, 0, "");
	}

}
