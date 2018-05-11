package dp;

public class targetSum {
	private static boolean checkSum(int[] arr, int vidx, int targetSum, Boolean[][] pqb, Boolean[][] nqb) {
		if (vidx == arr.length) {
			if (targetSum == 0) {
				return true;
			}
		}
		if (targetSum >= 0) {
			if (pqb[vidx][targetSum] != null) {
				return pqb[vidx][targetSum];
			}
		} else {
			if (nqb[vidx][-targetSum] != null) {
				return nqb[vidx][-targetSum];
			}
		}

		boolean finalAns = false;
		boolean ans = checkSum(arr, vidx + 1, targetSum - arr[vidx], pqb, nqb);
		boolean ans2 = checkSum(arr, vidx + 1, targetSum, pqb, nqb);

		if (ans == true || ans2 == true)
			finalAns = true;
		else
			finalAns = false;

		if (targetSum >= 0) {
			pqb[vidx][targetSum] = finalAns;
		} else {
			nqb[vidx][-targetSum] = finalAns;
		}
		return finalAns;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60 };
		int target = 70;
		Boolean[][] pqb = new Boolean[arr.length + 1][10000];        
		Boolean[][] nqb = new Boolean[arr.length + 1][10000];
		System.out.println(checkSum(arr, 0, target, pqb, nqb));
	}

}
