package codingbat;

public class check6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 4, 9 };
		Boolean c = array6(a, 0);
		System.out.println(c);
	}

	public static Boolean array6(int[] a, int n) {
		if (n == a.length) {
			return false;
		}
		if (a[n] == 6) {
			return true;
		}
		array6(a, n + 1);
		return false;
	}
}
