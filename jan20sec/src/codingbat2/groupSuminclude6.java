package codingbat2;

public class groupSuminclude6 {
// ek boolean utha le aur uska false krhle
	public static boolean groupSum6(int start, int[] a, int target) {
		if (target == 0) {
			return true;
		}
		if (target < 0 || start == a.length) {
			return false;
		}
		if (a[start] == 6) {
			return groupSum6(start + 1, a, target - a[start]);
		}
		if (groupSum6(start + 1, a, target - a[start])) {
			return true;
		}
		return groupSum6(start + 1, a, target);
	}

	public static void main(String[] args) {
		int[] a = { 2, 2, 2, 9, 4 }; // condn --> 6 must be the part of the ans
		// int[] a = { 2, 4, 9, 6 };
		int start = 0;
		int target = 10;
		System.out.println(groupSum6(start, a, target));
	}
}
