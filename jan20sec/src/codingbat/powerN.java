package codingbat;

public class powerN {

	public static void main(String[] args) {
		System.out.println(power(3, 3, 1));

	}

	public static int power(int base, int n, int var) {
		if (n == 0) {
			return var;
		}
		var *= base;
		return power(base, n - 1, var);
	}
}
