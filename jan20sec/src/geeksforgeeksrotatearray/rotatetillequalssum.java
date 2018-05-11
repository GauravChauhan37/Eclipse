package geeksforgeeksrotatearray;

public class rotatetillequalssum {

	public static void main(String[] args) {
		int[] a = { 10, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int sum = findsum(a);
		int currval = rotatesum(a);
		int maxval = currval;
		System.out.println(afterrotation(a, maxval, sum, currval));
	}

	public static int findsum(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		return sum;
	}

	public static int rotatesum(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + (i * a[i]);
		}
		return sum;
	}

	public static int afterrotation(int[] a, int maxval, int sum, int currval) {
		int n = a.length;
		for (int j = 1; j < a.length; j++) {
			currval = currval + sum - n * a[n - j];
			if (currval > maxval) {
				maxval = currval;
			}
		}
		return maxval;
	}
}
