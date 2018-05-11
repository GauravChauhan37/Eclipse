package jan20sec;

import java.util.Scanner;

public class p2 {

	public static void main(String[] args) {
		int row, nsp, nst;
		int val = 1;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		nsp = n / 2;
		nst = 1;
		for (row = 1; row <= n; row++) {
			for (int i = 1; i <= nsp; i++) {
				System.out.print(" ");
			}
			val=(row<=n/2)?row:n+1-row;
			for (int j = 1; j <= nst; j++) {
				System.out.print(val);
				val=(j<=nst/2)?val+1:val-1;
			}
			if (row <= n / 2) {
				nsp--;
				nst = nst + 2;

			} else {
				nsp++;
				nst = nst - 2;

			}
			System.out.println();
		}

	}

}
