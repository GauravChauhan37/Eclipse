package geeksarray;

import java.util.Arrays;

public class targtesumarray {
	public static boolean findts(int[] a, int targetsum) {
		int i = 0, j = a.length - 1;
		while (i < j) {
			if (a[i] + a[j] == targetsum) {
				return true;
			} else if (a[i] + a[j] > targetsum) {
				j--;
			} else {
				i++;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] a = { 1, 4, 45, 6, 10, -8 };
		Arrays.sort(a);
		int targetsum = 16;
		System.out.println(findts(a, targetsum));
	}

}
