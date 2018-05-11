package dppractice;

public class coinChangeTabulated {
	public static void coinChange(int[] coins, int target) {
		int[] qb = new int[target + 1];
		qb[0] = 1;
		qb[1] = 0;
		for (int i = 0; i < coins.length; i++) {   // for permutation reverse position of both loops
			for (int j = coins[i]; j < qb.length; j++) {
				qb[j] += qb[j - coins[i]];
			}
		}
		System.out.println(qb[target]);
	}

	public static void main(String[] args) {
		int[] coins = { 2, 3, 5, 6 };
		coinChange(coins, 10);
	}

}
