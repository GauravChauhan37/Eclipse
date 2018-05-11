package dppractice;
public class longestIncSubMemoised {
	public static int findLong(int[] arr, int vidx) {
		if (vidx == 0) {
			return 0;
		}
		if (vidx > 0) {
			int currmax = arr[vidx];
			int count = 0;
			for (int i = 0; i < vidx; i++) {
				if (currmax < arr[i]) {
			// left
				}
			}
			return count;
		}
		int max = 0;
		if (vidx < arr.length) {
			int ans = 1 + findLong(arr, vidx + 1);
			if (max < ans) {
				max = ans;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] a = { 10, 22, 9, 33, 21, 50, 41, 60, 80, 11, 12, 13, 14, 15, 16, 17 };
		System.out.println(findLong(a, -1));
	}
}
