package codingbat2;

public class splitodd10 {

	public static void main(String[] args) {
		int[] a = { 5, 5, 6 };
		System.out.println(splitArrayHelper(0, a, 0, 0));
	}

	public static boolean splitArrayHelper(int start, int[] nums, int group1, int group2) {
		if (start >= nums.length)
			if (group1 % 10 == 0 && group2 % 2 != 0) {
				return true;
			} else {
				return false;
			}
		if (splitArrayHelper(start + 1, nums, group1 + nums[start], group2))
			return true;

		if (splitArrayHelper(start + 1, nums, group1, group2 + nums[start]))
			return true;

		return false;
	}
}
