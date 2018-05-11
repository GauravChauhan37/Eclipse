import functions.arrayr;;

public class shellyrotate {

	public static void main(String[] args) {
		int[][] a = { { 11, 12, 13, 14, 15, 16 }, { 21, 22, 23, 24, 25, 26 }, { 31, 32, 33, 34, 35, 36 },
				{ 41, 42, 43, 44, 45, 46 }, { 51, 52, 53, 54, 55, 56 }, { 61, 62, 63, 64, 65, 66 }, };
		int shellno = 2;
		int rotatenum = 3;
		int cmin = shellno - 1, rmin = shellno - 1;
		int rmax = a.length - shellno;
		int cmax = a[0].length - shellno;
		int total = 2 * (rmax - rmin + cmax - cmin);
		int[] arr = new int[total];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		fill(a, arr, rotatenum, shellno, cmin, cmax, rmin, rmax);
		rotate(arr, rotatenum);
		fill2(a, arr);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void fill(int a[][], int arr[], int rotatenum, int shellno, int cmin, int cmax, int rmin, int rmax) {
		int p = 0;
		int total = 2 * (rmax - rmin + cmax - cmin);
		for (int i = rmin; p <= total && i <= rmax; i++) {
			arr[p] = a[i][cmin];
			p++;
		}
		cmin++;
		for (int j = cmin; p <= total && j <= cmax; j++) {
			arr[p] = a[rmax][j];
			p++;
		}
		rmax--;
		for (int k = rmax; p <= total && k >= rmin; k--) {
			arr[p] = a[k][cmax];
			p++;
		}
		cmax--;
		for (int l = cmax; p <= total && l >= cmin; l--) {
			arr[p] = a[rmin][l];
			p++;
		}
		rmin++;
	}

	public static void rotate(int arr[], int rotatenum) {
		arrayr.reverse(arr, 0, arr.length - rotatenum - 1);
		arrayr.reverse(arr, arr.length - rotatenum, arr.length - 1);
		arrayr.reverse(arr, 0, arr.length - 1);
	}

	public static void fill2(int a[][], int arr[]) {
		int shellno = 2;
		int cmin = shellno - 1, rmin = shellno - 1;
		int rmax = a.length - shellno;
		int cmax = a[0].length - shellno;
		int p = 0;
		int total = 2 * (rmax - rmin + cmax - cmin);
		for (int i = rmin; p <= total && i <= rmax; i++) {
			a[i][cmin] = arr[p];
			p++;
		}
		cmin++;
		for (int j = cmin; p <= total && j <= cmax; j++) {
			a[rmax][j] = arr[p];
			p++;
		}
		rmax--;
		for (int k = rmax; p <= total && k >= rmin; k--) {
			a[k][cmax] = arr[p];
			p++;
		}
		cmax--;
		for (int l = cmax; p <= total && l >= cmin; l--) {
			a[rmin][l] = arr[p];
			p++;
		}
		rmin++;
	}
}
