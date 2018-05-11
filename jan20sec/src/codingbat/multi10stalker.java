package codingbat;

public class multi10stalker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int[] a = { 1, 20, 20 };
		// int[] a = { 1, 20, 12 };
		int[] a = { 1, 2, 20 };
		System.out.println(check(a, 0));
	}

	public static Boolean check(int[] a, int n) {
		if (n == a.length - 1) {
			return false;
		}
		int temp = a[n];
		if (a[n + 1] == temp * 10) {
			return true;
		}
		return check(a, n + 1);

	}
}
