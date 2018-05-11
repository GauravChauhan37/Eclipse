package Strings;

public class Stringbuildertoggle {

	public static void main(String[] args) {
		String s = "abcd";
		toggle(s);
	}

	public static void toggle(String s) {
		StringBuilder a = new StringBuilder(s);
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') {
				char ch = a.charAt(i);
				ch = (char) ((a.charAt(i) - 'a') + 'A');
				a.setCharAt(i, ch);
			} else if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') {
				char ch = a.charAt(i);
				ch = (char) ((a.charAt(i) - 'A') + 'a');
				a.setCharAt(i, ch);
			}
		}
		System.out.print(a);
	}
}
