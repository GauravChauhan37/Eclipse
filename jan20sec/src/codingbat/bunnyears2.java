package codingbat;

public class bunnyears2 {

	public static void main(String[] args) {
		System.out.println(be(5, 0));

	}

	public static int be(int n, int sum) {
		if (n == 0) {
			return sum;
		}
		int total = be(n - 1, sum);
		if (n % 2 != 0) {
			sum = total + 3;
		} else {
			sum = total + 2;
		}
		return sum;
	}
}
