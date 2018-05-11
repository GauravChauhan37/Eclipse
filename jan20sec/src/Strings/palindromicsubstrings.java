package Strings;

public class palindromicsubstrings {
	public static void main(String[] args) {
		String s = "nitin";

		for (int start = 0; start <= s.length(); start++) {
			for (int end = start + 1; end <= s.length(); end++) {

				int flag = 0;
				int i = 0, j = s.length() - 1;
				while (i <= j) {
					if (s.charAt(i) == s.charAt(j)) {
						flag = 1;
					}
					i++;
					j--;
				}
				if (flag == 1) {
					System.out.println(s.substring(start, end));
				}
			}
		}
	}
}