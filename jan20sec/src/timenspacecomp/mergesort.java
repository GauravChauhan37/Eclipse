package timenspacecomp;

public class mergesort {
	public static int[] mergesort(int[] a, int low, int high) {
		if (low == high) {
			int[] result = new int[1];
			result[0] = a[low];
			return result;
		}
		int mid = (high + low) / 2;
		int[] one = mergesort(a, low, mid);
		int[] two = mergesort(a, mid + 1, high);
		return mergesortedarrays(one, two);
	}

	public static int[] mergesortedarrays(int[] one, int[] two) {
		int i = 0, j = 0;
		int k = 0;
		int[] three = new int[one.length + two.length];
		while (i < one.length && j < two.length) {
			if (one[i] <= two[j]) {
				three[k] = one[i];
				i++;
			} else {
				three[k] = two[j];
				j++;
			}
			k++;
		}
		for (int in = i; in < one.length; in++) {
			three[k] = one[in];
			k++;
		}
		for (int in = j; in < two.length; in++) {
			three[k] = two[in];
			k++;
		}
		return three;
	}

	public static void main(String[] args) {
		int[] result = { 1, 23, 12, 3, 4, 12, -1,8 };
		result = mergesort(result, 0, result.length - 1);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

}
