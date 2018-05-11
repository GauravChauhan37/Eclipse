package Strings;

public class compressString {

	public static void main(String[] args) {
		String s = "aaabbaaaccdeeedd";
		compress(s);

	}

	public static void compress(String s) {
		StringBuilder a = new StringBuilder();
		for (int i = 0; i < s.length() - 1; i++) {
			char ch = s.charAt(i);
			char chn = s.charAt(i + 1);
			if (ch != chn) {
				a.append(ch);
			}
		}
		a.append(s.charAt(s.length() - 1));
		System.out.print(a);
	}
}
