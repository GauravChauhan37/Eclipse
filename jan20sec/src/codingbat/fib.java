package codingbat;

public class fib {

	public static void main(String[] args) {
		System.out.println(fibo(0, 1, 0, 5));

	}

	public static int fibo(int start, int last, int total, int n) {
		if (n == 0) {
			return total;
		}
		total = start + last;
		return total = fibo(start = last, last = total, total, n - 1);
		// why this code is working
	}
}
