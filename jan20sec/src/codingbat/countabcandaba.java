package codingbat;

public class countabcandaba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcxxababa"; // with overlapping
		int h = count(s);
		System.out.println(h);
	}

	public static int count(String s) {
		int c = 0;
		if (s.length() <= 2) {
			return c;
		}
		String first = s.substring(0, 3);
		s = s.substring(1);
		if (first.charAt(0) == 'a' && first.charAt(1) == 'b' && (first.charAt(2) == 'c' || first.charAt(2) == 'a')) {
			c++;
		}
		c = c + count(s);
		return c;
	}
}
