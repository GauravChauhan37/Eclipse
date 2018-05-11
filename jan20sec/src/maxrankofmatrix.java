
public class maxrankofmatrix {

	public static void main(String[] args) {
		int[][] a = { { 0, 1, 1, 0 }, { 1, 0, 0, 0 }, { 1, 1, 1, 0 }, { 1, 1, 1, 1 }, };
		int[][] b = new int[a.length][a[0].length];
		int cmax = a[0].length - 2;
		int rmax = a.length - 2;
		for (int i = rmax; i >= 0; i--) {
			for (int j = cmax; j >= 0; j--) {
				if (a[i][j] == 0) {
					continue;
				} else {
					int hor = a[i][j + 1];
					int ver = a[i + 1][j];
					int dia = a[i + 1][j + 1];
					a[i][j] = 1 + Math.min(Math.min(hor, ver), dia);
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
