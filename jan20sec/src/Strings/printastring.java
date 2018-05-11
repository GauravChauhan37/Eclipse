package Strings;

public class printastring {

	public static void main(String[] args) {
		String s = "Gaurav";
		printchars(s);

	}

	public static void printchars(String s) {
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}

	}

}
