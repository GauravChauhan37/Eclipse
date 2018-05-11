package geeksarray;

public class moveallzeroestoend {
	public static void putAllZeroesAtEnd(int[] a) {
		int start = 0;
		int last = 0;
		while (start < a.length) {
			if (a[start] == 0) {
				start++;
			} else {
				int temp = a[start];
				a[start] = a[last];
				a[last] = temp;
				start++;
				last++;
			}
		}
		for (int p : a) {
			System.out.print(p + " ");
		}
	}

	public static void main(String[] args) {
		int[] a = { 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, };
		putAllZeroesAtEnd(a);
	}

}
