package geeksarray;

public class fixedpoint {
	public static int fixedbs(int[] a, int low, int high) {
		if (high < low) {
			return -1;
		}
		int mid = low + (high - low) / 2;
		if (a[mid] == mid) {
			return mid;
		} else if (a[mid] < mid) {
			return fixedbs(a, mid + 1, high);
		} else {
			return fixedbs(a, low, mid - 1);
		}
	}

	public static void fixed(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == i)
				System.out.println(i);
		}
	}

	public static void main(String[] args) {
		int[] a = { -10, 1, 10, 200, 1000 };
		// fixed(a);
		System.out.println(fixedbs(a, 0, a.length - 1));
	}

}
