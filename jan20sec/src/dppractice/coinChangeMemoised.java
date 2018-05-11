package dppractice;

public class coinChangeMemoised {
	static int counter = 0;

	public static int coinChange(int[] coins, int amountToBePaid, int lastIndex, int[][] qb) {
		if (amountToBePaid == 0) {
			return 1;
		}
		if (qb[amountToBePaid][lastIndex] != 0) {
			return qb[amountToBePaid][lastIndex];
		}
		int noOfWays = 0;
		for (int i = lastIndex; i < coins.length; i++) {
			if (amountToBePaid >= coins[i]) {
				// cz value of coins is never negative
				noOfWays += coinChange(coins, amountToBePaid - coins[i], i, qb);
			}
		}
		System.out.println(++counter);
//		 qb[amountToBePaid][lastIndex] = noOfWays;
		return noOfWays;
	}

	public static void main(String[] args) {
		int[] coins = { 2, 3, 5, 6 };
		int target = 20;
		int[][] qb = new int[target + 1][coins.length];
		System.out.println(coinChange(coins, target, 0, qb));
	}

}
