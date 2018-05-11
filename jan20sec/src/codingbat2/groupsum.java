package codingbat2;

public class groupsum {
	public static boolean groupSum(int start, int[] a, int target) {
		if (target == 0) {
			return true;
		}
		if (target < 0 || start == a.length) {
			return false;
		}
		if (groupSum(start + 1, a, target - a[start])) {
			return true;
		} else {
			return groupSum(start + 1, a, target);
		}
	}

	public static void main(String[] args) {
		int[] a = { 2, 9, 4, 9, 2 };
		int start = 0;
		int target = 8;
		System.out.println(groupSum(start, a, target));
	}
}