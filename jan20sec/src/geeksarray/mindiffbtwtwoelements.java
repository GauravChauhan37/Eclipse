package geeksarray;

public class mindiffbtwtwoelements {
	// higher element must be after lower element
	public static void findmin(int[] a) {
		int min = a[0];
		int maxdiff = a[1] - a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] - min > maxdiff) {
				maxdiff = a[i] - min;
			}
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println(maxdiff);
	}

	public static void main(String[] args) {
		int[] a = { 10, 6, 2, 3, 8, 9 };
		findmin(a);
	}

}
