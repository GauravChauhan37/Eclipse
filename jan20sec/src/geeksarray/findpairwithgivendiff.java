package geeksarray;

import java.util.Arrays;

public class findpairwithgivendiff {
	public static void findpair(int[] a, int diff) {
		int i = 0;
		int j = 1;
		while (i < a.length && j < a.length) {
			if (a[j] - a[i] == diff) {
				System.out.println(a[i] + " " + a[j]);
				return;
			} else if (a[j] - a[i] < diff) {
				j++;
			} else {
				i++;
			}
		}
	}

	public static void main(String[] args) {
		int[] a = { 5, 10, 1, 20, 6, 40 };
		Arrays.sort(a);
		findpair(a, 9);
	}

}
