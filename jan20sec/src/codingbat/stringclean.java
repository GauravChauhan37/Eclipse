package codingbat;

public class stringclean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aaabbbccd";
		String h = clean(s);
		System.out.println(h);
	}

	public static String clean(String s) {
		if (s.length() < 2) {
			return s;
		}
		if (s.charAt(0) == s.charAt(1)) {
			return clean(s.substring(1));
		} else {
			return s.charAt(0) + clean(s.substring(1));
		}
	}
}