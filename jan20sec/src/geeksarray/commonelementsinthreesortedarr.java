package geeksarray;

import org.omg.Messaging.SyncScopeHelper;

public class commonelementsinthreesortedarr {
	public static void findCommon(int[] a, int[] b, int[] c) {
		int i = 0, j = 0, k = 0;
		while (i < a.length && j < b.length && k < c.length) {
			if (a[i] == b[j] && b[j] == c[k]) {
				System.out.print(a[i] + " ");
				i++;
				j++;
				k++;
			} else if (a[i] < b[j]) {
				i++;
			} else if (a[i] == b[j] && a[i] > c[k]) {
				k++;
			} else if (a[i] > a[j]) {
				j++;
			}
		}

	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 4, 5, 6, 7 };
		int[] b = { 2, 3, 6, 8 };
		int[] c = { 1, 2, 3, 4, 5, 6, 7, 8 };
		findCommon(a, b, c);
	}

}
