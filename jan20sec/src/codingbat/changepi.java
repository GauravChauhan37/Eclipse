package codingbat;

public class changepi {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("xpixpi");
		alter(sb, 0);
		System.out.println(sb);

	}

	public static void alter(StringBuilder sb, int n) {
		if (n == sb.length() - 1) {
			return;
		}
		if (sb.charAt(n) == 'p' && sb.charAt(n + 1) == 'i') {
			sb.replace(n, n + 2, "3.14");
		}
		alter(sb, n + 1);
	}
}
