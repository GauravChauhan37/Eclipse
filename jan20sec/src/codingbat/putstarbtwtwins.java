package codingbat;

public class putstarbtwtwins {
	public static void main(String[] args) {
		String s = "helloo";
		String h = alter(s);
		System.out.println(h);
	}

	public static String alter(String s) {
		if (s.length() == 2) {
			if (s.charAt(0) == s.charAt(1)) {
				String l = s.charAt(0) + "*" + s.charAt(1);
				s = s.substring(2);
				return s + l;
			}

		}
		String temp = s.substring(0, 1);
		String temp2 = s.substring(1, 2);
		s = s.substring(2);
		if (temp.equals(temp2)) {
			temp = temp + "*";
		}
		return temp + temp2 + alter(s);
	}
}
