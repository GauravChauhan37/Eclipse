package practice;

public class checkrotate {

	public static void main(String[] args) {
		// is one array rotation of other
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		int[] b = { 4, 5, 6, 7, 1, 2, 3 };
		int first = a[0];
		int index = degreeofrot(b, first);
		rotate(a, index);
		System.out.println(check(a, b));
	}

	public static int degreeofrot(int[] b, int first) {
		int index = 0;
		for (int i = 0; i < b.length; i++) {
			if (b[i] == first) {
				index = i;
			}
		}
		return index;
	}

	public static void rotate(int[] a, int index) {
		rev(a, 0, a.length - 1 - index);
		rev(a, a.length - index, a.length - 1);
		rev(a, 0, a.length - 1);
	}

	public static void rev(int[] a, int first, int last) {
		while (first < last) {
			int temp = a[first];
			a[first] = a[last];
			a[last] = temp;
			first++;
			last--;
		}
	}

	public static boolean check(int[] a, int[] b) {
		int i, j;
		for (i = 0, j = 0; i < a.length; i++, j++) {
			if (a[i] != b[j]) {
				return false;
			}
		}
		return true;
	}
}
