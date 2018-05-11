package dp;

public class countmazepath {
	static int counter = 0;

	public static int findpath(int srow, int scol, int dr, int dc, int[][] qb) {
		if (srow == dr && scol == dc) {
			return 1;
		}
		int c = 0;
		if (qb[srow][scol] != 0) {
			return qb[srow][scol];
		}
		if (srow < dr) {
			c = c + findpath(srow + 1, scol, dr, dc, qb);
		}
		if (scol < dc) {
			c = c + findpath(srow, scol + 1, dr, dc, qb);
		}
		counter++;
		System.out.println(counter + " " + "f( " + srow + " , " + scol + " ) ");
		qb[srow][scol] = c;
		return c;
	}

	public static int findpathiter(int srow, int scol, int dr, int dc) {
		int[][] a = new int[dr + 1][dc + 1];
		a[dr][dc] = 1;
		for (int i = dr; i >= srow; i--) {
			for (int j = dc; j >= scol; j--) {
				if (i + 1 < a.length) {
					a[i][j] = a[i][j] + a[i + 1][j];
				}
				if (j + 1 < a[0].length) {
					a[i][j] = a[i][j] + a[i][j + 1];

				}
			}
		}
		return a[0][0];
	}

	public static int findpatheff(int srow, int scol, int dr, int dc) {
		int[] a = new int[dc];
		for (int i = 0; i < dc; i++) {
			a[i] = 1;
		}
		int temp = 1;
		int nv = 0;
		for (int row = dr - 1; row >= 1; row--) {
			for (int col = a.length - 2; col >= 0; col--) {
				nv = a[col] + a[col + 1] + temp;
				temp = a[col];
				a[col] = nv;
			}
			temp = 1;
		}

		return a[0];
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		// System.out.println(findpath(0, 0, 3, 3, new int[4][4]));
		// System.out.println(findpathiter(0, 0, 3, 3));
		System.out.println(findpatheff(0, 0, 3, 3));
		long end = System.currentTimeMillis();
		System.out.println("time" + "-->");
		System.out.println(end - start);
	}

}
