package geeksarray;

public class unionandinter {
	public static void inter(int[] a, int[] b) {
		int i = 0, j = 0;
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				i++;
			} else if (a[i] > b[j]) {
				j++;
			} else if (a[i] == b[j]) {
				System.out.print(a[i] + " ");
				i++;
				j++;
			}
		}
		
	}

	public static void union(int[] a, int[] b) {
		int i = 0, j = 0;
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				System.out.print(a[i] + " ");
				i++;
			} else if (a[i] > b[j]) {
				System.out.print(b[j] + " ");
				j++;
			} else if (a[i] == b[j]) {
				System.out.print(a[i] + " ");
				i++;
				j++;
			}
		}
		if (i < a.length - 1) {
			for (int k = i; k < a.length; k++) {
				System.out.print(a[k] + " ");
			}
		}
		if (j < b.length - 1) {
			for (int k = j; k < b.length; k++) {
				System.out.print(b[k] + " ");
			}

		}
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		int[] b = { 1, 2,3,4 };
		union(a, b);
		System.out.println();
		inter(a, b);
	}

}
