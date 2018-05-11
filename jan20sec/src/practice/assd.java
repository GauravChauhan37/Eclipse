package practice;

import java.util.Scanner;

public class assd {
	public static void main(String[] args) {
		int[] a = { 0, 0, 13, 11, 0, 7, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		pbpwith16opening(0, 15, "", a);
	}

	public static void pbpwith16opening(int src, int dest, String psf, int[] a) {
		if (src == dest) {
			System.out.println(psf);
			return;
		}
		if (src == 0) {
			pbpwith16opening(1, dest, psf + 1, a);
			pbpwith16opening(1, dest, psf + 6, a);
		} else {
			if (a[src] != 0) {
				pbpwith16opening(a[src], dest,psf+ "[" + src + "->" + a[src] + "]", a);
			} else {
				for (int dice = 1; dice <= 6; dice++) {
					int inter = src + dice;
					if (inter <= dest) {
						pbpwith16opening(inter, dest, psf + dice, a);
					}
				}
			}
		}
	}
}
