package geeks4geeksbacktracking;

public class equalpartitionofarray {
	// divide array such that it can be divided into given num of subsets of
	// equal sum
	public static boolean check(int[] a, int target, int start, int group) {
		if (group == target) {
			return true;
		}
		if (start == a.length) {
			return false;
		}
		boolean ans = check(a, target, start + 1, group + a[start]);
		boolean ans2 = check(a, target, start + 1, group);
		if (ans == true || ans2 == true) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int[] a = { 2, 1, 4, 5, 6 }; // true
		// int[] a = { 2, 1, 5, 5, 6 }; //false
		int k = 3;
		if (k < 1) {
			System.out.println("true");
			return;
		}
		if (a.length < k) {
			System.out.println("true");
			return;
		}
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		if (sum % k != 0) {
			System.out.println("false");
			return;
		}
		System.out.println(check(a, sum / k, 0, 0));
	}

}
