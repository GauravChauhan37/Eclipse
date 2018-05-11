package geeksarray;

public class nooficsubseqs {
	public static int counteff(int[] a) {
		int count = 1;
		int len = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] < a[i + 1]) {
				count++;
			} else {
				len = len + (count * (count - 1)) / 2;
				count = 1;
			}
		}
		if (count > 1) { // check last one
			len = len + (count * (count - 1)) / 2;
		}
		return len;
	}

	public static int count(int[] a, int count) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length - 1; j++) {
				if (a[j + 1] > a[j]) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 2, 4 };
		System.out.println(count(a, 0));
		System.out.println(counteff(a));
	}

}
