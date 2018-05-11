package Strings;

public class compressstringwithcount {
	public static void main(String[] args) {
		String s = "aaabbaaaccdeeedd";
		compress(s);

	}

	public static void compress(String s) {
		StringBuilder a = new StringBuilder();
		int count = 1;
		for (int i = 0; i < s.length() - 1; i++) {
			char ch = s.charAt(i);
			char chn = s.charAt(i + 1);
			if (ch != chn) {
				a.append(ch);
				if (count > 1) {
					a.append(count);
				}
				count = 1;
			} else {
				count++;
			}
		}
		a.append(s.charAt(s.length() - 1));
		if (count > 1) {
			a.append(count);
		}
		System.out.print(a);
	}
}
