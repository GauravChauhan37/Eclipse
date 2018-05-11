package dp;

public class fib {
	static int count = 0;

	public static int fib(int n, int[] qb) {
		if (n == 0 || n == 1) {
			return n;
		}
		if (qb[n] != 0) {
			return qb[n];
		}
		int fn1 = fib(n - 1, qb);
		int fn2 = fib(n - 2, qb);
		int fn = fn1 + fn2;
		qb[n] = fn;
		count++;
		System.out.println(count);
		return fn;
	}

	public static int fibiterative(int n) {
		int[] f = new int[n + 1];
		f[0] = 0;
		f[1] = 1;
		for (int x = 2; x < f.length; x++) {
			f[x] = f[x - 1] + f[x - 2];
		}
		return f[n];
	}

	public static int fibiconst(int n) {
		int[] a = new int[2];
		a[0] = 0;
		a[1] = 1;
		for (int slidecount = 1; slidecount < n; slidecount++) {
			int temp = a[0] + a[1];
			a[0] = a[1];
			a[1] = temp;
		}
		return a[1];
	}

	public static void main(String[] args) {
		int n = 10;
		// System.out.println("ans" + " " + fib(n, new int[n + 1]));
//		 System.out.println(fibiterative(n)); 
		System.out.println(fibiconst(n));
	}

}
