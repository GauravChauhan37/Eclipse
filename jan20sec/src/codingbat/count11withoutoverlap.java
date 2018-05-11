package codingbat;

public class count11withoutoverlap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "111";
	System.out.println(	count(s));
	}

	public static int count(String s) {
		int c = 0;
		if (s.length() <= 1) {
			return c;
		}
		String first = s.substring(0, 2);
		s = s.substring(2);
		if (first.charAt(0) == '1' && first.charAt(1) == '1') {
			c++;
		}
		c = c + count(s);
		return c;
	}
}
