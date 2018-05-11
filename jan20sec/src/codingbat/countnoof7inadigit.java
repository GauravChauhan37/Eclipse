package codingbat;

public class countnoof7inadigit {

	public static void main(String[] args) {
		System.out.println(count(71377273, 0));

	}

	public static int count(int n, int c) {
		if (n == 0) {
			return c;
		}
		int temp = n % 10;
		if (temp == 7)
			c++;
		return count(n / 10, c);
	}
}
