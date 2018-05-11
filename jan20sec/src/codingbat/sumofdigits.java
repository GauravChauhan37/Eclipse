package codingbat;

public class sumofdigits {

	public static void main(String[] args) {
		System.out.println(sum(126, 0));

	}

	public static int sum(int n, int s) {
		if (n == 0) {
			return s;
		}
		int temp = n % 10;
		s = s + temp;
		return sum(n / 10, s);
	}
}
