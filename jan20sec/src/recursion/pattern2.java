package recursion;

public class pattern2 {

	public static void main(String[] args) {
		int n = 5;
		int i = 0;
		pattern(n, i);
	}

	public static void pattern(int n, int i) {
		if (n == i) {
			return;
		}
		pattern(n, i + 1);
		print(n, i);
		System.out.println();
	}

	public static void print(int n, int i) {
		if (i == n) {
			return;
		}
		print(n, i + 1);
		System.out.print("*" + " ");
	}
}
