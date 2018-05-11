package codingbat;

public class printcharinbrckets {

	public static void main(String[] args) {
		String s = "abc(xyz)123";
		String h = pull(s);
		System.out.println(h);
	}

	public static String pull(String s) {
		if (s.equals("")) {
			return s;
		}
		if (s.charAt(0) == '(') {
			if (s.charAt(s.length() - 1) == ')')
				return s;
			else
				return pull(s.substring(0, s.length() - 1));
		} else {
			return pull(s.substring(1));
		}
	}
}
