package dp;

public class rodCutting {
	public static void findPrice(int[] a, int target) {
		int[] cost = new int[a.length];
		int j = 1;
		for (int i = 1; i < a.length; i++) {
			int lum = a[i];
			int left = j;
			int right = i - 1;
			int max = Integer.MIN_VALUE;
			while (left < right) {
				int sum = cost[left] + cost[right];
				left++;
				right--;
				max = Math.max(max, sum);
			}
			int overallmax = Math.max(max, lum);
			cost[i] = overallmax;
		}
		System.out.println(cost[target]);
	}

	public static void main(String[] args) {
		int[] a = { 0, 3, 5, 6, 15, 10, 25, 12, 24 };
		findPrice(a, 8);
	}

}
