package Backtracking;

import java.util.ArrayList;

public class targetsumstring {
	public static void printtargetal(int[] a, int target, int start, ArrayList<Integer> s, int sumofset) {
		if (target == sumofset) {
			System.out.println(s);
			return;
		}
		if (start < a.length) {
			s.add(a[start]);
			printtargetal(a, target, start + 1, s, sumofset + a[start]);
			int index = s.size() - 1;
			s.remove(index);
			printtargetal(a, target, start + 1, s, sumofset);
		}
	}

	public static void printtarget(int[] a, int target, int start, String s, int sumofset) {
		if (target == sumofset) {
			System.out.println(s);
			return;
		}
		if (start >= a.length) {
			return;
		}
		printtarget(a, target, start + 1, s + a[start], sumofset + a[start]);
		printtarget(a, target, start + 1, s, sumofset);

	}

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50 };
		// printtarget(a, 60, 0, "", 0);
		printtargetal(a, 60, 0, new ArrayList<>(), 0);
	}

}
