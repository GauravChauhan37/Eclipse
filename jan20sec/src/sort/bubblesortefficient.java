package sort;

public class bubblesortefficient {

	public static void main(String[] args) {
		int[] a = { 10, -1, 500, 600, 2 };
		bb(a, 0, a.length );
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static void bb(int[] a, int start, int end) {
		if (start == end-1) {
			bb(a, 0, end - 1);
			return;
		}
		if (end == 0) {
			return;
		}
		if (a[start + 1] < a[start]) {
			int temp = a[start + 1];
			a[start + 1] = a[start];
			a[start] = temp;
		}
		bb(a, start + 1, end);
	}
}
