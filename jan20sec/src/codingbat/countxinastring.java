package codingbat;

public class countxinastring {

	public static void main(String[] args) {
		System.out.println(count("xxhxixx", 0, 0));

	}

	public static int count(String s, int n, int c) {
		if (n == s.length()) {
			return c;
		}
		if (s.charAt(n) == 'x') {
			c++;
		}
		return count(s, n + 1, c);
	}
}
