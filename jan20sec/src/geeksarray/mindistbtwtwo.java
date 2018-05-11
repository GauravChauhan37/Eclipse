package geeksarray;

public class mindistbtwtwo {
	public static void findmindis(int[] a, int x, int y) {
		int i = 0;
		int indexx = 0;
		int indexy = 0;
		int j = 0;
		for (i = 0; i < a.length; i++) {
			if (a[i] == x) {
				indexx = i;
			}
			if (a[i] == y) {
				indexy = i;
			}
		}
		System.out.println(Math.max(indexy - indexx, indexx - indexy));
	}

	public static void main(String[] args) {
		int[] a = { 3, 4, 2, 45, 7, 8 };
		int x = 8;
		int y = 4;
		findmindis(a, x, y);
	}

}
