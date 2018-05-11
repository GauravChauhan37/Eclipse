package recursion;

public class power {

	public static void main(String[] args) {
		int s = power(5, 2);
		System.out.println(s);
	}

	public static int power(int n, int pow) {
		if (pow == 0) {
			return 1;
		}
		int something = n * power(n, pow - 1);
		return something;
	}

}
