package codingbat;

public class changextoy {

	public static void main(String[] args) {
		String s = "xxhxixx";
		StringBuilder sb = new StringBuilder(s);
		alter(sb, 0);
		System.out.println(sb);

	}

	public static void alter(StringBuilder sb, int n) {
		if (n == sb.length()) {
			return;
		}
		if (sb.charAt(n) == 'x')
			sb.replace(n, n + 1, "y");
		alter(sb, n + 1);
	}
}
