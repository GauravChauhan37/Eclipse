
public class snakesandladder {

	public static void main(String[] args) {
		int[] moves = { 3, 4, 2, 3, 6, 5, 1, 4, 3, 5, 6, 1, 2,2 };
		int[] board = new int[21];
		board[2] = 19;
		board[5] = 13;
		board[11] = 7;
		board[17] = 3;
		int move = 0;
		int save = 0;
		int b = 1;
		for (int i = 0; i < moves.length; i++) {
			if (moves[i] == 6 || moves[i] == 1) {
				save = i;
				move = 1;
				break;
			}
		}
		for (int k = save + 1; k < moves.length; k++) {
			if (move + moves[k] < board.length) {
				move += moves[k];
			}
			if (board[move] != 0) {
				move = board[move];
			}

			if (move == board.length - 1) {
				System.out.print("win");
				return;
			}
		}
		System.out.println(move);
	}
}
