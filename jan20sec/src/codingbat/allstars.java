package codingbat;

public class allstars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello";
		String h = all(s);
		System.out.println(h);
	}

	public static String all(String s) {
		if (s.length() == 1) {
			return s;
		}
		String first = s.substring(0, 1);
		first = first + "*";
		s = s.substring(1);
		s = first + all(s);
		return s;
	}
}
