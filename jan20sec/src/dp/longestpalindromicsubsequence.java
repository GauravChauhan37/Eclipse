package dp;

public class longestpalindromicsubsequence {

	private static int findLongestPalinSub(String s, int si, int ei, int[][] qb) {
		if (si == ei) {
			return 1;
		} else if (si > ei) {
			return 0;
		}
		if (qb[si][ei] != 0) {
			return qb[si][ei];
		}
		int count = 0;
		if (s.charAt(si) == s.charAt(ei)) {
			count += 2;
			count += findLongestPalinSub(s, si + 1, ei - 1, qb);
		} else {
			int ans = findLongestPalinSub(s, si + 1, ei, qb);
			int ans2 = findLongestPalinSub(s, si, ei - 1, qb);
			count = Math.max(ans, ans2);
		}
		qb[si][ei] = count;
		return count;
	}

	public static void main(String[] args) {
		String s = "abcgbbca";
		System.out.println(findLongestPalinSub(s, 0, s.length() - 1, new int[s.length()][s.length()]));
	}
}
