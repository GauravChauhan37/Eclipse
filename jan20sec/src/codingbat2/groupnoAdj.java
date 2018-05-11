package codingbat2;

public class groupnoAdj {
	public static Boolean groupnoadj(int start, int[] a, int target) {
		if (target == 0)
			return true;
		if (target < 0 || start == a.length)
			return false;
		if (groupnoadj(start + 2, a, target - a[start]))
			return true;
		else
			return groupnoadj(start + 2, a, target);

	}

	public static void main(String[] args) {
		int[] a = { 2, 8, 10, 5 };
		// int[] a = { 2, 8, 5, 10 };
		int start = 0;
		int target = 12;
		System.out.println(groupnoadj(start, a, target));
	}
}
