package hackerrankprobs;

import java.util.Scanner;

public class microandmaze {
	static int count=0;
	public static void micro(int[][] a, int srow, int scol, boolean[][] extra) {
		if (srow == a.length - 1 && scol == a[0].length - 1) {
			count++;
			return ;
		}
		if (srow < a.length - 1) {
			if (a[srow + 1][scol] != 0 && extra[srow + 1][scol] == false) {
				extra[srow + 1][scol] = true;
				micro(a, srow + 1, scol, extra);
			}
		}
		if (srow > 0) {
			if (a[srow - 1][scol] != 0 && extra[srow - 1][scol] == false) {
				extra[srow - 1][scol] = true;
				 micro(a, srow - 1, scol, extra);
			}
		}
		if (scol > 0) {
			if (a[srow][scol - 1] != 0 && extra[srow][scol - 1] == false) {
				extra[srow][scol - 1] = true;
				micro(a, srow, scol - 1, extra);
			}
		}
		if (scol + 1 < a[0].length - 1) {
			if (a[srow][scol + 1] != 0 && extra[srow][scol + 1] == false) {
				extra[srow][scol + 1] = true;
				micro(a, srow, scol + 1, extra);
			}
		}
		return ;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rowlen = sc.nextInt();
		int collen = sc.nextInt();
		int[][] a = new int[rowlen][collen];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		sc.close();
		boolean[][] extra = new boolean[a.length][a[0].length];
		micro(a, 0, 0, extra);
		if(count>0){
			System.out.println("true");
		}
		else{
			System.out.println(false);
		}
	}

}
