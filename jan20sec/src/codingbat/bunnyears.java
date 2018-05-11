package codingbat;

public class bunnyears {

	public static void main(String[] args) {
		int n = 5;
		System.out.println(be(n, 0));

	}

	public static int be(int n, int total) {
		if (n == 0) {
			return total;
		}
		int tsf = be(n - 1, total);
		total = tsf + 2;
		return total;
	}
}
