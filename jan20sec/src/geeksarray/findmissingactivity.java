package geeksarray;

public class findmissingactivity {
	public static void findusingxor(int[] a) {
		int x1 = 0, x2 = 0;
		int n = a.length + 1;
		for (int i = 0; i < a.length; i++) {
			x1 = x1 ^ a[i]; // arrray xor
		}
		for (int i = 1; i <= n; i++) {
			x2 = x2 ^ i; // natural no xor
		}
		int ans = x1 ^ x2; // final xor will give the ans
		System.out.println(ans);
	}

	// O(n)
	public static void find(int[] a) {
		int n = a.length + 1;
		int total = (n * (n + 1)) / 2;
		for (int i = 0; i < a.length; i++) {
			total -= a[i];
		}
		System.out.println(total);
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 7, 6, 4 };
		// find(a);
		findusingxor(a);
	}

}
