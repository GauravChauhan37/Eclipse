package recursion;

public class fact {

	public static void main(String[] args) {
		int s = fact(5);
		System.out.println(s);
	}

	public static int fact(int n) {
		if (n == 0) {
			return 1;
		}
		int something = n * fact(n - 1);
		return something;
	}
}
