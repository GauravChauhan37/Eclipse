package dp;

public class knapsack {
	private static int findMaxProfit(int[] prices, int[] wts, int capacity, int[][] mat) {
		for (int r = 0; r < mat.length; r++) {         // r represents index determining weights and prices
			for (int cap = 0; cap < mat[0].length; cap++) {     // col represents capacity
				if (cap == 0) {
					mat[r][cap] = 0;
				} else if (r == 0) {
					if (wts[r] <= cap) {
						mat[r][cap] = prices[r];
					}
				} else {
					int currentweightincluded = Integer.MIN_VALUE;
					if (cap - wts[r] >= 0) {
						currentweightincluded = mat[r - 1][cap - wts[r]] + prices[r];
					}
					int currentweightnotincluded = mat[r - 1][cap] + 0;
					mat[r][cap] = Math.max(currentweightincluded, currentweightnotincluded);
				}
			}
		}
		return mat[mat.length - 1][mat[0].length - 1];
	}

	public static void main(String[] args) {
		int[] prices = { 5, 20, 100, 15, 75 };
		int[] wts = { 2, 4, 6, 2, 1 };
		int capacity = 7;
		int[][] qb = new int[wts.length][capacity + 1];
		System.out.println(findMaxProfit(prices, wts, capacity, qb));
	}
}
