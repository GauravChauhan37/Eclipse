package geeksarray;

public class replacewithmaxfomright {
	public static void rplacewithright(int[] a) {
		int mfr = a[a.length - 1];
		a[a.length - 1] = -1;
		for (int i = a.length - 2; i >= 0; i--) {
			int temp = a[i];
			a[i] = mfr;
			if (temp > mfr) {
				mfr = temp;
			}
		}
	}

	public static void main(String[] args) {
		int[] a = { 5, 16, 7, 2, 10, 1 };
		rplacewithright(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}
	}

}
