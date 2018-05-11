package dp;

public class lcstab {

	public static void main(String[] args) {
		String first = "abeg";
		String scnd = "adeg";
		int[][] ans = new int[first.length()][scnd.length()];
		int i = 0;
		int j = 0;
		for (int k = 0; k < ans[0].length; k++) {
			if (first.charAt(i) == scnd.charAt(k)) {
				ans[i][k] = 1;
			}
		}
		for (int k = 0; k < ans.length; k++) {
			if (first.charAt(k) == scnd.charAt(j)) {
				ans[k][j] = 1;
			}
		}
		
		for (i = 1; i < first.length(); i++) {
			for (j = 1; j < scnd.length(); j++) {
				if (first.charAt(i) == scnd.charAt(j)) {
					ans[i][j] = Math.max(ans[i][j - 1], ans[i - 1][j]) + 1;
				} else {
					ans[i][j] = Math.max(ans[i][j - 1], ans[i - 1][j]);
				}
			}
		}
		System.out.println(ans[ans.length - 1][ans[0].length - 1]);
	}

}
