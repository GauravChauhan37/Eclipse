package dp;

public class longestCommonSubs {
	private static int findLongestSub(String first, String scnd, int qb[][]) {
		if (first.length() == 0 || scnd.length() == 0) {
			return 0;
		}
		if (qb[first.length()][scnd.length()] != 0) {
			return qb[first.length()][scnd.length()];
		}
		char ch = first.charAt(0);
		char ch1 = scnd.charAt(0);
		int c = 0;
		if (ch == ch1) {
			c++;
			c += findLongestSub(first.substring(1), scnd.substring(1), qb);
			qb[first.length()][scnd.length()] = c;
		} else {
			int ans = findLongestSub(first.substring(1), scnd, qb);
			int ans2 = findLongestSub(first, scnd.substring(1), qb);
			c = Math.max(ans, ans2);
			qb[first.length()][scnd.length()] = c;
		}
		return qb[first.length()][scnd.length()];
	}

	public static void main(String[] args) {
		String first = "adeg";
		String scnd = "aebg";
		System.out.println(findLongestSub(first, scnd, new int[first.length() + 1][scnd.length() + 1]));
	}
}
