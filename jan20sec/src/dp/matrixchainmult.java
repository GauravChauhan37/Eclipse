package dp;

public class matrixchainmult {
	public static int countOperations(int[] a, int si, int ei) {
		if (si > ei) {
			return 0;
		}
		if (si + 1 == ei) {
			return 0;
		}

		int ans = Integer.MAX_VALUE;
		for (int cut = si + 1; cut <= ei; cut++) {
			int first = countOperations(a, si, cut);
			int scnd = countOperations(a, cut, ei);
			int prod = a[si] * a[cut] * a[ei];
			int fin = first + scnd + prod;
			if (fin < ans) {
				ans = fin;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50, 60 };
		System.out.println(countOperations(a, 0, a.length - 1));
	}
}
