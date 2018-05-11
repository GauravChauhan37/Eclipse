package Backtracking;

import java.util.ArrayList;

public class permutqueen {
	static int count = 0;

	public static void main(String[] args) {
		boolean[] boxes = new boolean[5];
		int noq = 3;
		// perm(boxes, noq, 0, "");
		comb(boxes, noq, -1, "");
	}

	public static void perm(boolean[] boxes, int noq, int qpsf, String s) {
		if (noq == 0) {
			count++;
			System.out.println(s + " " + count);
			return;
		}
		for (int i = 0; i < boxes.length; i++) {
			if (boxes[i] == false) {
				boxes[i] = true;
				perm(boxes, noq - 1, qpsf + 1, s + "q" + qpsf + " " + i + " ");
				boxes[i] = false;
			}
		}
	}

	public static void comb(boolean[] boxes, int noq, int qlp, String s) {
		if (noq == 0) {
			count++;
			System.out.println(s + " " + count);
			return;
		}
		for (int i = qlp + 1; i < boxes.length; i++) {

			// boxes[i] = true;
			comb(boxes, noq - 1, i, s + "q" + " " + i + " ");
			// boxes[i] = false;

		}
	}
}
