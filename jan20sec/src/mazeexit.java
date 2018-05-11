import java.util.Scanner;

public class mazeexit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		int maze[][] = new int[row][col];
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze[0].length; j++) {
				maze[i][j] = sc.nextInt();
			}
		}
		exitpoint(maze);
	}

	public static void exitpoint(int[][] maze) {
		int dir = 0;
		int j = 0, i = 0;

		while (true) {
			dir = (dir + maze[i][j]) % 4;
			if (dir == 0) {
				if (j != maze.length - 1) {
					j++;
				} else {
					System.out.println(i + " " + j);
					break;
				}
			} else if (dir == 1) {
				if (i != maze[0].length - 1) {
					i++;
				} else {
					System.out.println(i + " " + j);
					break;
				}
			} else if (dir == 2) {
				if (j != 0) {
					j--;
				} else {
					System.out.println(i + " " + j);
					break;
				}
			} else if (dir == 3) {
				if (i != 0) {
					i--;
				} else {
					System.out.println(i + " " + j);
					break;
				}
			}
		}
	}
}