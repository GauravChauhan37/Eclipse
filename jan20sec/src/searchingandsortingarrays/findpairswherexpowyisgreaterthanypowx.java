package searchingandsortingarrays;

import java.util.Arrays;

public class findpairswherexpowyisgreaterthanypowx {
	public static int count(int x, int Y[], int n, int NoOfY[]) {
		if (x == 0)
			return 0;
		if (x == 1)
			return NoOfY[0];
		int idx = Arrays.binarySearch(Y, x);
		int ans;
		if (idx < 0) {
			idx = Math.abs(idx + 1);
			ans = Y.length - idx;
		} else {
			while (Y[idx] == x) {
				idx++;
			}
			ans = Y.length - idx;
		}
		ans += (NoOfY[0] + NoOfY[1]);
		if (x == 2)
			ans -= (NoOfY[3] + NoOfY[4]);
		if (x == 3)
			ans += NoOfY[2];

		return ans;
	}

	static int countPairs(int X[], int Y[], int m, int n) {
		int NoOfY[] = new int[5];
		for (int i = 0; i < n; i++)
			if (Y[i] < 5)
				NoOfY[Y[i]]++;
		Arrays.sort(Y);
		int total_pairs = 0; // Initialize result
		for (int i = 0; i < m; i++)
			total_pairs += count(X[i], Y, n, NoOfY);
		return total_pairs;
	}

	public static void main(String args[]) {
		int X[] = { 2, 1, 6 };
		int Y[] = { 1, 5 };

		System.out.println("Total pairs = " + countPairs(X, Y, X.length, Y.length));
	}
}
