package dppractice;

public class knapsackTabulated {
	private static void greedyAboutProfit(int[] prices, int[] weights, int capacity) {
		int[][] mat = new int[weights.length][capacity + 1];
		for (int i = 0; i < mat.length; i++) {
			for (int cap = 0; cap < mat[0].length; cap++) {
				if (cap == 0) {
					mat[i][cap] = 0;
				} else if (i == 0) {
					if (weights[i] <= cap) {
						mat[i][cap] = prices[i];
					}
				} else {
					int weightCurrItemIncl = Integer.MIN_VALUE;
					int weightCurrItemExc;
					if (cap - weights[i] >= 0) {
						weightCurrItemIncl = mat[i - 1][cap - weights[i]] + prices[i];
					}
					weightCurrItemExc = mat[i - 1][cap] + 0;
					mat[i][cap] = Math.max(weightCurrItemExc, weightCurrItemIncl);
				}
			}
		}
		System.out.println(mat[mat.length - 1][mat[0].length - 1]);
	}

	public static void main(String[] args) {
		int[] prices = { 5, 20, 100, 15, 75 };
		int[] weights = { 2, 4, 6, 2, 1 };
		greedyAboutProfit(prices, weights, 7);
	}

}
