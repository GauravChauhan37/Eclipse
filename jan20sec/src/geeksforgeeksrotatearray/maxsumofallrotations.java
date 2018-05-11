package geeksforgeeksrotatearray;

public class maxsumofallrotations {

	public static void main(String[] args) {
		int[] a = { 8, 3, 1, 2 };
		int sum = findsum(a);
		int currval = rotatesum(a);
		maxofallsum(a, sum, currval);
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

	public static void maxofallsum(int[] a, int sum, int currval) {
		int maxval = 0;
		int nextval;
		int n = a.length;
		for (int i = 1; i < n; i++) {
			nextval = currval + sum - (n * a[n - i]); // dryrun this line to
														// understand
			/*
			 * currval is sum of array with 0 rotation and sum is sum of its
			 * digits , then we check that length - i --> i.e. on this index of array
			 * is it the max if yes then it becomes max, else we go to next
			 * iteration
			 */
			currval = nextval;
			if (maxval < nextval) {
				maxval = nextval;
			}
		}
		System.out.println(maxval);
	}

}
