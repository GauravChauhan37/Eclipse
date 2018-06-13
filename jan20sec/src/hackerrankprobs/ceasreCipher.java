package hackerrankprobs;

public class ceasreCipher {
	public static String caesarCipher(String s, int k) {
		k = k % 26;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				char ch = s.charAt(i);
				int num = ch;
				num = num + k;
				if (num > 122) {
					int diff = num - 122;
					num = 97 + diff - 1;
				}
				ch = (char) (num);
				String first = s.substring(0, i);
				String scnd = s.substring(i + 1);
				s = first + ch + scnd;
			}
		}
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				char ch = s.charAt(i);
				int num = ch;
				num = num + k;
				if (num > 90) {
					int diff = num - 90;
					num = 65 + diff - 1;
				}
				ch = (char) (num);
				String first = s.substring(0, i);
				String scnd = s.substring(i + 1);
				s = first + ch + scnd;
			}
		}
		return s;
	}

	public static void main(String[] args) {
		String s = caesarCipher("www.abc.xy", 87);
		System.out.println(s);
	}

}
