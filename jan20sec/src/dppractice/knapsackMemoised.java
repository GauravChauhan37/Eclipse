package dppractice;

public class knapsackMemoised {
	static int maxProfit = Integer.MIN_VALUE;

	private static void greedyAboutProfit(int[] prices, int[] weights, int capacity, int sr, int profit) {
		if (capacity == 0) {
			if (profit > maxProfit) {
				maxProfit = profit;
			}
		}
		if (sr < prices.length) {
			if (capacity - weights[sr] >= 0) {
				greedyAboutProfit(prices, weights, capacity - weights[sr], sr + 1, profit + prices[sr]);
			}
			greedyAboutProfit(prices, weights, capacity, sr + 1, profit);
		}
	}

	public static void main(String[] args) {
		int[] prices = { 5, 20, 100, 15, 75 };
		int[] weights = { 2, 4, 6, 2, 1 };
		greedyAboutProfit(prices, weights, 7, 0, 0);
		System.out.println(maxProfit);
	}
}
