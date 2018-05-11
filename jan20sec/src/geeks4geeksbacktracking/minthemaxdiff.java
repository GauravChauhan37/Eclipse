package geeks4geeksbacktracking;

import java.util.ArrayList;

public class minthemaxdiff {
	static ArrayList<Integer> al = new ArrayList<>();

	public static int findiff(int[] b) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < b.length; i++) {
			if (max < b[i]) {
				max = b[i];
			}
		}
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < b.length; i++) {
			if (min > b[i]) {
				min = b[i];
			}
		}
		int diff = max - min;
		return diff;
	}

	public static void mindiff(int[] a, int index) {
		if (index == a.length) {
			int ans = findiff(a);
			al.add(ans);
			return;
		}
		a[index] = a[index] + 6;
		mindiff(a, index + 1);
		a[index] = a[index] - 12;
		mindiff(a, index + 1);
		a[index] = a[index] + 6;
	}

	public static void main(String[] args) {
		int[] a = { 1, 15, 10 }; // 5
		mindiff(a, 0);
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < al.size(); i++) {
			if (al.get(i) < min) {
				min = al.get(i);
			}
		}
		System.out.println(min);
	}

}
