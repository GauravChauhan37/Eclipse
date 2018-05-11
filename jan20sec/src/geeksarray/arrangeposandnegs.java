package geeksarray;

public class arrangeposandnegs {
	public static void arrange(int[] a) {
		// base
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				int temp = a[i];
				for (int j = i; j < a.length - 1; j++) {
					a[j] = a[j + 1];
				}
				a[a.length - 1] = temp;
			}
		}
	}

	public static void main(String[] args) {
		int[] a = { 12, 11, -13, -5, 6, -7, 5, -3, -6 };
		arrange(a);
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + "  ");
	}

}
