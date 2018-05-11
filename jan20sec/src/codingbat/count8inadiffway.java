package codingbat;

public class count8inadiffway {
	// odd even case not considered
	public static void main(String[] args) {
		System.out.println(count(82381388, 0));

	}

	public static int count(int n, int c) {
		if (n == 0) {
			return c;
		}
		int temp = n % 10;
		if (temp == 8) {
			c++;
		}
		n /= 10;
		int temp2 = n % 10;
		if (temp2 == 8) {
			c++;
		}
		if (temp == temp2) {
			c++;
		}
		return count(n / 10, c);
	}
}
