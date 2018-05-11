package Backtracking;

public class getPolyval {
	public static int getpoly(int x, int n) {
		int ans = 0;
		int r = n;
		int pow = 1;
		for (int i = r; i >= 1; i--) {
			pow = pow * x;
			ans = ans + (i * pow);
		}
		return ans;
	}

	public static void main(String[] args) {
		int x = 2;
		int n = 3;
		int t = getpoly(x, n);
		System.out.println(t);
	}

}
