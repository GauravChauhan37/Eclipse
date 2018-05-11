package codingbat2;

public class split53 {

	public static void main(String[] args) {
		int[] a = { 2, 4, 2 };
		System.out.println(splitArrayHelper(0, a, 0, 0));
	}

	public static boolean splitArrayHelper(int start, int[] nums, int group1, int group2) {
		if (start >= nums.length)
			return group1 == group2;
		if (nums[start] % 5 == 0 && nums[start] % 3 != 0) {
			if (splitArrayHelper(start + 1, nums, group1 + nums[start], group2)) {
				return true;
			}
		} else
			return splitArrayHelper(start + 1, nums, group1, group2);

		if (nums[start] % 5 != 0 && nums[start] % 3 == 0) {
			if (splitArrayHelper(start + 1, nums, group1, group2 + nums[start])) {
				return true;
			}
		} else
			return splitArrayHelper(start + 1, nums, group1, group2);

		return false;
	}
}
