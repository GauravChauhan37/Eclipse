package codingbat2;

public class adjSum {

	public static boolean groupSumClump(int start, int[] nums, int target) {
		return groupClump2(start, nums, target, 0);
	}

	// sum clump ka kr re hain ek sath
	public static boolean groupClump2(int vidx, int[] arr, int total, int setsum) {
		if (vidx == arr.length)
			return total == setsum;

		int oidx = vidx + 1;
		while (oidx < arr.length && arr[vidx] == arr[oidx])
			oidx++;

		oidx--;

		int mySum = (oidx - vidx + 1) * arr[vidx];

		boolean ans1 = groupClump2(oidx + 1, arr, total, setsum + mySum);
		boolean ans2 = groupClump2(oidx + 1, arr, total, setsum);

		return ans1 || ans2;
	}

	public static void main(String[] args) {
		int[] a = { 4, 2, 2, 2, 9, 4 }; // either include all adj twins or
										// include twins
		int start = 0;
		int target = 8;
		System.out.println(groupSumClump(start, a, target));
	}

}
