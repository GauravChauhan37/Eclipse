package codingbat2;

public class groupSum5 {
	public static Boolean check(int start, int[] a) {
		for (int i = start; i < a.length; i++) {
			if (a[i] % 5 == 0)
				return false;
		}
		return true;
	}

	public static boolean groupSum5(int start, int[] a, int target) {
		if (target == 0 && start < a.length && (check(start, a)))
			return true;
		if (target < 0 || start == a.length)
			return false;
		if (groupSum5(start + 1, a, target - a[start]))
			return true;
		else
			return groupSum5(start + 1, a, target);
	}

	public static void main(String[] args) {
		int[] a = { 2, 5, 10, 9, 5 };
		int start = 0;
		int target = 17;
		System.out.println(groupSum5(start, a, target));
	}

}
