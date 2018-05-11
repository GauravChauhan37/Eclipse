package recursion;

public class mazepath {
	static int count = 0;

	public static void main(String[] args) {
		// findpath(0, 0, 2, 2, "");
		// findpathwithdiagonals(0, 0, 2, 2, "");
		findpathwithmulmoves(0, 0, 3, 2, "");
	}

	public static void findpath(int srow, int scol, int dr, int dc, String psf) {
		if (srow == dr && scol == dc) {
			System.out.println(psf);
			return;
		}
		if (srow < dr) {
			findpath(srow + 1, scol, dr, dc, psf + "h");
		}
		if (scol < dc) {
			findpath(srow, scol + 1, dr, dc, psf + "v");
		}
	}

	public static void findpathwithdiagonals(int srow, int scol, int dr, int dc, String psf) {
		if (srow == dr && scol == dc) {
			System.out.println(psf);
			return;
		}
		if (srow < dr) {
			findpathwithdiagonals(srow + 1, scol, dr, dc, psf + "h");
		}
		if (scol < dc) {
			findpathwithdiagonals(srow, scol + 1, dr, dc, psf + "v");
		}
		if (scol < dc && srow < dr) {
			findpathwithdiagonals(srow + 1, scol + 1, dr, dc, psf + "d");

		}
	}

	public static void findpathwithmulmoves(int srow, int scol, int dr, int dc, String psf) {
		if (srow == dr && scol == dc) {
			count++;
			System.out.println(psf + " " + count);
			return;
		}
		for (int move = 1; srow + move <= dr; move++) {
			findpathwithmulmoves(srow + move, scol, dr, dc, psf + "h");
		}
		for (int move = 1; scol + move <= dc; move++) {
			findpathwithmulmoves(srow, scol + move, dr, dc, psf + "v");
		}
		for (int move = 1; srow + move <= dr && scol + move <= dc; move++) {
			findpathwithmulmoves(srow + move, scol + move, dr, dc, psf + "d");
		}
	}
}
