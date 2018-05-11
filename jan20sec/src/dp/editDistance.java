package dp;

// 3 valid ops --> insert, delete and replace to make string2 similar to string 1
public class editDistance {
	private static int minOps(String first, String scnd, int[][] qb) {
		if (scnd.length() == 0) {
			return first.length();
		} else if (first.length() == 0) {
			return scnd.length();
		}
		if (qb[first.length()][scnd.length()] != 0) {
			return qb[first.length()][scnd.length()];
		}
		char ch = first.charAt(0);
		char ch1 = scnd.charAt(0);
		int min = 0;
		if (ch == ch1) {
			min += minOps(first.substring(1), scnd.substring(1), qb);
		} else {
			int ans = 1 + minOps(first.substring(1), scnd, qb); // delete
			int ans2 = 1 + minOps(first, scnd.substring(1), qb); // insert
			int ans3 = 1 + minOps(first.substring(1), scnd.substring(1), qb); // replace
			min = Math.min(ans, Math.min(ans2, ans3));
		}
		qb[first.length()][scnd.length()] = min;
		return min;
	}

	public static void main(String[] args) {
		String first = "abcd";
		String scnd = "zcgd";
		System.out.println(minOps(first, scnd, new int[first.length() + 1][scnd.length() + 1]));
	}
}
