package codingbat;

public class counthi {

	public static void main(String[] args) {
		System.out.println(count("xhixhixhih", 0, 0));
	}

	public static int count(String s, int n, int c) {
		if (n == s.length() - 1) {
			return c;
		}
		if (s.charAt(n) == 'h' && s.charAt(n + 1) == 'i')
			c++;
		return count(s, n + 1, c);
	}
}
