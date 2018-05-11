package timenspacecomp;

public class highfreqchar {
	public static void findmaxocc(String s) {
		int[] a = new int[26];
		for (int i = 0; i < s.length(); i++) {
			a[s.charAt(i) - 'a']++;
		}
		int max = a[0];
		char ch = (char) (0 + 'a');
		for (int i = 1; i < a.length - 1; i++) {
			if (a[i + 1] > max) {
				max = a[i + 1];
				ch = (char) (i + 'a');
			}
		}
		System.out.println(max);
		System.out.println(ch);
	}

	public static void main(String[] args) {
		String s = "abcdaba";
		findmaxocc(s);
	}

}
