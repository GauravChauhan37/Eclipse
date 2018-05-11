package codingbat;

public class nestParenth {
	//ans is wrong debug this 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "a{a[(abcd)]}"; // expec --> true
		System.out.println(paren(s));
	}

	public static Boolean paren(String s) {
		Boolean ch = false;
		if (s.length() == 2) { // still to handle a case
			return true;
		}
		char first = s.charAt(0);
		char last = s.charAt(s.length() - 1);
		if (!(first == '(' || first == '[' || first == '{')) {
			first = s.charAt(1);
		}
		if (!(last == ')' || last == ']' || last == '}')) {
			last = s.charAt(s.length() - 2);
		}
		if (check(first, last)) {
			ch = paren(s.substring(s.indexOf(first) + 1, s.indexOf(last) - 1));
		}
		if (ch) {
			return true;
		} else {
			return false;
		}
	}

	public static Boolean check(char a, char b) {
		if (a == '(' && b == ')') {
			return true;
		} else if (a == '[' && b == ']') {
			return true;
		} else if (a == '{' && b == '}') {
			return true;
		} else {
			return false;
		}

	}
}
