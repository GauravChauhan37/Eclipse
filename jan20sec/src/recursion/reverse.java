package recursion;

public class reverse {

	public static void main(String[] args) {
		int[] a = { 1, 2, 4, 124, 213, 123 };
		int first = 0;
		reverse(a, first);
	}

	public static void reverse(int[] a, int first) {
		if (first == a.length) {
			return;
		}
		reverse (a,first+1);
		System.out.println(a[first]);
	}

}
