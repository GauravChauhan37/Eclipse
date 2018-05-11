package Backtracking;

import java.util.ArrayList;

public class equisets {
	public static void equal(int[] a, int start, ArrayList<Integer> s1, ArrayList<Integer> s2, int sumset1,
			int sumset2) {
		if (start == a.length) {
			if (sumset1 == sumset2) {
				System.out.println(s1 + "   " + s2);
				System.out.println();
			}
			return;
		}
		s1.add(a[start]);
		equal(a, start + 1, s1, s2, sumset1 + a[start], sumset2);
		s1.remove(s1.size() - 1);
		s2.add(a[start]);
		equal(a, start + 1, s1, s2, sumset1, sumset2 + a[start]);
		s2.remove(s2.size() - 1);
	}

	public static void equ(int[] a, int start, String set1, String set2, int sumset1, int sumset2) {
		if (sumset1 == sumset2) {
			System.out.println(set1);
			System.out.println(set2);
			System.out.println();
		}
		if (start >= a.length) {
			return;
		}
		equ(a, start + 1, set1 + a[start], set2, sumset1 + a[start], sumset2);
		equ(a, start + 1, set1, set2 + a[start], sumset1, sumset2 + a[start]);
	}

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50, 60, 70 };
		// equ(a, 0, "", "", 0, 0);
		equal(a, 0, new ArrayList<>(), new ArrayList<>(), 0, 0);
	}

}
