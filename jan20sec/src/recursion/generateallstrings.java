package recursion;

public class generateallstrings {

	public static void main(String[] args) {
		int n = 5;
		binary(n);

	}

	public static void binary(int n) {
		int[] a = new int[n];
		if (n < 1) {
			System.out.println(a);
		} else {
			a[n - 1] = 0;
			binary(n - 1);
			a[n - 1] = 1;
			binary(n - 1);
		}
	}
}
