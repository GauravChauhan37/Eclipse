package codingbat;

public class factorial {

	public static void main(String[] args) {
		int n = 5;
		System.out.println(fact(n, 1));
	}

	public static int fact(int n, int sum) {
		if (n == 0) {
			return sum;
		}
		int total = fact(n - 1, sum);
		sum = total * n;
		return sum;
	}
}
