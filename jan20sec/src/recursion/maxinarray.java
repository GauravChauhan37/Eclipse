package recursion;

public class maxinarray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 4, 124, 213, 123 };
		int first = a.length - 1;
		int some = maxelement(a, first);
		System.out.println(some);
	}

	public static int maxelement(int[] a, int first) {
		if (first == 0) {
			return a[first];
		}

		int misa = maxelement(a, first - 1);

		if (misa > a[first]) {
			return misa;
		} else {
			return a[first];
		}
	}

}
