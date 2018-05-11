package dppractice;

public class maxsizesqsubmatrixofall1tabulated {
	public static void calSubMatrix(int[][] mat) {
		int[][] asf = new int[mat.length][mat[0].length];
		for (int i = 0; i < mat.length; i++) {
			if (mat[i][mat[0].length - 1] != 0) {
				asf[i][mat[0].length - 1] = 1;
			}
		}
		for (int i = 0; i < mat[0].length; i++) {
			if (mat[mat.length - 1][i] != 0) {
				asf[mat.length - 1][i] = 1;
			}
		}
		int maxval = Integer.MIN_VALUE;
		for (int i = mat.length - 2; i >= 0; i--) {
			for (int j = mat[0].length - 2; j >= 0; j--) {
				if (mat[i][j] == 0) {

				} else
					asf[i][j] = 1 + Math.min(asf[i + 1][j + 1], Math.min(asf[i + 1][j], asf[i][j + 1]));
				if (maxval < asf[i][j])
					maxval = asf[i][j];
			}
		}
		System.out.println(maxval);

	}

	public static void main(String[] args) {
		int[][] mat = { { 1, 0, 1, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1 },
				{ 0, 0, 1, 1, 1, 0 } };
		calSubMatrix(mat);
	}
}
